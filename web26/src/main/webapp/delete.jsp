<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	// DB 처리하는 DAO 에게 주면서 탈퇴하는 SQL 문을 만들어서 전송 
    	
    	// 가방을 만들엇 ㅓ데이터를 넣자.
    	회원Bag bag = new 회원Bag();
    	bag.setId(id);
		//dao 를 만들어서 탈퇴 요청!
		회원DAO2 dao = new 회원DAO2();
    	int result = dao.delete(bag);
    	
    	String text = "회원탈퇴처리 실패!재시도하세요.";
    	if(result == 1) {
    		text = "탈퇴 성공! ";
    	}

    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>탈퇴 처리창</title>
</head>
<body>
	탈퇴처리 요청함. 
	실행결과 <%=text %> <br>
	<form action="member.jsp">
	<button >홈으로</button>
	</form>
</body>
</html>