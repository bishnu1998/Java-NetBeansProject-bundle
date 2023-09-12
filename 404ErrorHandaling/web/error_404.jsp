<%-- 
    Document   : error_404
    Created on : Jun 24, 2021, 7:54:16 PM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>sorry! page not found</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  
    </head>
    <body>
        <div class="container p-3 text-center">
            <h1>sorry ! page not found..</h1>
            <img src="img/error.png" class="img-fluid mt-3">
            <h2><%= exception %></h2>
            <a href="index.jsp" class="btn btn-outline-rimary bg-dark text-white">Home</a>
        </div>
    </body>
</html>
