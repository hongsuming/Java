<%@page import="com.service.EmpService"%>
<%@page import="com.dto.EmpDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		EmpService service = new EmpService();
	List<EmpDTO> list = service.selectAll();
	%>
	<table border="1">
		<tr>
			<td>사원번호</td>
			<td>사원명</td>
			<td>월급</td>
			<td>입사일</td>
			<td>부서번호</td>
		</tr>
		<%
			for (EmpDTO d : list) {
			int empno = d.getEmpno();
			String ename = d.getEname();
			int sal = d.getSal();
			String hiredate = d.getHiredate();
			int deptno = d.getDeptno();
		%>


		<tr>
			<td><%=empno%></td>
			<td><%=ename%></td>
			<td><%=sal%></td>
			<td><%=hiredate%></td>
			<td><%=deptno%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>