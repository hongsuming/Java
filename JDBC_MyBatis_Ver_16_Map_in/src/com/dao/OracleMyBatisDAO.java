package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {

	public List<Dept> selectAll(SqlSession session) {
		List<Dept> list = session.selectList("selectAll");
		return list;
	}
	
	public List<Dept> selectAll2(SqlSession session) {
		List<Dept> list = session.selectList("selectAll2");
		return list;
	}

	public List<Dept> multiSelectMap(SqlSession session, HashMap<String, Integer> map) {
		List<Dept> list = session.selectList("multiSelectMap", map);
		return list;
	}

}
