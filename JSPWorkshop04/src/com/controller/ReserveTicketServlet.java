package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reserveTicket")
public class ReserveTicketServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String birthday = request.getParameter("birthday");
		Calendar cal = Calendar.getInstance();
		double price = Integer.parseInt(request.getParameter("type"));
		int age = cal.get(Calendar.YEAR) - Integer.parseInt(birthday.substring(0, 4));


		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("<b>입력한 생년월일 : "+birthday+", 선택한 티켓: "+price+"</b><br>");
		
		String[] grades = {"미성년자", "성인", "경로우대"};
		int grade = 0;
		if(age<19) {
			price -= price*0.4;
		} else if(age<60) {
			grade=1;
			price -= price*0.1;
		} else {
			grade=2;
			price -= price*0.6;
		}
		out.println("나이 : "+age+"세, 등급 : "+grades[grade]+", 할인 적용 금액 : "+price+"원");
		out.println("</body></html>");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
