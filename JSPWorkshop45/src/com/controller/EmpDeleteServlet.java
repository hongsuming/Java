package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.EmpService;

@WebServlet("/EmpDeleteServlet")
public class EmpDeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int empno = Integer.parseInt(request.getParameter("empno"));
		
		EmpService service = new EmpService();
		int num = service.delete(empno);
		System.out.println(num+"개 행이 삭제되었습니다.");
		
		if(num>0) {
			response.sendRedirect("EmpListServlet");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
