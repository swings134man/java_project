<%@page import="db.ADFoodDAO"%>
<%@page import="dto.ADFoodDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String ad_writer = request.getParameter("ad_Writer");

ADFoodDTO dto = new ADFoodDTO();
dto.setAd_Writer(ad_writer);

ADFoodDAO dao = new ADFoodDAO();
ADFoodDTO dto2 = dao.read(dto);

/* 세션 set */
String memberId = dto2.getAd_Writer();
int memberBusiness = 1;

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>read 페이지</title>
</head>
<body>

	<script type="text/javascript">				/* 버튼 onclick 선언부분 */
		function bt1(){
		 var returnValue = confirm('글을 삭제하시겠습니까?');
			if (returnValue) {
				 var returnPrompt = prompt("아이디를 입력하세요.",""); 	/* 현재 조회한 글 작성자 삭제 방식 도입해야함 */
				 location.href="deleteConfirm.jsp?ad_Writer=" + returnPrompt 
			} //if end
		} //function end
	</script>
	<h3>게시글</h3>
	<hr color="red">
	<table border="1">
		<tr>
			<!-- 1번줄 -->
			<td width="80px">글번호 : <%=dto2.getAd_Num()%></td>
			<td>가게 이름 : <%=dto2.getAd_Name()%></td>
			<td>작성자 : <%=dto2.getAd_Writer()%></td>
		</tr>
		<tr> <!-- 2 번줄 -->
			<td colspan="2">한줄소개 : <%=dto2.getAd_Title()%></td>
			<td>추천수 : <%=dto2.getAd_Recommend() %></td>
		</tr>
		<tr>
			<!-- 3번 -->
			<td>글 내용</td>
		</tr>
		<tr>
			<!-- 4번줄 -->
			<td colspan="3"><%=dto2.getAd_Info()%></td>
		</tr>
		<tr>
			<!-- 5번 -->
			<td colspan="3">업체주소: <%=dto2.getAd_IAddress()%> <br>
				운영시간: <%=dto2.getAd_ITime()%>
			</td>
		</tr>
		<tr>
			<!-- 6번 사진 -->
			<td colspan="2">업체사진: <%=dto2.getAd_Img() %> <br> 
			<img width="200px" height="200px" src="img/<%=dto2.getAd_Img()%>">
			</td>
		</tr>
	</table>
	<hr color="red">
	<button onclick="history.back(1)">back</button>
	<!-- <form action="ADFood.jsp">
		<button>이전화면 으로!</button>
	</form> -->
	
	<!-- 세션으로 visible set -->
	
	<%
		if(memberId == dto2.getAd_Writer() && memberBusiness == 1){ 
	%>
	
	<form action="insertU.jsp">
		<button>글 수정</button>
	</form>
	<input type="button" value="글삭제" onclick=bt1()>
	<%} %>




	<!-- 추천 -->
	
	<a href="http://localhost:8889/project01Exercise/recommend.jsp?ad_Name=<%= dto2.getAd_Name() %>">글추천</a>
	
	 <%-- <form action="recommend.jsp" value="<%= dto2.getAd_Name() %>">
		<button >글추천</button>
	</form>  --%>

	<!-- <input type="button" value="글추천" onclick=rec()> -->

</body>
</html>