package com.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.EmpDAO;
import com.dto.EmpDTO;

public class EmpService {

	public List<EmpDTO> selectAllEmp() {
		EmpDAO dao = new EmpDAO();
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<EmpDTO> list = null;
		try {
			list = dao.selectAllEmp(session);
		} finally {
			session.close();
		}
		return list;
	}

}
