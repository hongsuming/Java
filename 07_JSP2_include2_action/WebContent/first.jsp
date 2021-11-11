<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% /* 서블릿의 doGet, doPost부분처럼 데이터를 처리하는 코드를 작성 */
	request.setAttribute("xxx", "홍길동");  // 데이터 넣기
%>
first.jsp<br>
아래 화면은 to.jsp를 jsp:include 시킨 내용입니다. <br>
<jsp:include page="include/top.jsp" flush="true" /><br> 
<!-- flush="true" 버퍼링 없이 데이터가 변경되면 include 된 파일에 바로 반영 시킴 -->
<hr>
다시 first.jsp 내용입니다.
</body>
</html>