<%-- 
    Document   : error_page
    Created on : Jun 24, 2021, 5:10:52 PM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>error page</title>
        <style>
        *{
            padding: 0px;
            margin: 0px;
        }
    </style>
    </head>
    
    <body>
        <div style="padding: 20px; color: blue; background: #e2e2e2; ">
             <h1>sorry! something went wrong...</h1>
             <%= exception %>
        </div>
    </body>
</html>
