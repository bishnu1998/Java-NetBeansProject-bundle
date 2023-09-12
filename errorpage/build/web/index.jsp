<%-- 
    Document   : index
    Created on : Jun 24, 2021, 5:03:00 PM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error_page.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <%!
        int n1=23;
        int n2=0;
        %>
        
        <%
        int division=n1/n2;
        %>
        <h1>division:<%= division %></h1>
    </body>
</html>
