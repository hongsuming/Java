package com.service;

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

	public List<EmpDTO> select() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<EmpDTO> list = null;
		try {
			list = dao.select(session);
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

}
