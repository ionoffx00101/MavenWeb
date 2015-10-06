<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="java.util.*" %>
     <%@ page import="org.kdea.spring.service.EmpVO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("utf-8"); %>
<%
/* if(!(boolean)session.getAttribute("logining")){
	location.href="login.jsp";

} */
List<EmpVO> lists =(List<EmpVO>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
<%-- <script type="text/javascript" src="<c:url value="/resources/jquery-2.1.4.min.js"/>"></script> --%>
<script type="text/javascript"> 

</script>
<body>
회원리스트 <br>

<%-- ${list.empno} | ${list.ename} <br> --%>

<c:forEach var="i" items="<%=lists%>" begin="0" end="10" step="1" varStatus="status">
${status.index+1}번  ${i.empno} ${i.ename}<br>

</c:forEach>
</body>
</html>
