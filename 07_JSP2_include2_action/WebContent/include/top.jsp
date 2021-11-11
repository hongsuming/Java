<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! int num=10; %>
<%
	String msg = (String) request.getAttribute("xxx");
	
%>
<h1 style="color:red;">
to.jsp
안녕하세요? msg=== <%=msg%>
num=== <%=num %>
</h1>