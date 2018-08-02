<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
Integer[] x= (Integer[])request.getAttribute("x");
%>
<h1 style="color:red">
<%out.println(x[0]); %>
</h1>
<h1 style="color:green">
<%out.println(x[1]); %>
</h1>
</body>
</html>