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
	<b>List of categories</b>
	<div class="container">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Category Id</th>
					<th>Category Name</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${categories }" var="c">
					<c:url value="/all/category/getallcategories/${c.id }" var="viewUrl"></c:url>
					<c:url value="/admin/category/deletecategory/${c.id }" var="deleteUrl"></c:url>
					<tr><td><a href="${viewUrl}">${c.id }</a></td><td>${c.categoryName }</td>
					<td>
					
					<a href="${deleteUrl}"><span class="glyphicon glyphicon-trash"></span></a>
					
					</td>
					</tr>
					
				</c:forEach>
			</tbody>
		</table>
	</div>
	<li><a href="<c:url value="/getcategoryform" />">Add Category</a></li>



</body>
</html>