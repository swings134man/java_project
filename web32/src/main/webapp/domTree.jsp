<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>domTree</title>
<style type="text/css">
	h3 {
		background: yellow;
		width: 400px;
		height: 100px;
		font-size: 45px;
		font-style: italic;
		font-weight: bold;
				
	}
	#result1{
		background: pink;
		width: 600px;
		height: 80px;
		font-size: 20px;
		font-style: italic;
		font-weight: bold;
	}
	.c1{
		background: lime;
	}
	body ul{ /* body 아래의 자손 중에서 ul을 찾아라.  */
		color: red;
	}
	body > ul{ /* body 바로 아래의 자식중에서 ul을 찾아라.  */
		font-weight: bold;
		font-size: 17px;
		list-style: square;
	}
	body #result2 > ul{ /* id가 result2인 태그 아래에 있는 ul */
		color: blue;
	}
	
</style>
</head>
<body>
	<h3>좋아하는 과목</h3>
	<ul>
		<li class="c1">컴퓨터</li>
		<li class="c1">영어</li>
		<li class="c1">마케팅</li>
	</ul>
	<div id="result1">결과가 보여지는 부분</div>
	<div id="result2">
		<span>나는 결과야1</span>
		<ul>
			<li>오늘은 목요일</li>
			<li>내일은 금요일</li>
		</ul>
	</div>

</body>
</html>