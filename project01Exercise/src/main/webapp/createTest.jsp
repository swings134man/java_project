<%@page import="dto.ADFoodDTO"%>
<%@page import="db.ADFoodDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	/* String ad_Num = request.getParameter("ad_Num"); */		/* autoincrement 전에 테스트용 */
    	String ad_Writer = request.getParameter("ad_Writer");
    	String ad_Title = request.getParameter("ad_Title");
    	String ad_Info = request.getParameter("ad_Info");
    	String ad_IAddress = request.getParameter("ad_IAddress");
    	String ad_ITime = request.getParameter("ad_Writer");
    
    	ADFoodDAO dao = new ADFoodDAO(); 
    	ADFoodDTO dto = new ADFoodDTO(); //bag 
    	/* dto.setAd_Num(ad_Num); */
    	dto.setAd_Writer(ad_Writer);
    	dto.setAd_Title(ad_Title);
    	dto.setAd_Info(ad_Info);
    	dto.setAd_IAddress(ad_IAddress);
    	dto.setAd_ITime(ad_ITime);
    	
    	dao.create(dto);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB 입력 테스트창</title>
</head>
<body>
		테스트 성공
		<form action="home.html">
			<button>홈으로 가기</button>
		</form>
		
</body>
</html>