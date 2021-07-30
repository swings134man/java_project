<%@page import="shop.db.게시판DAO2"%>
<%@page import="shop.dto.게시판Bag3"%>
<%@page import="shop.dto.회원Bag"%>
<%@page import="shop.db.게시판DAO"%>
<%@page import="shop.dto.게시판Bag2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	
  		게시판Bag3 bag = new 게시판Bag3();
  		bag.setId(id);
  		
		게시판DAO2 dao = new 게시판DAO2(); 
  		게시판Bag3 dto2 = dao.read(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 검색</title>
</head>
<body>
<h3>게시판 상세페이지 검색 결과</h3>
<hr color="green">
<table border="1">
<tr bgcolor="gray">
		<td>아이디 : <%= dto2.getId() %></td>
		
		<td>이 름 :<%= dto2.getName() %> </td>
		<td>가격 :<%= dto2.getPrice() %>  </td>
	</tr>
	<tr >
		<td colspan="3">내 용</td>
	</tr>	
	<tr>
		<td colspan="3">
		<%= dto2.getContent() %>
		</td>
	</tr>
	
	</table>
	<form action="bbs2.jsp">
		<button>홈으로</button>
	</form>
	<form action="all3.jsp">
		<button>전체 목록 페이지</button>
	</form>
</body>
</html>