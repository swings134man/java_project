<%@page import="shop.db.게시판DAO2"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.dto.게시판Bag3"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	게시판DAO2 dao = new 게시판DAO2();
    ArrayList<게시판Bag3> list = dao.read();
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 전체 목록</title>
</head>
<body>
	전체 게시판 목록 개수 : <%= list.size() %> 개 <br> 
	<hr color="red">
	<%= list %>	
	<hr color="red">

	<!-- 테이블안에 담는것  -->
	<hr color="green">
	<table border=1>
	<tr bgcolor="green">
		<th>아이디</th>
		<th>이 름</th>
		<th>내 용</th>
		<th>가 </th>
	</tr>					<!-- 여기까지는 반복하면 안됨. for문 밖에  -->
	<%
		for(게시판Bag3 dto : list){
	%>
	<tr>
		<td><%= dto.getId() %></td>
		<td>
		<a href="http://localhost:8889/web26/read3.jsp?id=<%= dto.getId() %>">	<!-- 제목 눌렀을때 이동 -->
		<%= dto.getContent() %>
		</a>
		
		</td>
		<td><%= dto.getName() %></td>
		<td><%= dto.getPrice() %></td>
	</tr>
	<%} %>
	</table>
	
	
</body>
</html>