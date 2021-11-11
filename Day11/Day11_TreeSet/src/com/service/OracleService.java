package com.service;

import java.util.Set;

import com.dao.OracleDAO;

public class OracleService {

	OracleDAO dao;
	
	public OracleService() {
		dao=new OracleDAO(); // 사용할 클래스의 객체 생성을 동시에 함
	}
	
	public Set<String> select(){
		return dao.select();
	}

}
