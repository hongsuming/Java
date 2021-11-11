package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.EmpDTO;
import com.service.EmpService;

@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpService service = new EmpService();
		ArrayList<EmpDTO> list = service.selectAllEmp();
		System.out.println(list);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		String my = "<table border='1'>";
		   my += "<tr>";
		   my += "<td>사원번호</td>";
		   my += "<td>사원이름</td>";
		   my += "<td>월급</td>";
		   my += "<td>입사일</td>";
		   my += "<td>부서번호</td>";
		   my += "</tr>";
		for(EmpDTO dto : list) {
			my += "<tr>";
				my += "<td>"+dto.getEmpno()+"</td>";
				my += "<td>"+dto.getEname()+"</td>";
				my += "<td>"+dto.getSal()+"</td>";
				my += "<td>"+dto.getHiredate()+"</td>";
				my += "<td>"+dto.getDeptno()+"</td>";
		}
			my += "</table>";
			out.print(my);
			out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
