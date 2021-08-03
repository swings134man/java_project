<%@page import="java.util.ArrayList"%>
<%@page import="dto.ADFoodDTO"%>
<%@page import="db.ADFoodDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
ADFoodDAO dao = new ADFoodDAO();
ArrayList<ADFoodDTO> list = dao.read();

String memberId = "test";
int memberBusiness = 1;

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 게시판 목록</title>
</head>
<body>
	<h3>게시판 전체 글 조회 목록</h3>
	<hr color="green">
	<table border=1>
		<tr bgcolor="green">
			<th>사진</th>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
		</tr>
		<!-- 여기까지는 반복하면 안됨. for문 밖에  -->
		<%
		for (ADFoodDTO dto : list) {
		%>
		<tr>
			<td><a href="http://localhost:8889/project01Exercise/post.jsp?ad_Writer=<%=dto.getAd_Writer()%>" ><img width="80px" height="80px" src="img/<%= dto.getAd_Img() %>" ></a></td>
			<td><%=dto.getAd_Num()%></td>
			<td><a
				href="http://localhost:8889/project01Exercise/post.jsp?ad_Writer=<%=dto.getAd_Writer()%>">
					<!-- 제목 눌렀을때 이동 --> <%=dto.getAd_Title()%>
			</a></td>
			<td><%=dto.getAd_Writer()%></td>
		</tr>
		<%
		}
		%>
	</table>

	<hr color="red">
	전체 게시판 목록 개수 :
	<%=list.size()%>
	<br>
	<!-- 세션 글쓰기 버튼 활성화 부분 -->
	<%
		if(memberId != null && memberBusiness == 1){
	%>
	<form action="insertC.jsp">
		<button type="submit">글쓰기</button>
	</form>
	<%} %>
	
	<hr color="red">
	
	<form action="readOne.jsp">
		- 작성자 아이디 : <input name="ad_Writer" type="text" placeholder="글 작성시 사용한 id 작성하세요."> <br>

	<button type="submit">조회!</button>
	</form>
	
	<button onclick="history.back(1)">back</button>

</body>
</html>