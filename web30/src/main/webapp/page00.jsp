<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	// 쿠키 바로 삭제는 setMaxAge(0) 으로 다시 심는다. 
    	// 1. 쿠키객체를 만든다. 2개를 만든다.
    	Cookie c1 = new Cookie("category","excercise");
    	// 2. 쿠키를 브라우저에 심는다. 
    	c1.setMaxAge(0);
    	response.addCookie(c1);
    	
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