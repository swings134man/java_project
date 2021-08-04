<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="dto.ADFoodDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="db.ADFoodDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%
		ADFoodDAO dao = new ADFoodDAO();
		ArrayList<ADFoodDTO> list = dao.read();
	
		/* 세션set admin 권한 */
		String memberId = "admin";		// 추후 세션 아이디 값 
		int memberBusiness = 2;			// 세션 비지니스 값 
		
		
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동네 맛집</title>
<link rel="stylesheet" href="css/out.css">
</head>
<body>
	<script type="text/javascript">				/* 버튼 onclick 선언부분 */
		function bt1(){
		 var returnValue = confirm('글을 삭제하시겠습니까?');
			if (returnValue) {
				 var returnPrompt = prompt("작성자 아이디를 입력하세요.",""); 
				 location.href="deleteConfirm.jsp?ad_Writer=" + returnPrompt 
			} //if end
		} //function end
	</script>
	<!-- 상단 탭 -->
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<br>
		<!-- 리스트업 화면 -->
		<div id="center">
			동네 맛집 정보
			<!-- 관리자 권한 (관리자만 보임) -->			
			<%
				if(memberId.equals("admin") && memberBusiness == 2){
			%>
			<!-- 글쓰기버튼 추후 세션 연동예정 & 권한부여 예정 -->
			<form action="insertC.jsp">
				<button type="submit">글쓰기(admin)</button>
			</form>
				
			<!-- 글삭제버튼 추후 게시글 창으로 이동예정(권한) -->
			<input type="button" value="글삭제(admin)" onclick=bt1()>
			
			<!-- 글수정버튼 추후 게시글 창으로 이동예정(권한) -->	
			<form action="insertU.jsp">
				<button type="submit">글수정(admin)</button>
			</form>	
			<%} %>
			<hr color="red">
			
			<!-- 동네 맛집랭킹 list up 3개  --> 
				<h3>동네 맛집 추천!</h3>
				 <table border="1" style="width: 850px;">
				 <%
				 for (int i = 0; i < 3; i++  ) {
						ADFoodDTO dto1 = list.get(i);
				 %>
						<tr> <!-- 1번. 사진 -->
							<td width="13%"><a href="http://localhost:8889/project01Exercise/post.jsp?ad_Writer=<%=dto1.getAd_Writer()%>" ><img width="80px" height="80px" src="img/<%= dto1.getAd_Img() %>" ></a></td>
							<td width="20%"> 가게 이름 :<%= dto1.getAd_Name() %></td>
	   <!-- 3번 제목 title --><td> 가게 한줄 소개 :<%= dto1.getAd_Title() %></td>
							<td width="8%">추천수 : <%= dto1.getAd_Recommend() %></td>
	<!--2번 가게이름. writer--><td width="15%"> 작성자 :	<%= dto1.getAd_Writer() %></td>
						</tr>
						<%
						}
						%>
				</table>			 
			<a href="readAll.jsp">게시판 전체글 조회</a>
		</div>
	</div>
	동네 맛집 랭킹
</body>
</html>