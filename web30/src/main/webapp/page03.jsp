<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	session.setAttribute("count", 100);	//object(big) <-- 자동 변환 -- int 
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page03</title>
</head>
<body>

현재 count : <%= session.getAttribute("count") %>
<hr>
<a href="page04.jsp">카운트값 증가 후 다시 세션 저장</a>
<a href="page05.jsp">카운트값 확인</a>

</body>
</html>