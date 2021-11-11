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

	public List<Dept> selectByHashMap(HashMap<String, Integer> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectByHashMap(session, map);
		}finally {
			session.close();
		}
		return list;
	}

	public List<Dept> selectDynamicDeptno(HashMap<String, Integer> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectDynamicDeptno(session, map);
		}finally {
			session.close();
		}
		return list;
	}

	public List<Dept> selectDynamicChoose(HashMap<String, String> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectDynamicChoose(session, map);
		}finally {
			session.close();
		}
		return list;
	}

	public List<Dept> multiSelect(List<Integer> deptnoes) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.multiSelect(session, deptnoes);
		}finally {
			session.close();
		}
		return list;
	}

	public void multiUpdate(List<Integer> deptnoes2) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.multiUpdate(session, deptnoes2);
			session.commit();
		}finally {
			session.close();
		}
	}

	public void multiDelete(List<Dept> depts) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.multiDelete(session, depts);
			session.commit();
		}finally {
			session.close();
		}
	}
	
	public void multiInsert(List<Dept> depts) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.multiInsert(session, depts);
			session.commit();
		}finally {
			session.close();
		}
	}
}
