<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.게시판DAO"%>
<%@page import="shop.dto.게시판Bag2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	게시판DAO dao = new 게시판DAO();
    	ArrayList<게시판Bag2> list = dao.read();
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
	<%
		for(int i =0; i < list.size(); i++){
		게시판Bag2 dto = list.get(i);  /* 컨테이너에서 1번째 가방 꺼낸것. */
	%>
		게시판 id: <%= dto.getId() %> <br> 	 <!-- 1번가방에서 ID 만 꺼냄  -->
		게시판 title: <%= dto.getTitle() %> <br>
		게시판 content: <%= dto.getContent() %> <br>
		게시판 writer: <%= dto.getWriter() %> <br>
		<hr>
	<%} %>
	<hr color="blue">
	<%
		for(게시판Bag2 dto : list){
	%>
		게시판 id: <%= dto.getId() %> <br> 	 <!-- 1번가방에서 ID 만 꺼냄  -->
		게시판 title: <%= dto.getTitle() %> <br>
		게시판 content: <%= dto.getContent() %> <br>
		게시판 writer: <%= dto.getWriter() %> <br>
		<hr>
	<%} %>
	<!-- 테이블안에 담는것  -->
	<hr color="green">
	<table border=1>
	<tr bgcolor="green">
		<th>아이디</th>
		<th>제 목</th>
		<th>내 용</th>
		<th>작성자</th>
	</tr>					<!-- 여기까지는 반복하면 안됨. for문 밖에  -->
	<%
		for(게시판Bag2 dto : list){
	%>
	<tr>
		<td><%= dto.getId() %></td>
		<td>
		<a href="http://localhost:8889/web26/read2.jsp?id=<%= dto.getId() %>">	<!-- 제목 눌렀을때 이동 -->
		<%= dto.getTitle() %>
		</a>
		
		</td>
		<td><%= dto.getContent() %></td>
		<td><%= dto.getWriter() %></td>
	</tr>
	<%} %>
	</table>
	
	
</body>
</html>