<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp - pageContext</title>
</head>
<body>
<h1>pageContext</h1>
<%
	String str = request.getParameter("str");  //test03?str=
	if(str.equals("include")){
		pageContext.include("target.jsp"); //현재 페이지에 target.jsp의 내용을 인클루드하라 
	} else if(str.equals("forward")){
		pageContext.forward("target.jsp"); //현재 페이지로 target.jsp의 내용을 전송해라
	} else {
		out.println("<h2>잘못된 값</h2>");
	}
%>
</body>
</html>