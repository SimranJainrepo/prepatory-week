<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>List of products</b>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Image</th>
					<th>Product Name</th>
					<th>Price</th>
					<th>Category</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${products }" var="p">
					<c:url value="/admin/product/viewproduct/${p.id }" var="viewUrl"></c:url>
					<c:url value="/admin/product/deleteproduct/${p.id }" var="deleteUrl"></c:url>
					<c:url value="/admin/product/geteditform/${p.id }" var="editUrl"></c:url>
					<c:url value="/resources/images/${p.id }.png" var="imgUrl"></c:url>

					<tr>
						<td><img src="${imgUrl }" height="50" width="50"></td>


						<td><a href="${viewUrl}">${p.productName }</a></td>
						<td>${p.price }</td>
						<td>${p.category.categoryName }</td>
						<td><a href="${viewUrl}"><span
								class="glyphicon glyphicon-info-sign"></span></a> <a
							href="${deleteUrl}"><span class="glyphicon glyphicon-trash"></span></a>
							<a href="${editUrl}"><span class="glyphicon glyphicon-pencil"></span></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<li><a href="<c:url value="/getproductform" />">Add Product</a></li>
</body>
</html>
<%@include file="footer.jsp"%>