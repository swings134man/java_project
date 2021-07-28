<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
     	String id = request.getParameter("id");
     	String name = request.getParameter("name");
     	String tel = request.getParameter("tel");
    
     	회원Bag bag = new 회원Bag();
     	bag.setId(id);
     	bag.setName(name);
     	bag.setTel(tel);
     	회원DAO2 dao = new 회원DAO2();
     	dao.update(bag);
     	
     	
    %>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update 창</title>
</head>
<body>
	update 전송됨. 
</body>
</html>