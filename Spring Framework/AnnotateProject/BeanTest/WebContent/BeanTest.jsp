<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="Hello.NameHandler" %>

<jsp:useBean id="mybean" scope="page" class="Hello.NameHandler" />
<jsp:setProperty name="mybean" property="*" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bean Test</title>
</head>
<body>
<table border="0" width="50%">
<tr>
<td><h2> u'r name? </h2></td>
</tr>

<tr>
<td align="center">
<form method="get">
<input type="text" name="userName" size="25">
<br>
<input type="submit" value="submit">
<input type="reset" value="reset">
</form>
</td>
</tr>
</table>
  <%
if(request.getParameter("userName") !=null)
    {
    %>
  <%@ include file="response.jsp" %>
   <%
      }
   %>
</body>
</html>