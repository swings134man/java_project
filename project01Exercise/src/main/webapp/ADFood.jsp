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
	<div id="total">
	
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div> <br>
		
		<div id="center">
			동네 맛집 정보	
			<form action="Text.jsp">
				<button type="submit">글쓰기</button>
			</form>
		</div>
	</div>
	 	동네 맛집 랭킹	
</body>
</html>