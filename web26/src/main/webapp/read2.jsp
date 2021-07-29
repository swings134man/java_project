<%@page import="shop.dto.회원Bag"%>
<%@page import="shop.db.게시판DAO"%>
<%@page import="shop.dto.게시판Bag2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	
    	게시판Bag2 bag = new 게시판Bag2();
    	bag.setId(id);
    	
    	게시판DAO dao = new 게시판DAO();
    	게시판Bag2 bag2 = dao.read(bag);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 검색</title>
</head>
<body>
<h3>게시판 검색 결과</h3>
<hr color="green">
	아이디 : <%= bag2.getId() %> <br>
	제목 : <%= bag2.getTitle() %> <br>
	내용 : <%= bag2.getContent() %> <br>
	작성자 : <%= bag2.getWriter() %> <br>
	<form action="bbs.jsp">
		<button>홈으로</button>
	</form>
</body>
</html>