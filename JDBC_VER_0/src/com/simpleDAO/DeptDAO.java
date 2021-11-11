package com.simpleDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String userid ="scott";
	String passwd ="tiger";
	
	public DeptDAO() {
		super();
		try {
			Class.forName(driver);
			System.out.println("db 연결 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void selectAllDept() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con=DriverManager.getConnection(url, userid, passwd);
			String sql="select deptno x, dname, loc from dept";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
//			List<DeptDTO> list = new ArrayList<>(); 
			while(rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(deptno+"\t"+dname+"\t"+loc);
//				list.add(new DeptDTO(deptno, dname, loc));
			}
//			System.out.println(list);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public int insertDept(DeptDTO dept) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into dept values(?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			num = pstmt.executeUpdate();
			System.out.println(num+"개 행이 삽입되었습니다.");
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
}
