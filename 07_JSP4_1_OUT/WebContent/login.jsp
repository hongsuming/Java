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
	String id = request.getParameter("userid");
	String pw = request.getParameter("passwd");
	System.out.println(id+"\t"+pw);
	out.print(id+"<br>");
	out.print(pw+"<br>");
%>
<%=id %>님 안녕하세요.<br>
비밀번호는 <%=pw %>입니다.

<% 
	if(id.length()==0){
		response.sendRedirect("loginForm.html"); 
	} else{
		response.sendRedirect("reponseRedirect.jsp");
	}
%>
</body>
</html>