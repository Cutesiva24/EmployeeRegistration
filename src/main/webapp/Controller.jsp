<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
<%@ include file="StyleCon.css"%>
</style>
</head>
<body>
<h1><center>Welcome Admin</center></h1>

<form action ="I" method ="post">
<input type ="submit" value = "insert" id ="b">
</form>
<br>
<form action ="D" method ="post">
<input type ="submit" value = "delete" id="b">
</form>
<br>
<form action ="U" method ="post">
<input type ="submit" value = "update" id="b"/>
</form>
<br>
<form action ="M" method ="post">
<input type ="submit" value = "display" id ="b">
</form>

</body>
</html>