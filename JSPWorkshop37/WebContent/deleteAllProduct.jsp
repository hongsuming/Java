<%@page import="java.util.Arrays"%>
<%@page import="java.sql.Array"%>
<%@page import="java.util.List"%>
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
	String prodIds[] = request.getParameterValues("delCheck");
	List<String> list = Arrays.asList(prodIds);

	MyProductService service = new MyProductService();
	int n = service.deleteAll(list);
	System.out.println(n + "개 행이 삭제되었습니다.");
	
	String pName="";
	for(String name : list){
		pName += (name+" ");
	}
	String msg = pName+" 상품 삭제 성공";
	if(n==0){
		msg = pName+" 상품 삭제 실패";
	}
	out.print(msg);
	%>
<br>
<a href="listProduct.jsp">목록보기</a>
</body>
</html>