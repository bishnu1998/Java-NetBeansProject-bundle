<%-- 
    Document   : index
    Created on : Oct 3, 2021, 9:40:00 AM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index page</title>
        <!--Bootstrap css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>

        <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>

        <!--for font awsome icon from w3 school-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <link href="css/mycss.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <section class="banner">
            <div class="container-fluid text-white text-center h1-100">
                <div class="row align-items-center h1-100">
                    <div class="col">
                        <h1 class="display-3">hello world</h1>
                        <p>This is the Database Management System first project.</p>
                        <div class="btnSet py-5">
                            <a href="registerPage.jsp"> <button  class="btn btn-primary btn1">Insert</button></a>
                            <a href="loginPage.jsp"> <button class="btn btn-primary btn2">Update</button></a>
                            <a href="deletePage.jsp"> <button class="btn btn-primary btn3">Delete</button></a>
                        </div>
                    </div>

                </div>
            </div>
        </section>


        <!--Bootstrap javaScript-->
        <script
            src="https://code.jquery.com/jquery-3.6.0.min.js"
            integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
        crossorigin="anonymous"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


    </body>
</html>
