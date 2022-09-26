<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="0" width=700>
<tr>
<td width="150" >&nbsp;</td>
<td width="550">
<h1>Hello, <jsp:getProperty  name="mybean" property="userName" />
</h1>
</td>
</tr>
</table>
</body>
</html>