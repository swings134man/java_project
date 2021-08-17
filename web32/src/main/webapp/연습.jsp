<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습창</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
		var time = new Date();
		year = time.getFullYear();
		month = time.getMonth();
		date = time.getDate();
		ho = time.getHours();
		min = time.getMinutes();
		var ad_Time = year +'.' + (month + 1) +'.' + date + '. ' +	ho + ':' + min+ ' '; 
		
		idVa = $('#id1').val();	
		conVa = $('#content').val();
		resVa = $('#result1');
			if (conVa == "" && idVa == "") {
				alert('공백 입력불가')
			} else {
				resVa.append(idVa + ' : ' + conVa+ ' time : ' + time2 + '<hr>')
			}		
				$('#content').val('');
				$('#id1').val('');
		})
	})//end
	
</script>
</head>
<body>
	아이디 입력 : <input id='id1'> <br>
	댓글입력 : <input id='content'>
	<button id=b1>댓글달기</button> 
	<hr color="red">
	댓글 목록
	<div id='result1'></div>
	
</body>
</html>