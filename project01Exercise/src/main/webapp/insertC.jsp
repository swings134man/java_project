<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
  		//String id = (String)session.getAttribute("id");
    	String memberId = "";
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 창</title>
</head>
<body>
<form action="createConfirm.jsp">

<!-- - 글번호 : <input name="ad_Num" type="text"> <br> --> <!-- auto incre 전에 테스트용 -->
<!-- - 작성자 : <input name="ad_Writer" type="text" value="${id}"> <br> -->   <!-- 세션받아오면 활성화 -->
- 작성자 : <input name="ad_Writer" type="text"> <br>
- 가게이름 : <input name="ad_Name" type="text"> <br>
- 한줄소개 : <input name="ad_Title" type="text"> <br>
- 내용 : <textarea rows="20" cols="30" placeholder="정보나 소개글을 입력하세요." name="ad_Info"></textarea> <br>
- 주소 : <input name="ad_IAddress" type="text"> <br>
- 영업시간 : 
		<input name="ad_ITime" type="text"> <br>

- 사진 : <input type="file" name="ad_Img">


		<button type="submit">저장</button>
		</form>
	</body>
</html>
