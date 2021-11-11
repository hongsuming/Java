package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TestController")
public class TestController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				// hellp.jsp 선택(요청)
				request.setAttribute("request", "홍길동");

				HttpSession session = request.getSession();
				session.setAttribute("session", "이순신");
				
				ServletContext ctx = getServletContext();
				ctx.setAttribute("application", "유관순");
				
				// 2. forward 방법
				// RequestDispatcer의 특징 : request와 response가 같이 위임 페이지로 넘어감
				// request에 다음 페이지에서 처리할 데이터를 담아서 전송 후 위임 페이지에서 사용한 후 데이터는 request와 같이 사라짐
				RequestDispatcher dis = request.getRequestDispatcher("hello.jsp");
				dis.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
