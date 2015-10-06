<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% session.setAttribute("logining", false); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
<%-- <script type="text/javascript" src="<c:url value="/resources/jquery-2.1.4.min.js"/>"></script> --%>
<script type="text/javascript"> 
$(function() {
$('#form').submit(function(evt) {	
		
		$.ajax({type:"post", url:"<c:url value="/login"/>", dataType:"json",  data:{'id':$('#id').val(),'pw':$('#pw').val()},success: function(res){
			
			if(res.check){
				alert("로그인성공");
	
			}
			else{
				alert("로그인 실패");
			}
			}
		}); 
		evt.preventDefault();
	});
});
</script>
<body>
<form id="form"><%-- action="<c:url value="/login"/>" method="post"  --%>
id =<input type="text" name="id" id="id" value="7839"><br>
name = <input type="text" id ="pw" name="pw" value="KING"><br>
<button type="submit">버튼</button>
</form>
<a href="<c:url value="/lnkemplist"/>">................</a>
</body>
</html>
