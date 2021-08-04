<%@page import="db.ADFoodDAO"%>
<%@page import="dto.ADFoodDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
		String ad_writer = request.getParameter("ad_Writer");	// 추후 세션값으로 대체?(연구필요)
		
		ADFoodDTO dto = new ADFoodDTO();
		dto.setAd_Writer(ad_writer);		
		
		ADFoodDAO dao = new ADFoodDAO();
		ADFoodDTO dto2 = dao.read(dto);
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update 입력창</title>
<script type="text/javascript">
	function upD() {
		var upC = confirm('해당 글을 수정하시겠습니까?');
			if (upC) {
				/* location.href="updateConfirm.jsp" */ //지금 페이지에선 사용 안해도 되나 리팩토링 할 때 살펴볼것
				alert('수정이 완료되었습니다.')
			}
	} //업데이트 func end
</script>
</head>
<body>
<form action="updateConfirm.jsp">
<table style="text-align: left;">
	<tr>
		<td>작성자 :</td>  <td><input name="ad_Writer" type="text" value="<%= dto2.getAd_Writer() %>"></td> <!-- 세션으로 자동으로 불러올부분 -->
	</tr>
	<tr>
		<td>가게이름 :</td> <td><input name="ad_Name" type="text" value="<%= dto2.getAd_Name()%>"></td> 
	</tr>
	<tr>
		<td>한줄소개 :</td> <td><input name="ad_Title" type="text" value="<%= dto2.getAd_Title()%>"></td>
	</tr>
	<tr>
		<td>내용 :</td> <td><textarea rows="20" cols="30"  name="ad_Info" placeholder="수정될 내용을 입력하세요" ></textarea></td>
	</tr>
	<tr>
		<td>주소 :</td> <td><input name="ad_IAddress" type="text" value="<%= dto2.getAd_IAddress()%>"></td>
	</tr>
	<tr>
		<td>영업시간 :</td> <td><input name="ad_ITime" type="text" value="<%= dto2.getAd_ITime() %>"></td>
	</tr>
	<tr>
		<td>사진 :</td> <td><input type="file" name="ad_Img" value="<%= dto2.getAd_Img()%>"></td>
	</tr>	
	<tr>
		<td colspan="2"><a style="color: red; font-size: 15px;">지도 사용안할시 입력창에 0을 기입하세요.</a> </td>
	</tr>
	<tr>
		<td>위도 : <input name="ad_Map_1" type="text" placeholder="ex. 12.1234 ,,," value="0" > </td>
		<td>경도 : <input name="ad_Map_2" type="text" placeholder="ex. 123.1234 ,,, " value="0" ></td>
	</tr>
</table>
<hr color="red">
<!--  <button type="submit">저장</button> --> <!-- 에러 떳을시 사용할 버튼 -->
		 <button type="submit" onclick=upD()>저장</button>
		 
		</form>
		<!-- <input type="button" value="수정" onclick=upD()> -->
	</body>
</html>

