<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 1.서버로 전송된 데이터를 받아야 함.  -->
<%
	//자바 코드 써줌. 자바코드 쓸때는 % 사용, 이건 서버에서 실행함. 
	//HttpServletRequest request = new HttpServletRequest();
	String id = request.getParameter("id"); //apple 
	String pw = request.getParameter("pw"); //1234
	String name = request.getParameter("name"); //apple 
	String tel = request.getParameter("tel"); //011 
	
%>
<!-- 2. db 에 넣어야함. -->
<!-- 3. db처리가 잘 되었는지 확인하는 메시지를 클라이언트에 보내주어야 함. -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
회원 정보가 잘 도착하였음. <br>
서버에 도착한 id는 <%= id  %> <br>
서버에 도착한 pw는 <%= pw  %> <br>
서버에 도착한 name는 <%= name  %> <br>
서버에 도착한 tel는 <%= tel  %> <br>

</body>
</html>