<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mart</title>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>Product</h1>
		<hr />
		<form action="${pageContext.request.contextPath}/EditProduct"
			method="post">
			<table>
			<caption></caption>
				<tr>
					<td>Product Id:</td>
					<td><input type="number" name="id" value=<%=request.getParameter("id") %> required></td>
				</tr>
				<tr>
					<td>Product Name:</td>
					<td><input type="text" name="pname" value=<%=request.getParameter("name") %> required></td>
				</tr>
				<tr>
					<td>Product Price:</td>
					<td><input type="number" name="pprice" value=<%=request.getParameter("price") %> required></td>
				</tr>
			</table>
			<br>
			<button type="submit">Update</button>
		</form>
	</div>
</body>
</html>