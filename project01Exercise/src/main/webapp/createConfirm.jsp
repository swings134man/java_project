<%@page import="DTO.ADFoodDTO"%>
<%@page import="db.ADFoodDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
		ADFoodDAO dao = new ADFoodDAO();
    	ADFoodDTO dto = new ADFoodDTO(); //bag
    	
    	
    	String ad_Writer = request.getParameter("ad_Writer");
    	String ad_Title = request.getParameter("ad_Title");
    	String ad_Info = request.getParameter("ad_Info");
    	String ad_IAddress = request.getParameter("ad_IAddress");
    	String ad_ITime = request.getParameter("ad_ITime"); 
    	String ad_Img = request.getParameter("ad_Img");
    	String ad_Name = request.getParameter("ad_Name");
    	String ad_Map_10 = request.getParameter("ad_Map_1");
    	String ad_Map_20 = request.getParameter("ad_Map_2");
    	
    	// 경도,위도 값 float 형변환 
    	float ad_Map_1 = Float.parseFloat(ad_Map_10);
    	float ad_Map_2 = Float.parseFloat(ad_Map_20);
    	
    	dto.setAd_Writer(ad_Writer);
    	dto.setAd_Title(ad_Title);
    	dto.setAd_Info(ad_Info);
    	dto.setAd_IAddress(ad_IAddress);
    	dto.setAd_ITime(ad_ITime);
    	dto.setAd_Img(ad_Img);
    	dto.setAd_Name(ad_Name);
    	dto.setAd_Map_1(ad_Map_1);
    	dto.setAd_Map_2(ad_Map_2);
    	
    	dao.create(dto);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB 입력 테스트창</title>
</head>
<body>
		테스트 글작성 성공!	<br>
		<%= dto.getAd_Img() %>
		<form action="ADFood.jsp">
			<button>홈으로 가기</button>
		</form>
		
</body>
</html>