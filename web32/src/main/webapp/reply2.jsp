<%@page import="shop.db.댓글DAO"%><%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><jsp:useBean id="dto" class="shop.dto.댓글DTO"></jsp:useBean><jsp:setProperty property="*" name="dto"/>
    
    <%
    	댓글DAO dao = new 댓글DAO();
    	int result = dao.create(dto);
   		%><%= result %>
  