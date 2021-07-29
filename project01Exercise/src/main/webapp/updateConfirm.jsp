<%@page import="db.ADFoodDAO"%>
<%@page import="dto.ADFoodDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String ad_Writer = request.getParameter("ad_Writer");
	String ad_Title = request.getParameter("ad_Title");
	String ad_Info = request.getParameter("ad_Info");
	String ad_IAddress = request.getParameter("ad_IAddress");
	String ad_ITime = request.getParameter("ad_ITime");
	String ad_Img = request.getParameter("ad_Img");
	
	ADFoodDTO dto = new ADFoodDTO();
	ADFoodDAO dao = new ADFoodDAO();
	dto.setAd_Writer(ad_Writer);
    dto.setAd_Title(ad_Title);
    dto.setAd_Info(ad_Info);
    dto.setAd_IAddress(ad_IAddress);
    dto.setAd_ITime(ad_ITime);
    dto.setAd_Img(ad_Img);
   	
    dao.update(dto);
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>

<hr color="purple">
	글수정이 완료되었습니다!
	<hr color="purple"> 
	<form action="placeM.html">
		<button>HOME 으로 가기!</button>
	</form>

</body>
</html>