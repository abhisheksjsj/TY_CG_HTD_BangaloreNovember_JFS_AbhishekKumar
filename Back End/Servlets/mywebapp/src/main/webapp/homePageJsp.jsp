<%@page import="com.capgemini.mywebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page session="false"%>


<%
	HttpSession session = request.getSession(false);
	EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) session.getAttribute("employeeInfoBean");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 style="color: navy;">
		Welcome<%=employeeInfoBean.getName()%></h3>
	<a href="./addEmpJsp">Add Employee</a>
	<br>
	<a href="./updateEmpJsp">Update Employee</a>
	<br>
	<a href="./deleteEmpJsp">Delete Employee</a>
	<br>
	<a href="./searchEmpJspForm">Search Employee</a>
	<br>
	<a href="./seeAllEmployees">See All Employee</a>
	<br>
	<br>
	<a href="./logout2">Log Out</a>
</body>
</html>