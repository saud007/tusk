<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>App</title>
</head>
<body>
			<%
			int a = Integer.parseInt(request.getParameter("p1"));
			int b = Integer.parseInt(request.getParameter("p2"));
			int k = a + b;
			out.println("To bhai result hai : "+k);
			%>
			
</body>
</html>