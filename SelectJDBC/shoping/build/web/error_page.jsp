<%-- 
    Document   : error_page
    Created on : Jun 24, 2021, 4:23:17 PM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
        
         <!--Bootstrap css-->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>
   
      <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>
      
      <!--for font awsome icon from w3 school-->
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
      
      <style>
          .banner-background{
        clip-path: polygon(50% 0%, 100% 0, 100% 60%, 100% 100%, 49% 91%, 0 100%, 0 0);  }
      </style>
    </head>
    <body>
            <div class="container text-center">               
                <img src="img/error.png" class="img-fluid">
                <h2>sorry! something went wrong....</h2>
                <%= exception %>
                <a href="index.jsp" class="btn primary-background text-white mt-3">Home</a>
        </div>
    </body>
</html>
