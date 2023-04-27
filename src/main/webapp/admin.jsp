<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
<%@ include file="Style.css"%>
</style>
</head>
<body>


<form action="MyServlet" method ="post">

<h1> Login Here</h1>
<b>name : </b><input type = "text" name ="name" class="admin"></br>
<b>password : </b><input type = "password" name ="password" class="admin"></br>
<input type ="submit" value ="login">

</form>
</body>
</html>