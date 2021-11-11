package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisDAO {

	public void insert(SqlSession session, Dept dept) {
		int num = session.insert("deptInsert", dept);
		System.out.println(num+"개 행이 삽입되었습니다.");
	}

	public List<Dept> selectAll(SqlSession session) {
		List<Dept> list = session.selectList("com.dept.DeptMapper2.selectAll");
		return list;
	}

	public void update(SqlSession session, Dept dept) throws RecordNotFoundException {
		int num = session.update("deptUpdate", dept);
		if(num==0) {
			throw new RecordNotFoundException(dept.getDeptno()+"에 해당하는 부서번호가 존재하지 않습니다.");
		}
		System.out.println(num+"개 행이 수정되었습니다.");
	}

	public Dept selectByDeptno(SqlSession session, int deptno) {
		Dept dept = session.selectOne("selectByDeptno", deptno);
		return dept;
	}
	

	public void delete(SqlSession session, int i) {
		int num = session.delete("deptDelete", i);
		System.out.println(num+"개 행이 삭제되었습니다.");
	}
	
	public int deptRecordCount(SqlSession session) {
		int count = session.selectOne("deptRecordCount");
		return count;
	}
}
