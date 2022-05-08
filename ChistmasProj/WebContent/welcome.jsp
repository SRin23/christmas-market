<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<link rel="favicon" href="./img/icon.png">
<title>Welcome</title>
</head>
<body>
	<jsp:include page="menu.jsp"/>
	<%! 
	String greeting = "Welcome to MagicShop";
	String tagline = "HAPPY CHRISTMAS!!";
	%>
	<div class="jumbotron">
		<div class="container">
			<div class="text-center">
				<h1 class="display-3"><%= greeting %></h1>
			</div>
		</div>	
	</div>
	<main role = "main">
		<div class="container">
			<div class="text-center">
				<h3> <%= tagline %></h3>
				<img alt="크리스마스 사진" src="img/christmasDoorImg.jpg" width="50%">
			</div>
			<hr>
		</div>
	</main>
	<%@ include file="footer.jsp" %>	
</body>
</html>







