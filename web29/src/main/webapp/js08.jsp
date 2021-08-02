<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>js 08</title>
<style type="text/css">
	body {
		font-family: "궁서";
		font-size: 20px;
		 
	}
</style>
<script type="text/javascript">
	// 배열 array
	cars = ['트럭','승용차','버스','트럭','승용차','버스','트럭','승용차','버스','트럭','승용차','버스','트럭','승용차','버스','트럭','승용차','버스','트럭','승용차','버스','트럭','승용차','버스','트럭','승용차','버스','트럭','승용차','버스','트럭','승용차','버스','트럭','승용차','버스','트럭','승용차','버스']
	for (var i = 0; i < cars.length; i++) {
		console.log(cars[i] + i) 
	}

</script>
</head>
<body>
<button onclick="alert('내가 나온다 ! 내가 함수다!')">나를 눌러봐라!</button>
</body>
</html>