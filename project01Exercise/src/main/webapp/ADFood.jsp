<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
				 var returnPrompt = prompt("아이디를 입력하세요.",""); 
				 location.href="deleteConfirm.jsp?ad_Writer=" + returnPrompt 
			} //if end
		} //function end
	</script>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<br>
		<div id="center">
			동네 맛집 정보
			
			<!-- 글쓰기버튼 추후 세션 연동예정 & 권한부여 예정 -->
			<form action="insertC.jsp">
				<button type="submit">글쓰기</button>
			</form>
				
			<!-- 글삭제버튼 추후 게시글 창으로 이동예정(권한) -->
			<input type="button" value="글삭제" onclick=bt1()>
			
			<!-- 글수정버튼 추후 게시글 창으로 이동예정(권한) -->	
			<form action="insertU.jsp">
				<button type="submit">글수정</button>
			</form>	
			<form action="insertR.jsp">
				<button type="submit">작성글 조회</button>
			</form>	
				
				<table>
						<tr> <!-- 1번. 사진 -->
							<td> <!-- 1 번 가게 -->
							
							</td>
							<td> <!-- 2 번 가게 -->
							
							</td>
							<td> <!-- 3 번 가게 -->
							
							</td>
						</tr>
						<tr> <!-- 2번 가게이름. writer -->
							<td> <!-- 1 번 가게 -->
							
							</td>
							<td> <!-- 2 번 가게 -->
							
							</td>
							<td> <!-- 3 번 가게 -->
							
							</td>
						</tr>
						<tr> <!-- 3번 제목  -->
							<td> <!-- 1 번 title -->
							
							</td>
							<td> <!-- 2 번 title -->
							
							</td>
							<td> <!-- 3 번 title -->
							
							</td>
						</tr>
				</table>			
			
			
		</div>
	</div>
	동네 맛집 랭킹
</body>
</html>