<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% int x = 11; %>
<%= x %>
x 일반 변수 사용 안 됨 ${x}<br>
${10+4}<br>
${10-4}<br>
${10/4}<br>
${10*4}<br>

${10>=4}<br>
${10<=4}<br>
${10==4}<br>
${10!=4}<br>

${10!=4 && 4==4}<br>

</body>
</html>