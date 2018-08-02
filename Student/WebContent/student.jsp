<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.deloitte.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="test" class="com.deloitte.Student"></jsp:useBean>
<jsp:setProperty property="*" name="test"/>
<jsp:getProperty property="fname" name="test"/>
<jsp:getProperty property="lname" name="test"/>
<jsp:getProperty property="company" name="test"/>

</body>
</html>