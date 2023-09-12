<%-- 
    Document   : errorPage
    Created on : Sep 17, 2021, 9:25:41 PM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <!--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>


    </head>
    <body>
        <div class="container text-center mt-3">
            <img src="img/cancel.png" class="img-fluid" style="height: 200px; width: 200px" alt=""/>
            <h3>Something went wrong!</h3>
            <%= exception%>
            <br>
            <a href="index.jsp" class="btn btn-primary btn-lg">Home</a>
        </div>
    </body>
</html>
