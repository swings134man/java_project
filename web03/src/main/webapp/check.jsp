<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String id2 = "root";
    String pw2 = "1234";
    String result = "로그인 실패@@@";
    if(id.equals(id2) && pw.equals(pw2)) {
    	result = "로그인 성공!!!";
    }
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">
정보가 도착하였음.<br>
서버에 도착한 id는 <%= id %> <br>
서버에 도착한 pw는 <%= pw %> 
<hr>
로그인 결과는 <%= result %>


</body>
</html>