<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link rel="stylesheet" href="css/out.css">
</head>
<body>
<div id="total">
	<div id="top">
		<jsp:include page="top.jsp"></jsp:include>
	</div>
	<div id="top2">
		<jsp:include page="top2.jsp"></jsp:include>
	</div>
	<div id="center">
		<form action="">
				ID: <input name="id"><br> 제목: <input name="title"><br>
				내용: <input name="content"><br> 작성자: <input name="writer"><br>
				<button>게시판 글씨기 처리</button>
			</form>
			<h3>게시판 하나검색</h3>
			<form action="read3.jsp">
				ID: <input name="id"><br> 
				<button>게시판 하나 검색 처리</button>
			</form>
			<a href="all3.jsp">게시판 모든 목록 가지고 오는 페이지 호출</a>
	</div>
</div>


</body>
</html>