package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 한글처리 (post 처리만 해줘도 되는데 항상 다는 것을 권장)
		request.setCharacterEncoding("utf-8");
		// 요청
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		System.out.println("login2 :"+userid+"\t"+passwd);
		
		// 응답처리
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("login2<br>");
		out.print("이름은:"+userid);
		out.print("비번은:"+passwd);
		out.print("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("loginServlet doPost() 호출");
		doGet(request, response);
	}

}
