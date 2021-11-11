package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

@WebServlet("/EmpUpdateServlet")
public class EmpUpdateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int empno = Integer.parseInt(request.getParameter("empno"));
		String job = (String)request.getParameter("job");
		int sal = Integer.parseInt(request.getParameter("sal"));
		
		EmpDTO dto = new EmpDTO(empno, null, job, 0, null, sal, 0, 0);
		
		EmpService service = new EmpService();
		int num  = service.update(dto);
		System.out.println(num+"개 행이 수정되었습니다.");
		
		if(num>0) {
			response.sendRedirect("EmpListServlet");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
