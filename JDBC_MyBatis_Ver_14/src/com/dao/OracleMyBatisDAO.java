package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisDAO {

	public void insert(SqlSession session, Dept dept) {
		int num = session.insert("deptInsert", dept);
		System.out.println(num+"개 행이 삽입되었습니다.");
	}

	public List<Dept> selectAll(SqlSession session) {
		List<Dept> list = session.selectList("com.dept.DeptMapper.selectAll");
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

	public HashMap selectByDeptnoHashMap(SqlSession session, int deptno) {
		HashMap map = session.selectOne("selectByDeptnoHashMap", deptno);
		return map;
	}

	public List<Dept> selectByHashMap(SqlSession session, HashMap<String, Integer> map) {
		List<Dept> list = session.selectList("selectByHashMap", map);
		return list;
	}

	public List<Dept> selectDynamicDeptno(SqlSession session, HashMap<String, Integer> map) {
		List<Dept> list = session.selectList("selectDynamicDeptno", map);
		return list;
	}

	public List<Dept> selectDynamicChoose(SqlSession session, HashMap<String, String> map) {
		List<Dept> list = session.selectList("selectDynamicChoose", map);
		return list;
	}

	public List<Dept> multiSelect(SqlSession session, List<Integer> deptnoes) {
		List<Dept> list = session.selectList("multiSelect", deptnoes);
		return list;
	}

	public void multiUpdate(SqlSession session, List<Integer> deptnoes2) {
		int num = session.update("multiUpdate", deptnoes2);
		System.out.println(num+"개 행이 변경되었습니다.");
	}

	public void multiDelete(SqlSession session, List<Dept> depts) {
		int num = session.delete("multiDelete", depts);
		System.out.println(num+"개 행이 삭제되었습니다.");
	}
	
	public void multiInsert(SqlSession session, List<Dept> depts) {
		int num = session.insert("multiInsert", depts);
		System.out.println(num+"개 행이 삽입되었습니다.");
	}

	public List<Dept> selectTopN(SqlSession session, int i, int j) {
		// 부분 선택 session.selectList(sql id, 검색어, RowBounds)
		// RowBounds(시작번호, 읽을 개수) -> 시작번호~ 개수만큼 읽어옴
		List<Dept> list = session.selectList("topN", null, new RowBounds(i, j));
		return list;
	}
	// 오버로딩
	public List<Dept> selectTopN(SqlSession session, String loc, int i, int j) {
		List<Dept> list = session.selectList("topNLoc", loc, new RowBounds(i, j));
		return list;
	}

	public String getDate(SqlSession session) {
		String date = session.selectOne("getDate");
		return date;
	}
}
