<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
	<HR>
	<button><a href="mart.jsp">Add Product</a></button>
	<table class="table table-striped table-bordered">
		<caption>Products List</caption>
		<tr class="thead-dark">
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Update/Delete</th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr>
				<td>${product.productId}</td>
				<td>${product.productName}</td>
				<td>${product.productPrice}</td>
				<td><a
					href="${pageContext.request.contextPath}/editProduct.jsp?action=GET&id=${product.productId}&name=${product.productName}&price=${product.productPrice}">Edit</a>
					| <a
					href="${pageContext.request.contextPath}/deleteProduct?action=GET&id=${product.productId}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>