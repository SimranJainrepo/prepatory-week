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
<c:url value="savecategory" var="url"></c:url>
	<form:form action="${url }" method="post" modelAttribute="category">
		<div class="form-group">
			<form:hidden path="id" class="form-control" />
		</div>
		<br>
		<div class="form-group">
			Enter Category Name
			<form:input path="categoryName" class="form-control" />
		</div>
		<br>
		
		
                                
	<div class="form-group">
			<input type="submit" value="Add Category">
		</div>
		<br>
	</form:form>

</body>


</body>
</html>