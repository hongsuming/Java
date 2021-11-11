package com.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("InitParamServlet.doGet()");
		String userid = getInitParameter("userid");
		String email = getInitParameter("email");
		System.out.println(userid+"\t"+email);
		
		Enumeration<String> e = getInitParameterNames();
		while(e.hasMoreElements()) {
			String key = e.nextElement();
			String value = getInitParameter(key);
			System.out.println(">>>"+userid+"\t"+email);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
