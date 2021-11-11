package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
//		session.removeAttribute("username"); 특정 키에 대한 객체 삭제
//		session.invalidate(); 세션 자체 삭제 --> 500번 오류
		String username = (String) session.getAttribute("username");
		String passwd = (String) session.getAttribute("passwd");
		System.out.println(username+"\t"+passwd);
		
		if(username==null) {
			response.sendRedirect("error.html");
		} else {
			response.sendRedirect("get.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
