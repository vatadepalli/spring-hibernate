<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
		<!-- TEXT FIELDS -->
		<!-- model attribute is the name of the model -->
		First Name: <form:input path="firstName" />
		<br>
		Last Name: <form:input path="lastName" />
		<!-- path is the attribute name in the student bean -->

		<!-- DROPDOWN LIST -->
		<br>
		Country:
		<form:select path="country">
			<%-- <form:option value="Brazil" label="Brazil"></form:option>
			<form:option value="France" label="France"></form:option>
			<form:option value="Germany" label="Germany"></form:option>
			<form:option value="India" label="India"></form:option> --%>

			<form:options items="${student.countryOptions}" />
		</form:select>
		<br>
		<!-- RADIO BUTTONS -->
		<%-- 	Favourite Language: <br>
		Java <form:radiobutton path="favouriteLanguage" value="Java" />
		C# <form:radiobutton path="favouriteLanguage" value="C#" />
		PHP <form:radiobutton path="favouriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favouriteLanguage" value="Ruby" /> --%>

		<form:radiobuttons path="favouriteLanguage"
			items="${student.languageOptions}" />
		<br>
		
		<!-- CHECK BOXES -->
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>

		<!-- BUTTON -->
		<input type="submit" value="Submit">
	</form:form>

</body>
</html>