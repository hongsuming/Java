package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTxDAO {

	public OracleTxDAO() {
	}

	public ArrayList<Dept> select(Connection con) throws SQLException {
		ArrayList<Dept> list = new ArrayList<Dept>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select*from dept";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			int deptno = rs.getInt(1);
			String dname = rs.getString(2);
			String loc = rs.getString(3);
			System.out.println(deptno + "\t" + dname + "\t" + loc);
			list.add(new Dept(deptno, dname, loc));
		}
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		return list;
	}

	public void delete(Connection con, int i) {
		PreparedStatement pstmt = null;
		try {
			String sql = "delete from dept where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, i);
			int num = pstmt.executeUpdate();
			System.out.println(num+"개 행이 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void insert(Connection con, Dept d) {
		PreparedStatement pstmt = null;
		
		try {
			String sql ="insert into dept values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, d.getDeptno());
			pstmt.setString(2, d.getDname());
			pstmt.setString(3, d.getLoc());
			int num = pstmt.executeUpdate();
			System.out.println(num+"개 행이 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void update(Connection con, Dept d) throws RecordNotFoundException{
		PreparedStatement pstmt = null;
		
		try {
			String sql = "update dept set dname=?, loc=? where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, d.getDname());
			pstmt.setString(2, d.getLoc());
			pstmt.setInt(3, d.getDeptno());
			int num = pstmt.executeUpdate();
			if(d.getDeptno()==0) {
				throw new RecordNotFoundException(d.getDeptno()+"사원번호 레코드가 존재하지 않습니다.");
			}
			System.out.println(num+"개 행이 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
