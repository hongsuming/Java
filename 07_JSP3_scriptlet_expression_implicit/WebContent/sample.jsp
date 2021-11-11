<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.ArrayList"%>

<%!// 멤버 변수와 함수
	int num = 10;

	public void a(int num) {
		System.out.println("a==" + num);
	}%>
<%
		// 로컬 변수, 멤버 함수 호출
		// 로컬 변수는 초기화를 시켜줘야 함
		Date d = new Date();
		ArrayList x = null;
		System.out.println(d);
		System.out.println(x);
		a(10);
		
/* 		전체 코드는 아래 코드와 동일함 
    	  int num=10;
    	 public void a(int tt){sysout(tt);}
    	
    	 public void doGet(req, res) {
    		Date d;   //로컬변수
    		ArrayList x;   //로컬변수
   		a(10); //멤버함수 호출
        } */

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String s = "홍길동";
	System.out.println(s);
	out.print(s);
%>
<%=s %>
</body>
</html>