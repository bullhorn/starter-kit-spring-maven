<% response.setHeader("Expires", "Tues, 01 Jan 1980 00:00:00 GMT"); %>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title></title>
        <%
        String alertFlag = (String)request.getAttribute("alertFlag");
        String errorMessage = (String)request.getAttribute("errorMessage");
        %>
	</head>
	<body>
		<%=alertFlag%>:<%=errorMessage%>
	</body>
</html>