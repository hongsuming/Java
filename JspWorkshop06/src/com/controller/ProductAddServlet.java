package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.Product;

@WebServlet("/ProductAddServlet")
public class ProductAddServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		int amount = Integer.parseInt(request.getParameter("amount"));

		HttpSession session = request.getSession();
		Product p = (Product) session.getAttribute(id);

		if (p==null) {
			p = new Product(name, id, amount);
			session.setAttribute(id, p);
		} else {
				p.setAmount(p.getAmount()+amount);
		}
		
		response.sendRedirect("ProductAdd.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
