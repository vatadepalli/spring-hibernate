<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Departments</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

</head>

<body>
	
	
<div id="wrapper">
	<div id="header">
		<h3>Department List</h3>
	</div>
</div>

<div id="container">
	<div id="content">
	
		<!-- Add Customer Button -->
		
		<button type="button"
				value="Add Customer"
				onclick="window.location.href='addDept'; return false;"
				class="add-button">Add Department</button>
		
		<!-- Add HTML here -->
		<table>
			<tr>
				<th>Dept. Name</th>
				<th>Location</th>
				<th>Strength</th>
			</tr>
			
			<c:forEach var="tempDept" items="${departments}">
				
				<tr>
					<td> ${tempDept.deptName} </td>
					<td> ${tempDept.deptLocation} </td>
					<td> TODO </td>
				</tr>
				
			</c:forEach>
		</table>
	</div>
</div>

</body>
</html>