package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



import org.apache.ibatis.session.SqlSession;
import com.dto.MyProductDTO;

public class MyProductDAO {
	

	public List<MyProductDTO> select(SqlSession session) {
		return session.selectList("com.dto.selectAll");
	}

	public int delete(SqlSession session, String prodId) {
		return session.delete("com.dto.deleteByProdId", prodId);
	}

	public int deleteAll(SqlSession session, List<String> list) {
		return session.delete("deleteAllProdId", list);
	}
	
}
