package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {

	public List<EmpDTO> select(SqlSession session, HashMap<String, String> map) {
		return session.selectList("selectAll", map);
	}

	public int insert(SqlSession session, EmpDTO dto) {
		return session.insert("insert", dto);	
	}

	public EmpDTO retrive(SqlSession session, int empno) {
		return session.selectOne("retrive", empno);
	}

	public int update(SqlSession session, EmpDTO dto) {
		return session.update("update", dto);
	}

	public int delete(SqlSession session, int empno) {
		return session.delete("delete", empno);
	}

	public List<EmpDTO> order(SqlSession session, HashMap<String, String> map) {
		return session.selectList("order", map);
	}

}
