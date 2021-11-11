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
	String xxx = (String)request.getAttribute("xxx");
	String yyy = (String)session.getAttribute("yyy");
	String zzz = (String)application.getAttribute("zzz");
%>
일반 : <%=xxx %><br>
일반 : <%=yyy %><br>
일반 : <%=zzz %><br>
<hr>
EL request : ${request.xxx}<br> <!-- 사용 안 됨 -->
EL 이용한 데이터 읽기 : ${xxx}<br>
EL 이용한 데이터 읽기 : ${yyy}<br>
EL 이용한 데이터 읽기 : ${zzz}<br>
<hr>
EL : ${requestScope.xxx}<br>
EL : ${sessionScope.yyy}<br>
EL : ${applicationScope.zzz}<br>
</body>
</html>