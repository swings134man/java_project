<%@page import="com.mega.mvc07.BbsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbs 결과창</title>
</head>
<body>
게시판 입력 정보 확인
<hr color="red">
게시판 번호: ${bbsDTO.bNo} <br> 	<%-- 왼쪽꺼랑 똑같음. toSring이 되어있어야함. <%= bbsDTO.getbNo() %> --%>
게시판 제목: ${bbsDTO.title} <br> 
게시판 내용: ${bbsDTO.content} <br> 
게시판 작성자: ${bbsDTO.writer} <br> 
</body>
</html>