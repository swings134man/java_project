<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	String id = request.getParameter("id");
    	session.setAttribute("id2", id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>check</title>
</head>
<body>

<% if(session.getAttribute("id2") != null){ %>
	세션값 : <%= session.getAttribute("id2") %>
<%} %>


<form action="cafe.jsp">
	<button>cafe</button>
</form>

<form action="mail.jsp">
	<button>mail</button>
</form>

<form action="news.jsp">
	<button>news</button>
</form>
</body>
</html>