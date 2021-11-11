<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>jstl core 태그의 사용</h1>
<c:if test="<%=true %>"> aaa</c:if><br>
xxx : ${xxx }<br>

<c:set var="aaa" value="${xxx }" scope="application"></c:set> <!-- xxx= 홍길동   application.setAttribute("aaa", "홍길동")-->
이름 : ${aaa }<br>

request의 이름 : <c:out value="${xxx }"></c:out><br>
application의 이름 : <c:out value="${aaa }"></c:out><br>
${xxx=='bbb' }<br>
</body>
</html>