<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	int count  = (int)session.getAttribute("count");	
    	//object(big) -- 강제 변환 --> int(small) 
    	count++;									// 증가++ 하고 
    	session.setAttribute("count", count);		// 증가한것을 세션을 다시 잡아줘야함. 다시 저장
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page 40</title>
</head>
<body>
현재 count : <%= session.getAttribute("count") %>
<!-- 현재 카운트 : ${count} 위와 같음 세션찍을떄는 요러케만  -->
<a href="page05.jsp">카운트값 확인</a>
</body>
</html>