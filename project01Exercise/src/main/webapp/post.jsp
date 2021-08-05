<%@page import="db.ADFoodDAO"%>
<%@page import="DTO.ADFoodDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<%
		String ad_writer = request.getParameter("ad_Writer");
		
		ADFoodDTO dto = new ADFoodDTO();
			dto.setAd_Writer(ad_writer);
		
		ADFoodDAO dao = new ADFoodDAO();
			ADFoodDTO dto2 = dao.read(dto);
		
		/* 세션 set */
		String memberId = dto2.getAd_Writer();  // 추후 세션아이디 값 가져올것.
		int memberBusiness = 1;					// 세션 비지니스 인트값 가져올것.
		String id = "admin";
		int memberBusiness1 = 2;
		
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 페이지</title>
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
		
<hr>
		<!-- 아래에는 댓글창 들어갈 화면  -->
		
</body>
</html>