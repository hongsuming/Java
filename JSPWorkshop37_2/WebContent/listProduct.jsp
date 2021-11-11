<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.dto.MyProductDTO"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	MyProductService service = new MyProductService();
	List<MyProductDTO> list = service.select();
%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
 	window.onload = function(){
		totalSum();
	} 
	function chk(n){
		var lang = document.querySelectorAll(".delCheck");
		for(var i=0; i<lang.length; i++){
			lang[i].checked = n.checked;
		}
	}
	function delProduct(n){
		location.href="deleteProduct.jsp?ProdId="+n;
	}
	function delAll(){
		document.querySelector("#delForm").action='deleteAllProduct.jsp';
		document.querySelector("#delForm").submit;
	}
	function update(n){
		var m = document.querySelector("#quantity"+n);
		var quantity = m.value;
		location.href="updateProduct.jsp?prodId="+n+"&quantity="+quantity;
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form id="delForm">
<table border="1">
  <tr>
   	<td><input type="checkbox" name="delCheckAll" id="delCheckAll" onClick="chk(this)">전체선택</td>
    <td>상풍아이디</td>
    <td>상품명</td>
    <td>가격</td>
    <td>갯수</td>
    <td>수량</td>
    <td>삭제</td>
    <td>수정</td>
  </tr>
  
 <%
	for(MyProductDTO dto : list){
 %> 
   <tr>
   	<td><input type="checkbox" name="delCheck" class="delCheck" value="<%=dto.getProdId()%>"></td>
    <td><%=dto.getProdId() %></td>
    <td><%=dto.getProdName() %></td>
    <td><%=dto.getPrice() %></td>
    <td><input type="text" name="quantity" value="<%=dto.getQuantity() %>" id="quantity<%=dto.getProdId() %>"></td>
    <td><span class="sum" id="sum<%=dto.getProdId()%>"><%=dto.getQuantity()*dto.getPrice() %></span></td>
    <td><button onClick="delProduct('<%=dto.getProdId()%>')">삭제</button></td>
    <td><button onClick="update('<%=dto.getProdId()%>')">수정</button></td>
  </tr>
 
 <%
	}
 %> 
</table>
<button id="deleteAllProduct" onclick="delAll()">선택된 항목 삭제</button>
총합 : <span id="totalSum"></span>
</form>
<script type="text/javascript">
	function totalSum(){
		var n=document.querySelectorAll(".sum");
		var result=0;
		for(var i=0; i<n.length; i++){
			var num = parseInt(n[i].innerText);
			result+=num;
		}
		document.querySelector("#totalSum").innerHTML=result;
	}
/* totalSum(); 위에 window.onload 하지 않으려면 강제적으로 함수 호출해야 됨 */
</script>
</body>
</html>