package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/GetScopeServlet")
public class GetScopeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String x = (String) request.getAttribute("request");
//		System.out.println("GetScopeServlet request="+x); // null
		
//		HttpSession session = request.getSession();
//		String x2 = (String) session.getAttribute("session");
//		System.out.println("GetScopeServlet request="+x2);
		
		ServletContext ctx = getServletContext();
		String x3 = (String) ctx.getAttribute("application");
		System.out.println("GetScopeServlet request="+x3);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
