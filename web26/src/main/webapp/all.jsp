<%@page import="shop.dto.회원Bag"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.회원DAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% //스크립트릿 (서버에서 돌아가는 작성된 작은(let) 프로그램.)
    	회원DAO2 dao = new 회원DAO2();
   	//단축키 jsp 에서 자동임포트 = 클릭후, cmd + shift + m
    ArrayList<회원Bag> list = dao.read();
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>all</title>
</head>
<body>
	<%= list  %> <hr color="red">	<!-- 표현식 -->
</body>
</html>