<%@page import="java.util.List"%>
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
	List<Person> list = (List<Person>)request.getAttribute("xxx");
	for(Person p : list){
%>
일반 : <%=p %><br>
<%} %>
<hr>
<% for(int i=0; i<list.size(); i++){ %>
EL : Person.name = ${xxx.get(i).name}<br>
EL : Person.age = ${xxx.get(i).age }<br>
<%} %>
${xxx }
</body>
</html>