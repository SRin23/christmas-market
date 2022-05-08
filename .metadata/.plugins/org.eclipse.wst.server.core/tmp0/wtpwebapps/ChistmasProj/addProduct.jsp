<%@page import="dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<script type="text/javascript" src="../resources/js/validation.js"></script>
<title>상품 등록</title>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 등록</h1>
		</div>
	</div>
	<div class="container">
		<form name="newProduct" action="./processAddProduct.jsp"
			class="form-horizontal" method="post" enctype="multipart/form-data">
			<div class="form-group row">
				<label class="col-sm-2">상품 코드</label>
				<div class="col-sm-3">
					<input type="text" id="productId" name="productId"
						class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">상품명</label>
				<div class="col-sm-3">
					<input type="text" id="name" name="name" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">가격</label>
				<div class="col-sm-3">
					<input type="text" id="price" name="price" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">상세 설명</label>
				<div class="col-sm-5">
					<textarea name="description" col="50" rows="2" class="form-control"></textarea>
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">판매자</label>
				<div class="col-sm-3">
					<input type="text" name="seller" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">크기</label>
				<div class="col-sm-3">
					<input type="text" id="length" name="length" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">연식</label>
				<div class="col-sm-3">
					<input type="text" id="older" name="older" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">재료</label>
				<div class="col-sm-3">
					<input type="text" name="material" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">분류</label>
				<div class="col-sm-3">
					<input type="text" name="category" class="form-control"">
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">상태</label>
				<div class="col-sm-5">
					<input type="radio" name="condition" value="New">신규제품 <input
						type="radio" name="condition" value="Old">중고제품 <input
						type="radio" name="condition" value="Refurbished">재생제품
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">이미지</label>
				<div class="col-sm-5">
					<input type="file" name="productImage" class="form-control">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" class="btn btn-primary" value="등록">
				</div>
			</div>
		</form>
	</div>
</body>
</html>







