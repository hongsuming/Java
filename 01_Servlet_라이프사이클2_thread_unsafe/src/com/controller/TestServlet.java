package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	// 인스턴스 변수, 객체 생성 1번만 됨, 사용자들이 같이 사용하는 공유 변수가 됨
	int num;
	ArrayList<String> list = new ArrayList<String>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로컬 변수, 공유 불가
		int size = 10;
		num++;
		list.add("홍길동");
		System.out.println("doGet num"+num);
		System.out.println("doGet size"+size);
		System.out.println("doGet list"+list.size());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
