<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 1. 쿠키객체를 만든다. 2개를 만든다.
    	Cookie c1 = new Cookie("category","excercise");
    	Cookie c2 = new Cookie("type","football");
    	// 2. 쿠키를 브라우저에 심는다. 
    	response.addCookie(c1);
    	response.addCookie(c2);
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page 1</title>
</head>
<body>
쿠키심었다! <a href="page02.jsp">쿠키 확인하러가기</a>
</body>
</html>