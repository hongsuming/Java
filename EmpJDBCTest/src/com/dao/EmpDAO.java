package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.common.util.JdbcTemplate;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpDAO {

	public ArrayList<EmpDTO> selectAllemp(Connection con) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();

		try {
			String sql = "select empno, ename, job, mgr, to_char(hiredate, 'YYYY-MM-DD') hiredate, sal, comm, deptno from emp order by empno desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				String hiredate = rs.getString(5);
				double sal = rs.getDouble(6);
				double comm = rs.getDouble(7);
				int deptno = rs.getInt(8);
				list.add(new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return list;
	}

	public EmpDTO selectDetailEmp(Connection con, String empnum) throws DataNotFoundException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmpDTO emp = null;

		try {
			String sql = "select empno, ename, job, mgr, to_char(hiredate, 'YYYY-MM-DD') hiredate, sal, comm, deptno from emp where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(empnum));
			rs = pstmt.executeQuery();
			if (rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				String hiredate = rs.getString(5);
				double sal = rs.getDouble(6);
				double comm = rs.getDouble(7);
				int deptno = rs.getInt(8);
				emp = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			} else {
				throw new DataNotFoundException(empnum + "입력하신 사원 번호는 존재하지 않습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return emp;
	}

	public ArrayList<EmpDTO> selectDetailEmp2(Connection con, HashMap<String, String> map) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		String jobb = map.get("job");
		String deptnoo = map.get("deptno");

		try {
			String sql = "select empno, ename, job, mgr, to_char(hiredate, 'YYYY-MM-DD') hiredate, sal, comm, deptno from emp where job=? and deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, jobb);
			pstmt.setInt(2, Integer.parseInt(deptnoo));
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				int mgr = rs.getInt(4);
				String hiredate = rs.getString(5);
				double sal = rs.getDouble(6);
				double comm = rs.getDouble(7);
				int deptno = rs.getInt(8);
				list.add(new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return list;
	}

	public void empInsert(Connection con, EmpDTO empDTO) {
		PreparedStatement pstmt = null;

		try {
			String sql = "insert into emp values(?,?,?,?,sysdate,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empDTO.getEmpno());
			pstmt.setString(2, empDTO.getEname());
			pstmt.setString(3, empDTO.getJob());
			pstmt.setInt(4, empDTO.getMgr());
			pstmt.setDouble(5, empDTO.getSal());
			pstmt.setDouble(6, empDTO.getComm());
			pstmt.setInt(7, empDTO.getDeptno());
			int num = pstmt.executeUpdate();
			System.out.println(num + "개 행이 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
	}

	public void empUpdate(Connection con, EmpDTO empDTO) throws DataNotFoundException {
		PreparedStatement pstmt = null;

		try {
			String sql = "update emp set job=? where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, empDTO.getJob());
			pstmt.setInt(2, empDTO.getEmpno());
			int num = pstmt.executeUpdate();
			System.out.println(num + "개 행이 수정되었습니다.");
			if (num == 0) {
				throw new DataNotFoundException(empDTO.getEmpno() + "입력하신 사원번호가 존재하지 않습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
	}

	public void empDelete(Connection con, String empnum) throws DataNotFoundException {
		PreparedStatement pstmt = null;

		try {
			String sql = "delete from emp where empno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(empnum));
			int num = pstmt.executeUpdate();
			System.out.println(num + "개 행이 삭제되었습니다.");
			if (num == 0) {
				throw new DataNotFoundException(empnum + "입력하신 사원번호가 존재하지 않습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);

		}
	}
}
