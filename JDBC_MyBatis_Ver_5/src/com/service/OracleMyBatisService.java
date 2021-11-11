package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisService {
	OracleMyBatisDAO dao;

	public OracleMyBatisService() {
		dao = new OracleMyBatisDAO();
	}

	public void insert(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.insert(session, dept);
			session.commit();
		} finally {
			session.close();
		}
	}

	public List<Dept> selectAll() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		}finally {
			session.close();
		}
		return list;
	}

	public void update(Dept dept) throws RecordNotFoundException {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.update(session, dept);
			session.commit();
		}finally {
			session.close();
		}
	}

	public Dept selectByDeptno(int deptno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		Dept dept = null;
		try {
			dept = dao.selectByDeptno(session, deptno);
		}finally {
			session.close();
		}
		return dept;
	}


	public void delete(int i) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.delete(session, i);
			session.commit();
		}finally {
			session.close();
		}
	}

	public int deptRecordCount() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int count=0;
		try {
			count=dao.deptRecordCount(session);
		}finally {
			session.close();
		}
		return count;
	}

	public HashMap selectByDeptnoHashMap(int deptno) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		HashMap map = null;
		try {
			map = dao.selectByDeptnoHashMap(session, deptno);
		}finally {
			session.close();
		}
		return map;
	}

}
