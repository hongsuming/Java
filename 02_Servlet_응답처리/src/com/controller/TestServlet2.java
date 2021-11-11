package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet2")
public class TestServlet2 extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TestServlet2.doGet()");
		// 1. response 타입 지정
		response.setContentType("text/html; charset=utf-8");
		// 2. response에서 PrintWriter 열기
		PrintWriter out = response.getWriter();
		// 3. Print 사용 문자열로 html 작성
		out.print("<html><body>");
		out.print("<h1>서블릿 응답처리</h1>");
		out.print("<p>TestServlet2</p>");
		out.print("<a href='test.html'>html 가기</a><br>");
		out.print("<a href='TestServlet'>TestServlet 가기</a><br>");
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
