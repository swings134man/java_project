<%@page import="java.util.ArrayList"%>
<%@page import="DTO.CommentDTO"%>
<%@page import="db.CommentDAO"%>
<%@page import="db.ADFoodDAO"%>
<%@page import="DTO.ADFoodDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<%
		// -------------- 페이지 DB ---------------------------
		String ad_writer = request.getParameter("ad_Writer");
		ADFoodDTO dto = new ADFoodDTO();
			dto.setAd_Writer(ad_writer);
		
			ADFoodDAO dao = new ADFoodDAO();
			ADFoodDTO dto2 = dao.read(dto);
			
		// -------------- 댓글 DB ---------------------------	
		int	ad_FoodNum = Integer.parseInt(dto2.getAd_Num());   // 페이지 번호(페이지 id)인 num은 string 값이기때문에 DB 넘길떄를 위해 int 변환.
		CommentDAO daoC = new CommentDAO(); 
		ArrayList<CommentDTO> list = daoC.read(ad_FoodNum);
		
		/* 세션 set */
		String memberId = dto2.getAd_Writer();  // 추후 세션아이디 값 가져올것.
		int memberBusiness = 1;					// 세션 비지니스 인트값 가져올것.
		String id = "admin";					// 댓글 아이디 --> 세션 
		//String id = null;
		int memberBusiness1 = 2;
		
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 페이지</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
					/* 댓글 기능 func */
	$(function() {
		$('#bt1').click(function() {
			// 시간 
			var time = new Date();
			ad_Time1 = time.toLocaleString();
			// 댓글 입력 값 
			commentM = $('#comment').val();
			$.ajax({
				url: "commentReply.jsp",  // dao 로 넘겨주는 jsp 페이지 연동. 
				data: {
					ad_FoodNum : '<%= ad_FoodNum %>' , 
					ad_Content : commentM , 
					ad_Writer : '<%= id %>',
					ad_Time : ad_Time1 
				},
				success: function(result) {
					if (result == 1) {
							location.href = "http://localhost:8889/project01Exercise/post.jsp?ad_Writer=<%=dto2.getAd_Writer()%>"
							/* $('#Con1').attr('style', "display:'';");  //나타내기
							$('#Con2').attr('style', "display:none;");  //숨기기 */
						} //if end				
					} //success end 
				}) //ajax
		}) //click end 

		
		
		
		
		
		
			
	}) //func end 
</script>
	<!-- 댓글 수정2  -->
<%-- <script type="text/javascript">
<%for(int i = 0; i < list.size(); i++) {%> 
	
	$(function() {
		nuTag = document.getElementById("number");
		nuValue = nuTag.value;
		
	 	 num1 = $('#number').val();
	 	 
    	if( <%= i %> == num1 ) {
		$('.fix_func' + num1).click(function() {
			console.log(nuValue);
			console.log(num1);
			$('.conS'+ num1).attr('style', "display:none;");  // 숨기
			$('.conH'+ num1).attr('style', "display:'';");  //  나타 
			$('.conH' + num1).show();  //나타내기
			$('.conS' + num1).hide();  //숨기기  d
		}) 
		}
		
	})




 <% }%> 
</script> --%>

</head>
<body>
	<!-- 추천 메서드 -->
	<script type="text/javascript">
		function like1() {
			var con = confirm('해당 가게를 추천 하시겠습니까?');
			  if (con) {
				location.href="http://localhost:8889/project01Exercise/recommend.jsp?ad_Name=" + '<%= dto2.getAd_Name() %>';
				alert('추천이 완료되었습니다!');
			} 
		} //추천 func end
	</script>
	<!-- delete 메서드 -->
	<script type="text/javascript">
		function del() {
			var del1 = confirm('글을 정말 삭제하시겠습니까?');
				if (del1) {
					alert('글이 삭제되었습니다.');
					location.href="deleteConfirm.jsp?ad_Writer=" + '<%= dto2.getAd_Writer()%>';
			}
		} //삭제 func end
	</script> 
	<!-- 댓글 삭제  -->
	<script type="text/javascript">
		function delCo(CoNum) {
			var del1 = confirm('글을 정말 삭제하시겠습니까?');
				if (del1) {
					alert('글이 삭제되었습니다.');
					location.href="DeleteComment.jsp?ad_CoNum=" + CoNum;
			}
		} //삭제 func end
	</script>  
		 <!-- 댓글 수정 -->
	 <!-- <script type="text/javascript">
			 function modify(CoNum) {
				 hi1 = document.getElementById("hidden1");
				 hi1V= hi1.value; 
				if (hi1V) {
				}
						$('#teV').attr('style', "display:show;");  //td 나타내기
						$('#teV1').attr('style', "display:'';");  //텍스트 창 나타내기
						$('#CoV').attr('style', "display:none;");  // 원래 댓글 내용 숨기기
			}
		</script>  -->
	
	<h3>게시글</h3>
	<hr color="red">
												<!-- 게시판 테이블 디자인 및 배치 수정 해야함  -->
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
							운영시간: <%=dto2.getAd_ITime()%></td>
		</tr>
		<tr>
			<!-- 6번 사진 -->
					<td colspan="2">업체사진: <%=dto2.getAd_Img() %> <br> 
				<img width="200px" height="200px" src="img/<%=dto2.getAd_Img()%>">
			</td>
		</tr>
		<tr>
			<td colspan="3"><div id="map" style="width:100%;height:250px;">업체 위치</div></td>
		</tr>
	</table>
	
		
	 <!-- 지도 ,,, -->
		<!-- <div id="map" style="width:20%;height:250px;"></div> -->
		<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=12834938b9d60b4b8bc5becd102451f4"></script>
		<script>
			var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
			    mapOption = { 
			        center: new kakao.maps.LatLng(<%= dto2.getAd_Map_1() %>, <%= dto2.getAd_Map_2() %>), // 지도의 중심좌표
			        level: 3 // 지도의 확대 레벨
			    };

			var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

			// 마커가 표시될 위치입니다 
			var markerPosition  = new kakao.maps.LatLng(<%= dto2.getAd_Map_1() %>, <%= dto2.getAd_Map_2() %>); 
			
			// 마커를 생성합니다
			var marker = new kakao.maps.Marker({
			    position: markerPosition
			});

				// 마커가 지도 위에 표시되도록 설정합니다
				marker.setMap(map);
				
				// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
				// marker.setMap(null);    
			</script>
	<hr color="red">	
	<button onclick="history.back(1)">back</button>
											<!-- 세션으로 visible set 버튼 -->
	<%
		if((memberId == dto2.getAd_Writer() && memberBusiness == 1) || (id == "admin" && memberBusiness1 == 2)){ 
	%>
	
	<!-- <form action="insertU.jsp">
		<button>글 수정</button>
	</form> -->
	
	<a href="http://localhost:8889/project01Exercise/insertU.jsp?ad_Writer=<%= dto2.getAd_Writer()%>"><button>수정</button></a>
			
	<input type="button" value="글삭제" onclick=del() style="color: red;">
	<%} %>
	
	<!-- 추천 -->
	<input type="button" value="추천~!" onclick=like1()>  <!-- 이거 사용하는 방향으로 갈것 -->
		
<hr color="red">
		<!-- 아래에는 댓글창 들어갈 화면  -->
		<h4>댓글</h4>
		
		<% if(id != null)  {%>
		<hr>
		<input id="comment" placeholder="댓글을 입력하세요." style="width: 300px; height: 50px;"><br> <!-- 입력창 id = comment -->
		<button id="bt1">댓글달기</button> <br>													 <!-- 버튼 id = bt1 -->
		<hr>
		<%} %>
		<!--  아래댓글 목록  -->
		<div id="commentList">	
					<!-- 댓글 수정 1 -->				<!-- 댓글목록 id = commentList -->
			 <%-- <% for(CommentDTO dto3 : list) { %>
			
				 <table>
			<tr>
				<td><%= dto3.getAd_Writer() %></td>
				<td style="font-size: 12px;"><%= dto3.getAd_Time() %></td>
				<td> <a id= "comR1" ><%= dto3.getAd_CoNum() %></a>	</td>     <!--  -->
			</tr>
			<tr>
				<td id="CoV" colspan="3" style="display: show;"><%= dto3.getAd_Content() %></td>
				<td id="teV" colspan="3"  style="display: hide;"><textarea id="teV1" style="display: none;" rows="4" cols="30" id="ta1" ></textarea></td>
			</tr>
< 				<tr>
					<% if(dto3.getAd_Writer().equals(id)) {  %>
				<td align="right"> 
					
					<!-- 댓글 수정 버튼 -->
					<input type="button" value="수정" onclick=modify() >
					<input type="hidden" id="hidden1" value=<%= dto3.getAd_Content()%> >
					<!-- <button type="submit" id="mo1">저장</button> -->
					 <script type="text/javascript">
					 function modify() {
						
						
						$('#teV').attr('style', "display:show;");  //td 나타내기
						$('#teV1').attr('style', "display:'';");  //텍스트 창 나타내기
						$('#CoV').attr('style', "display:none;");  // 원래 댓글 내용 숨기기
						
					</script>
					
					 <input type="button" value="댓글삭제" onclick=delCo(<%= dto3.getAd_CoNum() %>) style="color: red;">
										 
				</td>
					<%}%>
				</tr>
 			</table>
			<hr>
			<%} %> 
		</div> --%>
		<!-- 댓글 수정 2 -->
		<%for(int i = 0; i < list.size(); i++) {%>
			
			 <table>
			<tr>
				<td> <a id= "num1" ><%= list.get(i).getAd_CoNum() %></a>	</td>     <!--  -->
				<td><%= list.get(i).getAd_Writer() %></td>
				<td style="font-size: 12px;"><%= list.get(i).getAd_Time() %></td>
			</tr>
			<tr>
				<td id="Con1<%= i %>" class="conS<%= i %>"	colspan="3" style="display: show;"><%= list.get(i).getAd_Content() %></td>
				<td id="Con2<%= i %>" class="conH<%= i %>"	colspan="3" style="display: none;"  ><textarea id="Con2"  rows="4" cols="30" id="ta1" ></textarea></td>
			</tr>
< 				<tr>
				
				<td align="right"> 
					
					<!-- 댓글 수정 버튼 -->
					
					<input id="fixbt1<%= i %>" class="fix_func<%= i %>"	type="button" value="수정">
					<input type="hidden" id="number" value="<%= i %>" >
					<!-- <button type="submit" id="mo1">저장</button> -->
					
					
					 <input type="button" value="댓글삭제" onclick=delCo(<%= list.get(i).getAd_CoNum() %>) style="color: red;">
										 
				</td>
				</tr>
 			</table>
 			<hr>
		<%} %>
		</div>
		
		
</body>
</html>