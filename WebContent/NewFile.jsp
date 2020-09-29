<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NewFile jsp</title>
</head>

<body>
<h1>hello, world!!</h1>
<h2>hello, world!!</h2>
<h3>hello, world!!</h3>
<h4>hello, world!!</h4>
<h5>hello, world!!</h5>
<hr>
<%
for (int i = 0; i < 5; i++) {
	out.println("hello, world!!<br>");
}
%>

<hr>

<%
for (int i = 0; i < 5; i++) {%>
	hello, world!!<br>
<%
}
%>
</body>
</html>