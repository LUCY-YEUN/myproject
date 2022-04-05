<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<html>
	<head>
	<meta charset="utf-8">
	<title>Insert title here</title>
	</head>
<%
	String id = (String)session.getAttribute("id");	// 세션으로 ID 값을 가져왔는데(LoginServlet.java에서 불러옴)
%>
<body>
<%
	if(id == null){									// 그 ID 값이 비어있으면
%>
   <a href="login.jsp" target="rightFrame" />로그인</a>
<% 
	}
	else{											// 비어있지 않으면(세션이 연결되면)
%>
	<%=id %> 님 환영합니다.
<%
	}
%>

</body>
</html>