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
	request.setCharacterEncoding("utf-8");
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
%>
일반 : <%=userid %><br>
일반 : <%=passwd %><br>
<hr>
EL userid : ${param.userid }, passwd : ${param.passwd }<br>
${param.aaa }
</body>
</html>