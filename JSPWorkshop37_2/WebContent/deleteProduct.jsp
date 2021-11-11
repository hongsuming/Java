<%@page import="com.service.MyProductService"%>
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
		String prodId = request.getParameter("ProdId");

	MyProductService service = new MyProductService();
	int n = service.delete(prodId);
	System.out.println(n + "개 행이 삭제되었습니다.");
	
	
	String msg = prodId + "상품 삭제 성공";
	if (n != 1) {
		msg = prodId + "상품 삭제 실패";
	}
	out.print(msg);
	%>
	<br>
	<a href="listProduct.jsp">목록 보기</a>
</body>
</html>