package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.EmpDTO;

public class EmpDAO {

	public List<EmpDTO> select(SqlSession session) {
		return session.selectList("selectAll");
	}

	public int insert(SqlSession session, EmpDTO dto) {
		return session.insert("insert", dto);	
	}

	public EmpDTO retrive(SqlSession session, int empno) {
		return session.selectOne("retrive", empno);
	}

}
