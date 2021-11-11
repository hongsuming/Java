package com.service;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleDAO;
import com.dto.Dept;
public class OracleService {

	OracleDAO dao;
	
	public OracleService() {
		dao = new OracleDAO();
	}
	
	public ArrayList<Dept> select() throws SQLException{
		ArrayList<Dept> list = dao.select();
		return list;
	}

	public int delete(int i) {
		return dao.delete(i);
	}

	public void insert(Dept dept) {
		dao.insert(dept);
	}
	
	public void update(Dept dept) throws ReflectiveOperationException {
		dao.update(dept);
	}
	

}
