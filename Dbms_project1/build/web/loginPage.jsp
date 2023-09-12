<%-- 
    Document   : loginPage
    Created on : Oct 3, 2021, 2:22:56 PM
    Author     : bishnu
--%>

<%@page import="com.dbms.pro.entities.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login Page</title>
        <!--Bootstrap css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>

        <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>

        <!--for font awsome icon from w3 school-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <link href="css/mycss.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <section>
            <div class="container text-center py-4">
                <div class="row">
                    <div class="col-md-6 offset-md-4">
                        <div class="card">
                            <div class="card-header">
                                <span class="fa fa-user-circle fa-3x"></span>
                                <br>
                                <h3>LogIn</h3>
                                <div class="message">
                                    <%
                                        Message msg = (Message) session.getAttribute("msg");
                                        if (msg != null) {
                                    %>
                                    <div>
                                        <%=msg.getContent()%>
                                    </div>
                                    <%
                                            session.removeAttribute("msg");
                                        }
                                    %>
                                </div>
                            </div>
                            <div class="card-body primary-background">
                                <form action="loginServlet" method="post">
                                    <div class="form-row">
                                        <div class="form-group col-md-12">
                                            <label for="inputEmail4">Email</label>
                                            <input name="email" type="email" class="form-control" id="inputEmail4" placeholder="Email">
                                        </div>
                                        <div class="form-group col-md-12">
                                            <label for="inputPassword4">Password</label>
                                            <input name="password" type="password" class="form-control" id="inputPassword4" placeholder="Password">
                                        </div>
                                    </div>
                                    <button type="submit" class="btn btn-light">Sign in</button>
                                </form>
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

                    <script>
$(document).ready(function()){
    consol.log("loading...");
    
    
}
                    </script>
                    </body>
                    </html>
