package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/myLogin")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("userid");
		String pw = request.getParameter("passwd");

		// 1. servlet에서 출력
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.print("<html><body>");
//		String my = "이름은 "+id+" 이고 비밀번호는 "+pw;
//		out.print(my);
//		out.print("</body></html>");
		
		// 2. 페이지 위임 처리
//		request.setAttribute("id", id);
//		request.setAttribute("pw", pw);
//		RequestDispatcher dis = request.getRequestDispatcher("info.jsp");
//		dis.forward(request, response);
		
		// 3. session에 저장
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		session.setAttribute("pw", pw);
		response.sendRedirect("info.jsp");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
