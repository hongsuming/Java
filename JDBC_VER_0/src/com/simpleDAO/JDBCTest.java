package com.simpleDAO;

public class JDBCTest {

	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		dao.selectAllDept();
		dao.insertDept(new DeptDTO(99, "서울", "부산"));
		dao.selectAllDept();

	}
}
