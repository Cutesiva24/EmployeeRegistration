<%@page import="com.bean.controller.EmployeeB"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
<%@ include file="StyleDis.css"%>
</style>

</head>
<body>
<h1>Employee Details</h1>

<table border ="1" cellspacing ="0">
<thead>
<tr>
<th>ID</th>
<th>NAME</th>
<th>EMAIL</th>
<th>DEPARTMENT</th>
<th>DESIGNATION</th>
<th>EXPERIENCE</th>
<th>SALARY</th>
</tr>
</thead>
<tbody>
     <%ArrayList<EmployeeB> al = (ArrayList<EmployeeB>)request.getAttribute("EmployeeList");
     for(EmployeeB s:al)
     {
     %>
     <tr>
     <td><%=s.getId()%></td>
     <td><%=s.getName()%></td>
     <td><%=s.getEmail()%></td>
     <td><%=s.getDepartment()%></td>
     <td><%=s.getDesignation()%></td>
     <td><%=s.getExperience()%></td>
     <td><%=s.getSalary()%></td>
     </tr>   
     <% } %>


</tbody>
</table>

</body>
</html>