<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
<%@ include file="StyleUpd.css"%>
</style>
</head>
<body>
<form action ="UP" method ="post">
<h1><center> Update Employee Details</center></h1>
EMAIL:
<input type ="email" name ="email" style="color:red"></br>
EXPERIENCE:
<input type ="number" name ="experience" style="color:red"></br>
SALARY:
<input type ="number" name ="salary" style="color:red"></br>
<input type ="submit" value ="update">
</form>
</body>
</html>