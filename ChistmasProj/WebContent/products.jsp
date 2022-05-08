<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<title>상품 목록</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 목록</h1>
		</div>	
	</div>
	<div class="container">
		<div class="row" align="center">
			<%@ include file="dbconn.jsp" %>
			<%
			// db연결
				PreparedStatement pstmt = null; // 쿼리문 생성
				ResultSet rs = null; // 디비로부터 결과값 저장
				String sql = "SELECT * FROM product";
				pstmt = conn.prepareStatement(sql); //디비로 전송
				rs = pstmt.executeQuery(); // 결과값 저장
				while(rs.next()){
			%>
			<div class="col-md-4">
				<img src="D:/JSP/ChistmasProject/image/<%=rs.getString("p_fileName")%>" style="width:100%">
				<h3><%= rs.getString("p_name")%></h3>
				<p><%= rs.getString("p_description")%></p>
				<p><%= rs.getString("p_price")%>원</p>
				<p> <a href="./product.jsp?id=<%=rs.getString("p_id")%>"
					class="btn btn-secondary" role="button"> 상세 정보 &raquo;</a>
			</div>
			<%
				}
				
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			%>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />	
</body>
</html>







