<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Confirmation</title>
</head>
<body>

<h3>The customer is confirmed: </h3>
Name: ${customer.firstName} ${customer.lastName}
<br>
Free Passes: ${customer.freePasses}
<br>
Postal Code: ${customer.postalCode}
<br>
Course Code: ${customer.courseCode}
<br>

</body>
</html>

