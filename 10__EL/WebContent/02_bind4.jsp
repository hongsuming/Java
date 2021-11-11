<%@page import="com.dto.Person"%>
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
	Person p = (Person)request.getAttribute("person");
%>
일반 : <%=p %><br>
일반 : <%=p.getName() %><br>
EL :  Person.name = ${person.name}<br>
EL :  Person.age = ${person.age}<br>
<input type="text" value="${person.name }">
</body>
</html>