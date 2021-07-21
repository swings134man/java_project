<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String car1 = request.getParameter("car1");
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<hr color="red">
<h2>축하 합니다!!!!</h2>
<%= car1 %> 를 구입하셨습니다!!!
<hr color="red">

<table>
<tr>
<iframe width="300" height="300" src="https://www.youtube.com/embed/AWrXKyFzg0o" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</tr>
</table>

</body>
</html>