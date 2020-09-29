<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 추가</title>
</head>

<body>
	<div>
		<form action="ArticleServlet">
		제목 : <input type="text" name="title" /><br>
		내용 : <input type="text" name="body" /><br>
		<input type="hidden" name="action" value="doAdd" />
		<input type="submit" value="등록" /> 
	</div>
</body>
</html>