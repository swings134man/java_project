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
<table style="text-align: left;">
	<tr>
		<td>작성자 :</td>  <td><input name="ad_Writer" type="text"></td>
	</tr>
	<tr>
		<td>가게이름 :</td> <td><input name="ad_Name" type="text"></td> 
	</tr>
	<tr>
		<td>한줄소개 :</td> <td><input name="ad_Title" type="text"></td>
	</tr>
	<tr>
		<td>내용 :</td> <td><textarea rows="20" cols="30" placeholder="정보나 소개글을 입력하세요." name="ad_Info"></textarea></td>
	</tr>
	<tr>
		<td>주소 :</td> <td><input name="ad_IAddress" type="text"></td>
	</tr>
	<tr>
		<td>영업시간 :</td> <td><input name="ad_ITime" type="text"></td>
	</tr>
	<tr>
		<td>사진 :</td> <td><input type="file" name="ad_Img"></td>
	</tr>	
	<tr>
		<td colspan="2"><a style="color: red; font-size: 15px;">지도 사용안할시 입력창에 0을 기입하세요.</a> </td>
	</tr>
	<tr>
		<td>위도 : <input name="ad_Map_1" type="text" placeholder="ex. 12.1234 ,,," value="0" > </td>
		<td>경도 : <input name="ad_Map_2" type="text" placeholder="ex. 123.1234 ,,, " value="0" ></td>
	</tr>
</table>
<hr color="red">
		<button type="submit">저장</button>
		</form>
	</body>
</html>
