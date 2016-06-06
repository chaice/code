<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String[] strs = { "aa", "bb", "cc", "dd" };
	%>
	<c:set var="s" value="444"></c:set>
	<c:forEach var="i" begin="1" end="5"><c:out value="${i}"></c:out><br/></c:forEach>
	<c:forEach var="st" items="${strs}">
		${st}
	</c:forEach>
	<c:choose>
		<c:when test="${s eq 334}">false</c:when>
		<c:when test="${s eq 444}">false</c:when>
		<c:otherwise>tom</c:otherwise>
	</c:choose>
</body>
</html>