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

<h1>Employees Profile</h1>

	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>age</th>
				<th>gender</th>
				<th>mobile</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="order" items="${employees}">
				<tr>
					<td>${order.id}</td>
					<td>${order.name}</td>
					<td>${order.age}</td>
					<td>${order.gender}</td>
					<td>${order.mobile}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>