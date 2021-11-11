package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {
	EmpDAO dao;

	public EmpService() {
		dao = new EmpDAO();
	}

	public List<EmpDTO> select(String searchName, String searchValue) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("searchName", searchName);
		map.put("searchValue", searchValue);
		List<EmpDTO> list = null;
		try {
			list = dao.select(session, map);
		}finally {
			session.close();
		}
		return list;
	}

	public int insert(EmpDTO dto) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int n = 0;
		try {
			n = dao.insert(session, dto);
			session.commit();
		}finally {
			session.close();
		}
		return n;
	}

	public EmpDTO retrive(int empno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		EmpDTO dto = null;
		try {
			dto = dao.retrive(session, empno);
		}finally {
			session.close();
		}
		return dto;
	}

	public int update(EmpDTO dto) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			n = dao.update(session, dto);
			session.commit();
		}finally {
			session.close();
		}
		return n;
	}

	public int delete(int empno) {
		int n = 0;
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			n = dao.delete(session, empno);
			session.commit();
		}finally {
			session.close();
		}
		return n;
	}

}
