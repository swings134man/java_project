<%@page import="dto.ADFoodDTO"%>
<%@page import="db.ADFoodDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
		String ad_Writer = request.getParameter("ad_Writer");    
    
    	ADFoodDAO dao = new ADFoodDAO();
    	ADFoodDTO dto = new ADFoodDTO();
    	dto.setAd_Writer(ad_Writer);
    	dao.delete(dto);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" href="css/out.css">
</head>
<body>
	
	<hr color="purple">
	글삭제가 완료되었습니다!
	<hr color="purple"> 
	<form action="home.html">
		<button>HOME 으로 가기!</button>
	</form>
	
</body>
</html>