<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	Cookie[] cookies= request.getCookies();
    	for(Cookie c : cookies){
			if(!c.getName().equals("JSESSIONID")) {
				//out.print(c.getName() + ", " + c.getValue() + "<br>");
			}
    	}
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page 2</title>
</head>
<body>
쿠키 개수 : <%= cookies.length %>

</body>
</html>