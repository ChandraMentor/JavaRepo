<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert</title>
	</head>
	<body>
		<form:form commandName="student">
			<form:errors/>
			<table>
				<tr>
					<td>
						Student Id
					</td>
					<td>
						<form:input path="studentId"/>
					</td>
				</tr>
				<tr>
					<td>
						Student Name
					</td>
					<td>
						<form:input path="name"/>
						<form:errors path="name"/>
					</td>
				</tr>
				<tr>
					<td>Courses :</td>
					<td>
						<form:select path="courseId">
							<c:forEach items="${courses}" var="course">
								<form:option value="${course}">${course}</form:option>
							</c:forEach>
						</form:select>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="insert"/>
					</td>
				</tr>
			</table>
		</form:form>	
	</body>
</html>