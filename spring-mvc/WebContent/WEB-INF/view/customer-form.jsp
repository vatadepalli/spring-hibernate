<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.error {
	color: red
}
</style>
</head>

<body>

	<i> Fill out the form. Asterisk (*) is required. </i>
	<form:form action="processForm" modelAttribute="customer">

		First Name: <form:input path="firstName" />
		<br>
		Last Name (*): <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		
		Free Passes: <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error"></form:errors>
		<br>
		
		Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error"></form:errors>
		<br>
		
		Course Code: <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="error"></form:errors>
		<br>

		<input type="submit" value="Submit" />

	</form:form>

</body>
</html>