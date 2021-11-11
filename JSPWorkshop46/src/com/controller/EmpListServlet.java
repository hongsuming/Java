package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.EmpDTO;
import com.service.EmpService;

@WebServlet("/EmpListServlet")
public class EmpListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpService service = new EmpService();
		
		
		String searchName = request.getParameter("searchName");
		String searchValue = request.getParameter("searchValue");

		List<EmpDTO> list = service.select(searchName, searchValue);
		
		request.setAttribute("list", list);
		RequestDispatcher dis = request.getRequestDispatcher("list.jsp");
		dis.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
