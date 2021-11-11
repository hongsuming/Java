<%@page import="java.util.List"%>
<%@page import="com.dto.EmpDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>[사원 목록]</h2>
<hr>
<%
	List<EmpDTO> list = (List<EmpDTO>)request.getAttribute("list");
	System.out.println(list);
%>
<table border="1">
	<tr><td><select>
				<option>입사일(년도)</option>
				<option>이름</option>
			</select></td>
		<td colspan="4"><input type="text"><button>검색</button></td></tr>
	<tr><th>정렬기준</th><td colspan="4">월급 높은 순 :<input type="radio" name="salK" checked="checked">
							월급 낮은 순 : <input type="radio" name="salK"><button>정렬</button></td></tr>
	<tr><th>사원번호</th><th>사원이름</th><th>직업</th><th>입사일</th><th>월급</th></tr>
<%
	for(EmpDTO d : list){
		int empno = d.getEmpno();
		String ename = d.getEname();
		String job = d.getJob();
		String hiredate = d.getHiredate();
		int sal = d.getSal();
%>
	<tr><td><%=empno %></td><td><%=ename %></td><td><%=job %></td><td><%=hiredate %></td><td><%=sal %></td></tr>
<%
	}
%>
</table>
<a href="#">사원 등록</a>
</body>
</html>