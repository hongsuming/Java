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
String msg = (String) request.getAttribute("request");
String msg2 = (String) session.getAttribute("session");
String msg3 = (String) application.getAttribute("application");
%>
<hr border="2">
1>> <%= msg %>
2>> <%= msg2 %>
3>> <%= msg3 %>
</body>
</html>