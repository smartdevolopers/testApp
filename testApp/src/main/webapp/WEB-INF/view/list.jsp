<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	<h1>Team List</h1>

	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Rating</th>
				<th>Action</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${teams}" var="team">
				<tr>
					<td>${team.id}</td>
					<td>${team.name}</td>
					<td>${team.rating}</td>
					<td><a href="${pageContext.request.contextPath}/test/edit/${team.id}.html">Edit</a> 
					<a href="${pageContext.request.contextPath}/test/delete/${team.id}.html">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="${pageContext.request.contextPath}/">Go Back to Home</a>
</body>
</html>
