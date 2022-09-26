<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert Student</title>
	</head>
	<body>
		<html:form action="/insert">
			Student Id : <html:text property="id"/><br/>
			Name : <html:text property="name"/><br/>
			<html:submit value="Insert"/>
		</html:form>
	</body>
</html:html>