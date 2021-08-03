<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%	//스크립트릿 : 자바 코드의 일부분 
		String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	String id2 = "root";
    	String pw2 = "pass";
    	String result = "로그인 실패!";
    	if(id.equals(id2) && pw.equals(pw2)){
    		result = "로그인 성공!";
    		//로그인 성공후에 id를 세션으로 잡아주어야 한다. 
    		// 세션도 내장된 객체로 제공된다.
    		// 자바의 내장된(built-in-Object) 객체: 미리 객체를 만들어서 제공! (세션은 톰캣에서 잡아줌)
    		// 								 request, response, session, out, application
    		// 자바스크립트의 내장된 객체 : location, window, document, history, console
    		//HttpSession session = new HttpSession(); 
    		session.setAttribute("id", id);
    	}else {	
			out.print("재로그인해주세요 <br>");    		
    	}
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
로그인 결과: <%= result %> <br> <!-- 표련식, expression -->
<!-- 세션이 잡혀있는지 아닌지 체크하고자 하는 경우 세션이 null인지를 체크하면 된다.  -->
<!-- id세션이 잡혀있다라는 것은(null이 아니라는것은) 로그인이 성공했다라는 의미로 해석!  -->
<% if(session.getAttribute("id") != null){ %>
	세션 id값은 : <%= session.getAttribute("id") %>
	<a href="logout.jsp">로그아웃 처리</a> 	<!-- 로그인이 됬을때만 로그아웃 보여주기 -->
<%} %>

</body>
</html>