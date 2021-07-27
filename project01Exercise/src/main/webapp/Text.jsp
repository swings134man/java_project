<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 창</title>
</head>
<body>
<form action="TEST01.jsp">

- 작성자 : <input name="ad_Writer" type="text"> <br>
- 제목 : <input name="ad_Title" type="text"> <br>
- 내용 : <textarea rows="20" cols="30" placeholder="정보나 소개글을 입력하세요." name="ad_Info"></textarea> <br>
- 주소 : <input name="ad_IAddress" type="text"> <br>
- 영업시간 : <input name="ad_ITime" type="text"> <br>

<button type="submit">저장</button>
</form>
</body>
</html>