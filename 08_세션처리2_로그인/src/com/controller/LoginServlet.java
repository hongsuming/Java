package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. request 한글 설정
		request.setCharacterEncoding("utf-8");
		// 2. form에서 넘어온 데이터를 파싱해서 syso로 확인
		String userid=(String)request.getParameter("userid");
		String passwd=(String)request.getParameter("passwd");
		System.out.println(userid+"\t"+passwd);
		
		if(userid.equals("abcd")&&passwd.equals("1234")) {
			HttpSession session = request.getSession();
			session.setAttribute("userid", userid);
			session.setAttribute("passwd", passwd);
			// 세션은 전달 되지만, request는 전달 안 됨
			response.sendRedirect("loginInfo.jsp");
		} else {
			response.sendRedirect("error.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
