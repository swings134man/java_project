<%@page import="shop.dto.댓글DTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.댓글DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
     	String boardId = "100"; // 나중에는 리퀘스트 겟 파라메
     	session.setAttribute("userId", "apple");
    	// boardid에 해당하는  상세페이지 read.  BoardDAO 
    	// boardId의 댓글 리스트를 가져와야함 ArryList. ReplyDAO 
    	// 시작하자마자. 
    	
    	댓글DAO dao2 = new 댓글DAO();
  	 	ArrayList<댓글DTO> list = dao2.read(boardId);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>댓글달기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			com = $('#content').val();
			$.ajax({	// 비동기식 으로 호출만해줌. 
				url: "reply2.jsp" ,
				data: {
					boardId : '<%= boardId %>' ,     
					content : com,
					writer : '<%= session.getAttribute("userId") %>' 
				},
				success: function(result) {
					//alert(result)
					if (result == 1) {
						<%-- location.href="board.jsp?boardid=<%= boardId %>" --%> //이게 원래쓰는 정답임. 
						location.href = "댓글달기.jsp"
					}// if
				} // success func
			}) //ajax
			
		})// click 
	}) //func end
	
	// 아래 코드는 DB 연동 안한 상태로 html 에 찍어주는것. 
	/* com2 = $('#result1') */
	/* if (com.val() == "") {
		alert('공백사용은 안됩니다.')
	}else {
	/* com2.append(com.val() + '<hr>') */ //Db 에서 읽어올것이라서  필요없음. 
	//$('result1').append(com.val() + '<hr>') // 한문장에 끝낼수 있음 simple
	//$('#content').val('')
	//} */
	
</script>
</head>
<body>
<!-- Db연동2개 해야함. 상세페이지(게시물 내용), 댓글  -->
boardId: <input id="boardId" value="100"> <br>
게시물내용 : <textarea rows="5" cols="20">
			나는 게시물 내용이 들어가는곳.. 
			</textarea>
			<hr color="blue"> 
댓글입력 : <input id='content'> <br>
	<button id=b1>댓글달기</button> 
	<hr color="red">
	<div id='result1'>
		<% for(댓글DTO dto3 : list) {  %>
		- <%= dto3.getContent() %>, 작성자 : <%= dto3.getWriter() %> <br>
		
		<%} %>
	</div>
</body>
</html>