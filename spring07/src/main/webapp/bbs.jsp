<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>second page</title>
</head>
<body>
<a href="index.jsp">to index</a>
<hr>
	<form action="bbs.mega">
			번호 : <input name="bNo"> <br>
			제목 : <input name="title"> <br>
			내용 : <input name="content"> <br>
			작성자 : <input name="writer"> <br>
			날짜 : <input type="date" name="date"> <br>
	<button>게시판 저장</button>
</form>
<a href="bbs?bNo=100&title=test&content=test&writer=test&date=20210827">게시판 신청 완료2</a>
</body>
</html>