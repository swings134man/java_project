<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    		//String id = (String)session.getAttribute("id");
    		String id ="";
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 안잡았을때 테스트 </title>
</head>
<body>

<form action="insert.jsp">
게시 제목 : <input name="title"> <br>
게시 내용 : <input name="content"> <br>
<%-- 게시 작성자 : <input name="writer" value="${id}"> <br> --%> <!-- 세션 연결하고 실제 사용 코드 -->
게시 작성자 : <input name="writer" value="<%= id %>"> <br> <!-- 연결전에 테스트용 코드 id 는 테스트용 String 변수 -->

<%-- value="<%= session.getAttribute("id") %>" --%> 
</form>


</body>
</html>