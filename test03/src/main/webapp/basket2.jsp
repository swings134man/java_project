<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	String pId = request.getParameter("pId");
    	String price = request.getParameter("price");
    	String num = request.getParameter("num");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>basket2.jsp</title>
<style type="text/css">
body{
	background-color: cyan;
}
</style>
</head>
<body>
<h3>장바구니 내용 확인</h3>
<hr color="red">
내 아이디: <%= id %> <br>
상품 아이디: <%= pId %> <br>
상품 가격: <%= price %> <br>
상품 수량: <%= num %> <br>
</body>
</html>