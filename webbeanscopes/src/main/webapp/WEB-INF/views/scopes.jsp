<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home Page</title>
</head>
<body>
<h3>Request scope counter : ${requestCounter}</h3><br>
<h3>Session scope counter : ${sessionCounter}</h3><br>
<br>
<p>Note* Request scope counter increases for each request</p>
<p>Note* Session scope counter increases for each session</p>
</body>
</html>