<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp - response 객체</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	//response.setContentType("");
	response.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(){
		//만약, 아이디와 비밀번호가 맞으면, 로그인 처리하고, login_ok.jsp 로 이동
	} else {
		//일치하지 않으면, 원래 페이지인 loginForm.html 로 이동
	}
%>
</body>
</html>