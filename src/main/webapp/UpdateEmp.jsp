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

           <form action ="U" method ="post">
           <h2>Update Employee Details </h2>
           EMAIL:<input type ="text" name ="email"  style="color:red " class="upd"/><br>
           EXPERIENCE: <input type ="number" name ="experience"  style="color:red " class="upd"/><br>
           SALARY : <input type = "number"  name ="salary" style="color:red " class="upd"/></br>
           <input type ="submit" value ="update"/>
           </form>
           
          
</body>
</html>