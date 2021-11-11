package com.biz;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpBiz {
	EmpDAO dao;

	public EmpBiz() {
		dao = new EmpDAO();
	}

	public ArrayList<EmpDTO> selectAllemp() {
		Connection con = JdbcTemplate.getConnection();
		ArrayList<EmpDTO> list = dao.selectAllemp(con);
		JdbcTemplate.close(con);
		return list;
	}

	public EmpDTO selectDetailEmp(String empnum) throws DataNotFoundException{
		Connection con = JdbcTemplate.getConnection();
		EmpDTO dto = dao.selectDetailEmp(con, empnum);
		JdbcTemplate.close(con);
		return dto;
	}

	public void empIsert(EmpDTO empDTO) {
		Connection con = JdbcTemplate.getConnection();
		dao.empInsert(con, empDTO);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}

	public void empUpdate(EmpDTO empDTO) throws DataNotFoundException {
		Connection con = JdbcTemplate.getConnection();
		dao.empUpdate(con, empDTO);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}

	public void empDelete(String empnum) throws DataNotFoundException{
		Connection con = JdbcTemplate.getConnection();
		dao.empDelete(con, empnum);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}
	
	

//	public ArrayList<EmpDTO> selectDetailEmp2(HashMap<String, String> map) {
//		Connection con = JdbcTemplate.getConnection();
//		ArrayList<EmpDTO> list = dao.selectDetailEmp2(con, map);
//		JdbcTemplate.close(con);
//		return list;
//	}
}
