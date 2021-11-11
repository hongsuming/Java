package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;

public class OracleDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";

	public OracleDAO() {
		super();
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Dept> select() throws SQLException {
		ArrayList<Dept> list = new ArrayList<Dept>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		con = DriverManager.getConnection(url, userid, passwd);
		String sql = "select*from dept";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			int deptno = rs.getInt(1);
			String dname = rs.getString(2);
			String loc = rs.getString(3);
			list.add(new Dept(deptno, dname, loc));
		}

		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();

		return list;
	}

	public int delete(int i) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int num=0;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "delete from dept where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, i);
			num = pstmt.executeUpdate();
//			System.out.println(num+"개 행이 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return num;
	}

	public void insert(Dept dept) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into dept values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			int num = pstmt.executeUpdate();
			System.out.println(num+"개 행이 삽입 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void update(Dept dept) throws ReflectiveOperationException{
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con=DriverManager.getConnection(url, userid, passwd);
			String sql = "update dept set dname=?, loc=? where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(3, dept.getDeptno());
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			int num = pstmt.executeUpdate();
			if(num==0) {
				throw new ReflectiveOperationException(dept.getDeptno()+"는 없는 부서번호 입니다.");
			}
			System.out.println(num+"개 행이 변경 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
