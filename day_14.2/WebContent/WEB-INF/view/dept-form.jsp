<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Add Department</title>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
	
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Add Department</h2>
		</div>
	</div>
	
	<div id="container">
		<h3>Save Container</h3>
		
		<form:form action="addDept" modelAttribute="department" method="POST">
			
			<form:hidden path="deptNo"/>
			
			<table>
				<tbody>
					<tr>
						<td><label>Dept Name: </label></td>
						<td><form:input path="deptName"/></td>
					</tr>
					<tr>
						<td><label>Location: </label></td>
						<td><form:input path="deptLocation"/></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save"/></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		
		<div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/department/list">Back to List</a>
		</p>
	</div>

</body>
</html>