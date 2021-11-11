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
/* 	2. request 이용해서 forward로 보낸 데이터 받아서 출력
	String id = (String)request.getAttribute("id");
	String pw = (String)request.getAttribute("pw"); */
	
/*  3. session 이용해서 redirect로 보낸 데이터 받아서 출력  */
	String id = (String)session.getAttribute("id");
	String pw = (String)session.getAttribute("pw");
%>
아이디는 <%=id %>, 비밀번호는 <%=pw %> 입니다.
</body>
</html>