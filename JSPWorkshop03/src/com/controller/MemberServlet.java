package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("username");
		String ssn = request.getParameter("ssn");
		String gender = (ssn.substring(7, 8)).equals("1")?"남자":"여자";
		String[] hobby = request.getParameterValues("hobby");
		String msg = "";
		for (String h : hobby) {
			msg += h + " ";
		}
		String marry = request.getParameter("marry");
		
		System.out.println(name+"\t"+ssn+"\t"+gender+"\t"+msg+"\t"+marry);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		String my = "이름은 "+ name+"<br>";
				my += "성별은 " + gender+"<br>";
				my += "취미는 " + msg+"<br>";
				my += "결혼 상태는 " + marry+"입니다.";
		out.print(my);
		out.print("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
