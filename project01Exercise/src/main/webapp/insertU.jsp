<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update 입력창</title>
</head>
<body>
<form action="updateConfirm.jsp">

<!-- - 글번호 : <input name="ad_Num" type="text"> <br> --> <!-- auto incre 전에 테스트용 -->
<hr color="green">

- 작성자 : <input name="ad_Writer" type="text" placeholder="글 작성시 사용한 id 작성하세요."> <br>
- 가게이름 : <input name="ad_Name" type="text" placeholder="수정할내용을 작성하세요."> <br>
- 한줄소개 : <input name="ad_Title" type="text" placeholder="수정할내용을 작성하세요."> <br>
- 내용 : <textarea rows="20" cols="30" placeholder="수정할 내용을 작성하세요." name="ad_Info"></textarea> <br>
- 주소 : <input name="ad_IAddress" type="text" placeholder="수정할내용을 작성하세요."> <br>
- 영업시간 : <input name="ad_ITime" type="text" placeholder="수정할내용을 작성하세요."> <br>
- 사진 : <input type="file" name="ad_Img" >

		<button type="submit">저장</button>
		</form>
</body>
</html>