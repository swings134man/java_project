<%@page import="java.util.ArrayList"%>
<%@page import="dto.ADFoodDTO"%>
<%@page import="db.ADFoodDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String ad_Writer = request.getParameter("ad_Writer");

ADFoodDTO dto = new ADFoodDTO();
dto.setAd_Writer(ad_Writer);

ADFoodDAO dao = new ADFoodDAO();
 	ADFoodDTO dto2 = dao.read(dto);




%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색 게시판 목록</title>
</head>
<body>
	<h3>게시판 글 검색 목록</h3>
	<hr color="green">
	<table border=1>
		<tr bgcolor="green">
			<th>사진</th>
			<th>글번호</th>
			<th>제목</th>
			<th>가게이름</th>
		</tr>
		
		<tr>
			<td><a href="http://localhost:8889/project01Exercise/post.jsp?ad_Writer=<%=dto2.getAd_Writer()%>"><img width="80px" height="80px" src="img/<%= dto2.getAd_Img() %>"></a></td>
			<td><%=dto2.getAd_Num()%></td>
			<td><a
				href="http://localhost:8889/project01Exercise/post.jsp?ad_Writer=<%=dto2.getAd_Writer()%>">
					<!-- 제목 눌렀을때 이동 --> <%=dto2.getAd_Name()%>
			</a></td>
			<td><%=dto2.getAd_Writer()%></td>
		</tr>
	
	</table>

	<hr color="red">
	
	<br>
	<form action="insertC.jsp">
		<button type="submit">글쓰기</button>
	</form>
	<hr color="red">
	
	<form action="readOne.jsp">
		- 작성자 아이디 : <input name="ad_Writer" type="text" placeholder="글 작성시 사용한 id 작성하세요."> <br>

	<button type="submit">조회!</button>
	</form>
	
	<button onclick="history.back(1)">back</button>

</body>
</html>