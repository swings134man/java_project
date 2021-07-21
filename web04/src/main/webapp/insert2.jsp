<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    String title = request.getParameter("title");
    String peo = request.getParameter("peo");
    String word = request.getParameter("word");
    String type1 = request.getParameter("type1");
    String type2 = request.getParameter("type2");
    String date2 = request.getParameter("date2");
    String date3 = request.getParameter("date3");
    String date4 = request.getParameter("date4");
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 결과 창</title>
</head>
<body>
제목 : <%= title %> <br>
글쓴이 : <%= peo %> <br>
내용 : <%= word %> <br>
종류 : <%= type1 %> <br>
부서 : <%= type2 %> <br>
날짜 : <%= date2 %>-<%= date3 %>-<%= date4 %> <br>
</body>
</html>