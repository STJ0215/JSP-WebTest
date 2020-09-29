<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.sbs.board.article.dao.Article"%>
<%@ page import="java.util.List"%>
<%@ page import="com.sbs.board.member.dao.Member"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 목록</title>
</head>

<body>
	<h1>게시물 목록</h1>
	
	<%
		Member loginedMember = (Member)session.getAttribute("loginedMember");
		if (loginedMember != null) {
	%>
		안녕하세요. ${ loginedMember.nickname } 님!
		<a href="/ArticleServlet?action=doLogout">로그아웃</a>
	<%
		}
		else {
	%>
		로그인해주세요.
	<%
		}
	%>
	
	
	<form method="POST"> 
		<c:forEach var="article" items= "${articles}" >
		<div>
			번호 : ${ article.id }
			<a href="/TestServlet?action=read&id=${article.id}">제목 : ${ article.title }</a>
			<input type="checkbox" name="chk" value="${article.id}" />
		</div>
		<hr>
		</c:forEach>
		<input type="submit"/>
	</form>
	<a href="/ArticleServlet?action=showAdd">글쓰기</a>

</body>
</html>
