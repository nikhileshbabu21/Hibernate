<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<%!
	String str = "good day!";
%>

</head>
<body>
<%
	String name = "Nanda";
%>
<div>
Hi, <%= name %>
</div>

<p>
<%
	out.println(name.toUpperCase());
	out.println(new StringBuffer(str).reverse());
%>
</p>
</body>
</html>