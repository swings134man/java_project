<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동네 맛집</title>
<link rel="stylesheet" href="css/out.css">
</head>
<body>
	<script type="text/javascript">				/* 버튼 onclick 선언부분 */
		function bt1(){
		 var returnValue = confirm('글을 삭제하시겠습니까?');
			if (returnValue) {
				 var returnPrompt = prompt("아이디를 입력하세요.",""); 
				 location.href="deleteConfirm.jsp?ad_Writer=" + returnPrompt 
			}
		}
	</script>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<br>
		<div id="center">
			동네 맛집 정보
			<form action="Text.jsp">
				<button type="submit">글쓰기</button>
			</form>
				
			<!-- 글삭제 버튼 -->
			<input type="button" value="글삭제" onclick=bt1()>
					
					
			
		</div>
	</div>
	동네 맛집 랭킹
</body>
</html>