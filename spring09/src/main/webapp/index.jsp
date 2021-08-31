<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome!</title>
</head>
<body>
welcome! login page!
<hr color="red">
<form action="password.mega">
	password : <input name="pass"> <br>
	<button>암호 처리 요청</button>
</form>

<hr color="red">
<hr>
<form action="login.mega">
	id: <input name="id"> <br>
	pw: <input name="pw"> <br>
	<button>로그인!</button>
</form>
<hr>
<form action="check.mega">
	nickName: <input name="nick"> <br>
	<button>닉네임 처리요청</button>
</form>
</body>
</html>