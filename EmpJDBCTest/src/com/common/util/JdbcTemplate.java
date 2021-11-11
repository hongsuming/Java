package com.common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTemplate {
	
	public static String driver = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static String userid = "scott";
	public static String passwd = "tiger";
	
	public JdbcTemplate() {
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {e.printStackTrace();}
	}
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			con.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("[jdbcTemplate.getConnection] :"+e.getMessage());
			e.printStackTrace();
		}
		return con;
	}
	public static boolean isConnected(Connection con) {
		boolean validConnection = true;
		try {
			if(con==null || con.isClosed()) validConnection=false;
		} catch (Exception e) {
			validConnection=false;
			e.printStackTrace();
		}
		return validConnection;
	}
	public static void close(Connection con) {
		if(isConnected(con)) {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void close(Statement stmt) {
		try {
			if(stmt!=null)stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rs) {
		try {
			if(rs!=null)rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void commit(Connection con) {
		try {
			if(isConnected(con)) {
				con.commit();
				System.out.println("[JdbcTemplate.commit] : DB Successfully Committed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void rollback(Connection con) {
		try {
			if(isConnected(con)) {
				con.rollback();
				System.out.println("[JdbcTemplate.commit] : DB Successfully Rollbacked");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
