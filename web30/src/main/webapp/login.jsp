<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
</head>
<body>
<h3>로그인 화면 입니다.</h3>
<hr>
<form action="loginCheck.jsp">
	로그인 id: <input type="text" name="id" > <br> 
	로그인 pw: <input type="text" name="pw" > <br>
	
	<button style='color: green; background: yellow;' >로그인 처리 요청</button>
</form>
</body>
</html>