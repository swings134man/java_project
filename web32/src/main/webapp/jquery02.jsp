<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jquery02</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
//$() : body 태그 안을 먼저 램에 dom tree로 읽어들여라.(loading) 
//$(function(){}) : body를 다 읽어들인후, 입력값으로 넣은 이름없는 함수부분을 실행해주세요.
	$(function() {
		//alert('dom tree 모두 읽어들였음.!!!!')
		$('#b1').click(function() {
			location.href = "domTree.jsp";
		});
		$('#b2').click(function() {
			//1, 2, 3입력값 가지고 와야함. 
			in1Value = $('#in1').val()
			alert(in1Value)
			$('#in1').val('')
			// 사이트를 찾아서, 조건에 따라서 사이트로 전환! 
		});
		$('#b3').click(function() {
			//1, 2, 3입력값 가지고 와야함. 
			in1Value = $('#in2').val()
			if (in1Value == 1) {
				location.href = "http://www.naver.com";
			} else if(in1Value == 2){
				location.href = "http://www.daum.net";
			} else if (in1Value ==3 ) {
				location.href = "http://www.google.co.kr";
			} else{
				alert('1,2,3 번 중에서 선택해주세요!')
				$('#in2').val('')
			}
		});
		$('#b4').click(function() {
			rain = $('#in3').val()
			clo = $('#in4').val()
			result1Tag = $('#result1')
			if ((rain == 1) || (clo == 1) ) { //논리연산자 : &&,||, !
				//alert('우산을 가져가세요!')
				//result1Tag.text('우산을 가지고 가자')
				result1Tag.append('<font color=blue> 우산을 가지고 가자</font><br>')		
				$('#in3').val('')
				$('#in4').val('')
			} else if((rain == 2 ) || (clo == 2)){
				//alert('우산을 안챙겨도 됩니다.')
				//result1Tag.html('<font color=red> 우산을 가지고 가지 말자</font>')
				result1Tag.append('<font color=red> 우산을 가지고 가지 말자</font><br>')
				$('#in3').val('')
				$('#in4').val('')
			} else if((rain !=1 || 2) || (clo != 1 || 2) ){
				//alert('1,2 번만 선택해주세요!')
			}
			rain.val('')
			clo.val('')
		})
		
	}) // 전체 func end 
</script>
</head>
<body>

	<button id=b1>사이트 이동</button> <br>
먹고싶은 음식 1) 커피, 2)짬뽕, 3) 고기 : <input  id='in1'>
	<button id=b2>입력값 읽어서 처리</button> <br>
이동할 사이트 1) 네이버, 2) 다음, 3) 구글 : <input  id='in2'>	
	<button id=b3>입력값 읽어서 처리2</button> <br> <hr>
비가오나요 1)온다, 2)안온다. <input  id='in3'>	<br>
구름이 많은가요 1)많다, 2)아니다.<input  id='in4'>	
	<button id=b4>입력값 읽어서 처리2</button> 
<hr color="red">
	<div id='result1'>결과가 나타나는 부분</div>
	<!-- <div id='result2'><font color="blue">결과가 나타나는 부분</font></div> -->  <!-- result1Tag.html() 괄호 안에 이렇게 들어가게됨 -->
</body>
</html>