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
<h3> 게시글 </h3>
<hr color="red">
	<table border="1">
		<tr> <!-- 1번줄 -->
			<td width="80px">
				글번호 : <%= dto2.getAd_Num() %>
			</td>
			<td>
				제목 : <%= dto2.getAd_Title() %>			
			</td>
			<td>
				작성자 : <%= dto2.getAd_Writer() %>
			</td>
		</tr>
		<tr>  <!-- 2번 -->
			<td> 
				글 내용 
			</td>		
		</tr>
		<tr> 	<!-- 3번줄 -->
			<td colspan="3">
				<%= dto2.getAd_Info() %>
			</td>
		</tr>
		<tr>	<!-- 4번 -->
			<td colspan="3">
				업체주소: 	<%= dto2.getAd_IAddress() %> <br>
				운영시간:	<%= dto2.getAd_ITime() %>
			</td>
		</tr>	
		<tr> <!-- 5번 사진 -->
			<td colspan="2">
				업체사진: 	<%= dto2.getAd_Img() %> <br>
				<img width="200px" height="200px" src="img/<%= dto2.getAd_Img() %>" >
			</td>
		</tr>
	</table>
<hr color="red">
	<form action="ADFood.jsp">
		<button>이전화면 으로!</button>
	</form>
	<form action="insertU.jsp">
		<button>글 수정</button>
	</form>
<input type="button" value="글삭제" onclick=bt1()>
</body>
</html>