package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

@WebServlet("/EmpWriteServlet")
public class EmpWriteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int empno = Integer.parseInt(request.getParameter("empno"));
		String ename = (String)request.getParameter("ename");
		String job = (String)request.getParameter("job");
		int mgr = Integer.parseInt(request.getParameter("mgr"));
		int sal = Integer.parseInt(request.getParameter("sal"));
		
		EmpDTO dto = new EmpDTO(empno, ename, job, mgr, null, sal, 0, 0);
		EmpService service = new EmpService();
		int num = service.insert(dto);
		System.out.println(num+"개 행이 삽입되었습니다.");
		
		if(num>0) {
			response.sendRedirect("EmpListServlet");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
