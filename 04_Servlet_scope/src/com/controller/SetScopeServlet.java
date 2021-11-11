package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.ws.api.policy.PolicyResolver.ServerContext;

@WebServlet("/SetScopeServlet")
public class SetScopeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. request scope에 저장
		// 하나의 request, response 후 사라짐
		request.setAttribute("request", "홍길동");
		
		// 2. session scope에 저장
		// session : 브라우저가 떠있는 동안, 동작이 발생한 동안 30분 생명 주기, 시간 설정 가능 브라우저에서 사용함
		// 모든 서블릿에서 공유함
		HttpSession session = request.getSession();
		session.setAttribute("session", "이순신");
		
		// 3. application scope에 저장
		ServletContext ctx = getServletContext();
		ctx.setAttribute("application", "유관순");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
