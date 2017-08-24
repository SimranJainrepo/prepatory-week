<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@include file="header.jsp"%>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Insert title here</title>
</head>
<body>
<h3>ELECTRONIC STORE</h3>
<p>Your Store.Your Place</p>
	<div class="container-fluid">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>

			</ol>
			<div class="carousel-inner" role="listbox">
				<div class="item active">
				<c:url value="resources/images/2.jpg" var="url"></c:url>
				
					<img class="first-slide home-image" src="${url }"
						alt="first slide">
					<div class="container">
						<div class="carousel-caption" >
							<h1>WELCOME TO THE ElectronicSTORE</h1>
							<p>Here You Can Browse And Buy Online.Order Now For YourAmazing New Arrivals</p>
						</div> 
					</div>
				</div>
				<div class="item">
				<c:url value="resources/images/12.jpg" var="url1"></c:url>
					<img class="second-slide home-image" src="${url1 }"
						alt="Second slide">
					<div class="container">
						<div class="carousel-caption">
							<h1>The Electronic Store.</h1>
							<p>online shopping can make your life more easier</p>
						</div>
					</div>
				</div>
				<div class="item">
				<c:url value="resources/images/1.jpg" var="url2"></c:url>
					<img class="third-slide home-image " src="${url2 }"
						alt="Third slide">
					<div class="container">
						<div class="carousel-caption">
							<h1>Most Exciting Mobile Phones</h1>
							<p>With TONS OF FEATURES</p>
						</div>
					</div>
				</div>

			</div>
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
		<!-- /.carousel -->

	</div>
</body>
</html>
<%@include file="footer.jsp"%>