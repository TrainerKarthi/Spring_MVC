<%@page import="com.org.dto.Order"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome to Orders Page</h1>
	
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>PRICE</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="order" items="${orders}">
				<tr>
					<td>${order.id}</td>
					<td>${order.name}</td>
					<td>${order.price}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

<br>
<br>
<br>
<br>


<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>PRICE</th>
			</tr>
		</thead>
		<tbody>
			<% List<Order> orders = (List<Order>)request.getAttribute("orders");
				for(int i = 0; i< orders.size(); i++){%>
					
					<tr>
						<td> <%= orders.get(i).getId() %></td>
						<td> <%= orders.get(i).getName() %></td>
						<td> <%= orders.get(i).getPrice() %></td>
					</tr>
					
				<%}
			%>
		</tbody>
	</table>

</body>
</html>