package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {

	public void insert(SqlSession session, Dept dept) {
		int num = session.insert("deptInsert", dept);
		System.out.println(num+"개 행이 삽입되었습니다.");
	}

	public List<Dept> selectAll(SqlSession session) {
		List<Dept> list = session.selectList("selectAll");
		return list;
	}

}
