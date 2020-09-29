<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.sbs.board.article.dao.Article"%>
<%@ page import="com.sbs.board.Reply" %>
<%@ page import="java.util.ArrayList"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 상세보기</title>
</head>

<body>
	<h1>게시물 상세보기</h1>
	<%
	Article article = (Article)request.getAttribute("article");
	ArrayList<Reply> replies = (ArrayList<Reply>)request.getAttribute("replies");
	%>
	
	<div>
		번호 : <%= article.getId() %> <br>
		제목 : <%= article.getTitle() %> <br>
		내용 : <%= article.getBody() %> <br>
		작성자 : <%= article.getNickname() %> <br>
		조회수 : <%= article.getHit() %> <br>
	</div>
	<hr>
</body>
</html>