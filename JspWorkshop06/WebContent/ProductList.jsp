<%@page import="java.util.Enumeration"%>
<%@page import="com.dto.Product" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>상품 입력 결과 jsp</h2>
<table border="1">
	<tr><td>상품 아이디</td><td>상품명</td><td>수량</td></tr>
<%
	Product pp = (Product)request.getAttribute("ppp");
	Enumeration<String> key = session.getAttributeNames();
	while(key.hasMoreElements()){
		String id = key.nextElement();
		Product p = (Product)session.getAttribute(id);
%>
<tr><td><%=p.getId() %></td><td><%=p.getName() %></td><td><%=p.getAmount() %></td></tr>
<%} %>
</table>
<a href = "productForm.html">제품 등록 화면 가기</a>
<%=pp.getId() %>, <%=pp.getName() %>
</body>
</html>