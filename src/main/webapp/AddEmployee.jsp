<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
<%@ include file="StyleEmp.css"%>
</style>
</head>
<body>
<form action ="Reg">
<h1><center> Employee Details</center></h1>
NAME:
<input type ="text" name ="name" id="name" style="color:red" class="ab"/><br>
EMAIL:
<input type ="text" name ="email"  style="color:red "/><br>
DEPARTMENT:
<input type ="text" name ="department" id="department" style="color:red " class="ab"/><br>
DESIGNATION:
<input type ="text" name ="designation" style="color:red" class="ab"></br>
EXPERIENCE:
<input type ="number" name ="experience" style="color:red" class="ab"></br>
SALARY:
<input type ="number" name ="salary" style="color:red" class="ab"></br>
<input type ="submit" value ="Register">
</form>
</body>
</html>