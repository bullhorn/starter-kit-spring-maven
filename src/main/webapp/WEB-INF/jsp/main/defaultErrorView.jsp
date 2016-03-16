<% response.setHeader("Expires", "Tues, 01 Jan 1980 00:00:00 GMT"); %>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title></title>
        <%
        Integer IDError = (Integer)request.getAttribute("IDError");
        %>
    </head>
    <body>
        <h1>Unexpected Error</h1>
        <h2>Please contact Bullhorn with the following information:</h2>
        <ul>
            <li>Exact detailed reproduction steps that produced this error.</li>

            <%if(IDError != -1) { %>
                <li>ID Error: <%=IDError%></li>
            <%}else {%>
                <li>ID Error: N/A. Logging was disabled</li>
            <%} %>
        </ul>
    </body>
</html>