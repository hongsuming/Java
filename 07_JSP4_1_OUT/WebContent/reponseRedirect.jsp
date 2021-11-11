<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
redirect 돼서 옴 <br>
<%
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("userid");
	String pw = request.getParameter("passwd");
%>
사용자 id : <%=id %><br>
패스워드 : <%=pw %>
</body>
</html>