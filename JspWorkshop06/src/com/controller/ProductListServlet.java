package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Product;

@WebServlet("/ProductListServlet")
public class ProductListServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		HttpSession session = request.getSession();
//		Enumeration<String> key = session.getAttributeNames();
//		
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.print("<html><head><title>상품 입력 결과</title></head><body>");
//		String my = "<table border='1'>";
//			my+="<tr><td>상품 아이디</td><td>상품명</td><td>수량</td></tr>";
//		while(key.hasMoreElements()) {
//			String id = key.nextElement();
//			Product p = (Product) session.getAttribute(id);
//			my += "<tr><td>"+p.getId()+"</td>";
//			my += "<td>"+p.getName()+"</td>";
//			my += "<td>"+p.getAmount()+"</td>";
//			my += "</tr>";
//		}
//		my += "</table>";
//		out.print(my);
//		out.print("<a href='productForm.html'>등록 화면 보기</a></br>");
//		out.print("</body></html>");
		
//		response.sendRedirect("ProductList.jsp");
		
		request.setAttribute("ppp", new Product("tv", "LGTV", 2));
		RequestDispatcher dis = request.getRequestDispatcher("ProductList.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
