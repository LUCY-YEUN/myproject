<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="num1" value="20" />		<!-- 데이터 타입(int, Double, String 등)을 지정할 수 없음 -->
<c:set var="num2">10.5</c:set>
<c:set var="today" value="<%= new java.util.Date() %>" />

<html>
	<head>
		<title>set 태그와 remove 태그</title>
	</head>

	<body>
	<%
		String str = "JSP 변수";
		request.setAttribute("st", str);
	%>
		변수 : str1 = <%=str%> <br>	<!-- 표현식 태그로는 출력이 가능하지만 -->
		변수 : str2 = ${str} <br>		<!-- 표현 언어로는 출력이 불가능하다(JSP 변수 사용 불가) -->
		변수 : str3 = ${st} <br>		<!-- 표현 언어로 request 객체로 공유되는 name 값은 출력 가능 -->
	<%-- str3의 ${st}가 하는 역할을 풀어서 써보면 아래의 str4처럼 나옴 --%>
	<%
		String s = (String)request.getAttribute("st");
	%>
		변수 : str4 = <%=s%> <br>
	
		변수 num1 = ${num1} <br>
		변수 num2 = ${num2} <br>
		num1 + num2 = ${num1 + num2} <br>
		오늘은 ${today} 입니다.

		<c:remove var="num1" scope="page" />

		<p>
		삭제한 후의 num1 = ${num1} <br>
		삭제한 후의 num1 + num2 = ${num1 + num2}
	</body>
</html>
