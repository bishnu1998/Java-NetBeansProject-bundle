<%-- 
    Document   : index
    Created on : Jun 8, 2021, 8:15:33 PM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>this is my index page</p>
        <form action="login" method="post">
           <input type="text" name="name" placeholder="name">
           <input type="password" name="pass" placeholder="password">
           <input type="submit" value="login">
        </form>
    </body>
</html>
