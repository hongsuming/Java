<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	out.print(request.getParameter("aa")+"<br>");
	out.print(request.getParameter("CCC")+"<br>");
	out.print(session.getAttribute("AAA")+"<br>");
	out.print(application.getAttribute("BBB")+"<br>");
	out.print("홍길동"); // out 사용하여 바로 출력 가능
%>
</body>
</html>