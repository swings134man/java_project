<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>js 06 </title>

<script type="text/javascript" src="js/out.js"></script>
<script type="text/javascript" src="js/out2.js"></script>
<script type="text/javascript">
	div()	// out2에 선언된 func를 사용 가능 
 	alert('나는 html문서에서 실행되는 추가된 자바 스크립트@@@@')
</script>
</head>
<body>
<button style="background: yellow;" onclick="add(10,20)">더하기 기능</button>

<button style="background: pink;" onclick="minus(100,200)">빼기 기능</button>

<button style="background: green;" onclick="move()">사이트로 이동</button>

</body>
</html>