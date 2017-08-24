<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>Details About The Product</b>
	<table>
		<c:url value="/resources/images/${product.id }.png" var="imgUrl"></c:url>
		<tr>
			<td><img src="${imgUrl }" height="50" width="50"></td>
		</tr>
		<tr>
			<td>Product Name:</td>
			<td>${product.productName }</td>
		</tr>
		<tr>
			<td>Quantity:</td>
			<td>${product.quantity }</td>
		</tr>
		<tr>
			<td>Price:</td>
			<td>${product.price }</td>
		</tr>
		<tr>
			<td>Description:</td>
			<td>${product.description }</td>
		</tr>
	</table>

	<c:url value="/admin/product/getallproducts" var="Url"></c:url>
	<a href="${Url }">Go back to Product List</a>
	<br>
</body>
</html>
<%@include file="footer.jsp"%>