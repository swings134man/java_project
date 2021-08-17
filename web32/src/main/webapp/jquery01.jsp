<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jquery01</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
//$: document 객체 
	$(function() {	//document를 ram에 dom tree로 다 읽어들였으면! document.ready() 	  // 여기가 실행될때 domtree(body)안에 코드를 먼저 ram 저장				 
		$('#b1').click(function() {  	 /* 아이디 태그1를 선택하겠다. #태그=아이디 태그 */ /* documen.getelementbyID 랑 똑같음 */			 
			alert('버튼1을 클릭하셨습니다.')
		})    	
		$('#b2').click(function() {  	 /* 아이디 태그2를 선택하겠다. */				 
			alert('버튼2을 클릭하셨습니다.')
		})    		
		$('#b3').click(function() {  			 
			alert('버튼3을 클릭하셨습니다.')
		})    		
		$('#b4').click(function() {  	 	 
			alert('버튼4을 클릭하셨습니다.')
		})    
	})

</script>
</head>
<body>
	<button id="b1">click me~!</button>
	<button id="b2">push me2~!</button>
	<button id="b3">push me3~!</button>
	<button id="b4">push me4~!</button>
	
</body>
</html>