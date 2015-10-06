<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%
boolean check =(boolean)request.getAttribute("check");
%>
{"check":<%=check%>}