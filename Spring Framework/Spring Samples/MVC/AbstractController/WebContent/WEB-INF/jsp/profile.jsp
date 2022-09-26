<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Profile</title>
	</head>
	<body>
		<table>
			<tr>
				<td>Id</td>
				<td><c:out value="${profile.id}"/></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><c:out value="${profile.name}"/></td>
			</tr>
			<tr>
				<td>email</td>
				<td><c:out value="${profile.email}"/></td>
			</tr>
		</table>
	</body>
</html>