package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet("/info")*/
public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");

		String name = "홍길동";
		String my = "<table border='1'>";
		my += "<tr>";
		my += "<td>이름</td>";
		my += "<td>나이</td>";
		my += "<td>주소</td>";
		my += "</tr>";
		my += "<tr>";
		my += "<td>"+name+"</td>";
		my += "<td>20</td>";
		my += "<td>서울</td>";
		my += "</tr></table>";
		
		out.print(my);
		out.print("<body><html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
