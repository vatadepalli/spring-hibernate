<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation</title>
</head>
<body>

	<h4>The Student is Confirmed:</h4>
	First Name: ${student.firstName}
	<br> Last Name: ${student.lastName}
	<br> Country: ${student.country}
	<br> Favourite Language: ${student.favouriteLanguage}
	<br><br>
	Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
		<li> ${temp} </li>
		</c:forEach>
	</ul>
</body>
</html>