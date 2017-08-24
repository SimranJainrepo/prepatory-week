<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >

<%@include file="header.jsp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Form</title>
</head>
<body>
	<h3>Enter The Product Details</h3>
	<c:url value="saveproduct" var="url"></c:url>
	<form:form action="${url }" method="post" modelAttribute="product"
		enctype="multipart/form-data">
		<div class="form-group">
			<form:hidden path="id" class="form-control" />
		</div>
		<br>

		<div class="form-group">
			Enter Product Name
			<form:input path="productName" class="form-control" />


		</div>
		<br>
		<div class="form-group">
			Enter Price
			<form:input path="price" class="form-control" />
		</div>
		<br>
		<div class="form-group">
			Enter Quantity
			<form:input path="quantity" class="form-control" />
		</div>
		<br>
		<div class="form-group">
			Enter Description
			<form:input path="description" class="form-control" />
		</div>
		<br>
		<div class="form-group">
			Upload an image <input type="file" name="image">
		</div>
		<div class="form-group">
			Select Category
			<c:forEach items="${categories }" var="c">
				<form:radiobutton path="category.id" value="${c.id}" />${c.categoryName}
				</c:forEach>
		</div>

		<div class="form-group">
			<input type="submit" value="Add Product">
		</div>
		<br>
	</form:form>

</body>
</html>