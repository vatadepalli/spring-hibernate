<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Customers</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>



<div id="wrapper">
	<div id="header">
		<h3>CRM - Customer Relationship Manager</h3>
	</div>
</div>

<div id="container">
	<div id="content">
		<!-- Add HTML here -->
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
			</tr>
			
			<c:forEach var="tempCustomer" items="${customers}">
			<tr>
				<td> ${tempCustomer.firstName} </td>
				<td> ${tempCustomer.lastName} </td>
				<td> ${tempCustomer.email} </td>
			</tr>
				
			</c:forEach>
		</table>
	</div>
</div>

</body>
</html>