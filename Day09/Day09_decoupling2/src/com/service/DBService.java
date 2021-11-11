package com.service;

import com.dao.DBDAO;
import com.dao.MySQLDAO;
import com.dao.OracleDAO;

public class DBService {
	
	public void setDAO(DBDAO dao) {
		dao.connect();
	}

}
