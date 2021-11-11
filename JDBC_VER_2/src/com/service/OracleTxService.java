package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleTxDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTxService {
	OracleTxDAO dao;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";

	public OracleTxService() {
		super();
		dao = new OracleTxDAO();
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Dept> select() throws SQLException {
		ArrayList<Dept> list = null;
		Connection con = null;

		con = DriverManager.getConnection(url, userid, passwd);
		list = dao.select(con);

		if (con != null)
			con.close();

		return list;
	}
	
	public void delete(int i) {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.delete(con, i);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void insert(Dept d) {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.insert(con, d);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void update(Dept d) throws RecordNotFoundException {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.update(con, d);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
