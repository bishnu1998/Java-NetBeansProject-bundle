<%-- 
    Document   : index
    Created on : Jun 20, 2021, 6:18:03 PM
    Author     : bishnu
--%>

<%@page import="com.tech.blog.entities.post"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.entities.category"%>
<%@page import="com.tech.blog.dao.postDao"%>
<%@page import="com.tech.blog.entities.user"%>
<%@page import="com.tech.blog.helper.connectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>

<%
    user user = (user) session.getAttribute("currentUser");
    if (user == null) {
        response.sendRedirect("login_page.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

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

            <!--navbar-->
            <nav class="navbar navbar-expand-lg navbar-dark primary-background">
            <a class="navbar-brand" href="index.jsp"><span class="fa fa-asterisk"></span>Tech Blog</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#"><span class="fa fa-bell-o"></span>Learncode with Drugesh<span class="sr-only">(current)</span></a>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <span class="fa fa-check-square-o"</span>Categories
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Programming Language</a>
                            <a class="dropdown-item" href="#">Project Learning</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Data Structure</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"><span class="fa fa-address-card-o"></span>Contact</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href=""><span class="fa fa-user-plus"></span>LogOut</a>
                    </li>
                    <li class="nav-item">
                        <a data-toggle="modal" data-target="#post-modal" class="nav-link" href="postServlet"><span class="fa fa-plus"></span>Post</a>
                    </li>

                </ul>
                <ul class="navbar-nav mr-left">
                    <li class="nav-item">
                        <a data-toggle="modal" data-target="#profile-modal" class="nav-link" href="#"><span class="fa fa-user-circle-o"></span><%= user.getName()%></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="LogoutServlet"><span class="fa fa-user-plus"></span>LogOut</a>
                    </li>
                </ul>
            </div>
        </nav>



        <!-- Modal -->
        <div class="modal fade" id="profile-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <div class="container text-center">
                            <h5 class="modal-title" id="exampleModalLabel">TechBlog</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                    </div>
                    <div class="modal-body">
                        <div class="container text-center">
                            <div>
                                <img src="img/<%=user.getProfile()%>" style="height: 200px; width: 200px; border-radius: 10px;">
                                <p>Profile</p>
                            </div>

                            <div id="profile-detail">
                                <table class="table">
                                    <thead>
                                        <tr>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <th scope="row">Id:</th>
                                            <td><%=user.getId()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Name:</th>
                                            <td><%=user.getName()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Email:</th>
                                            <td><%=user.getEmail()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Password:</th>
                                            <td><%=user.getPassword()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Gender:</th>
                                            <td><%=user.getGender()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">About:</th>
                                            <td><%=user.getAbout()%></td>

                                        </tr>
                                    </tbody>
                                </table>
                            </div>

                            <!--edit-->
                            <div id="edit-profile" style="display: none;">
                                <form action="editServlet" method="post" enctype="multipart/form-data">
                                    <table class="table">
                                        <thead>
                                            <tr>
                                        <p>Edit Carefully</p>
                                        </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <th scope="row">Id:</th>
                                                <td><%=user.getId()%></td>

                                            </tr>
                                            <tr>
                                                <th scope="row">Name:</th>
                                                <td><input type="text" class="form-control" name="name" value="<%=user.getName()%>"></td>

                                            </tr>
                                            <tr>
                                                <th scope="row">Email:</th>
                                                <td><input type="email" class="form-control" name="email" value="<%=user.getEmail()%>"></td>

                                            </tr>
                                            <tr>
                                                <th scope="row">Password:</th>
                                                <td><input type="password" class="form-control" name="password" value="<%=user.getPassword()%>"></td>

                                            </tr>
                                            <tr>
                                                <th scope="row">Gender:</th>
                                                <td><input type="text" class="form-control" name="gender" value="<%=user.getGender()%>"></td>

                                            </tr>

                                            <tr>
                                                <th scope="row">Image:</th>
                                                <td><input type="file" class="form-control" name="file" value="default.png"></td>

                                            </tr>
                                        </tbody>

                                    </table>
                                    <div class="container text-center">
                                        <button class="btn btn-primary" type="submit">Save</button>
                                    </div>
                                </form>
                            </div>  


                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button id="profile-edit-btn" type="button" class="btn btn-primary">Edit</button>
                    </div>
                </div>
            </div>
        </div>   

        <!--main body-->

        <div class="container-fluid">
            <div class="row mt-5">
                <div class="col-md-4">
                    <!--categories-->
                    <div class="list-group">
                        <a href="#" class="list-group-item list-group-item-action active">
                            All Posts
                        </a>

                        <%
                            postDao d = new postDao(connectionProvider.getConnection());
                            ArrayList<category> list1 = d.getAllCategory();

                            for (category cc : list1) {
                        %> 
                        <a href="#" class="list-group-item list-group-item-action">
                            <%= cc.getName()%>
                        </a>
                        <%
                            }
                        %>
                    </div>

                </div>
                <div class="col-md-8">
                    <!--posts-->

                    <div class="container-fluid">
                        <div class="row mt-2">
                            
                                 <%
                            ArrayList<post> ls = d.getAllPost();
                            for (post p1 : ls) {
                        %>
                       <div class="col-md-6 py-3">
                        <div class="card" style="width: 23rem;">
                            <img class="card-img-top" src="pic/<%=p1.getpPic()%>" >
                            <div class="card-body">
                                <h5 class="card-title"><%=p1.getpTitle()%></h5>
                                <p class="card-text"><%=p1.getpContent()%></p>
                                <a href="#" class="btn btn-primary">More!</a>
                            </div>
                        </div>
                                 </div>
                        <%
                            }
                        %>
                           
                        </div>
                       
                    </div>

                </div>
            </div>
        </div>

        <!--end main body-->
        <!--post Modal-->

        <!-- Modal -->
        <div class="modal fade" id="post-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form action="postServlet" method="post" enctype="multipart/form-data">
                            <div class="form-group">
                                <select class="form-control" name="cId">
                                    <option selected="disable">
                                    <a href="#" class="list-group-item list-group-item-action active">
                                        Select Category
                                    </a>
                                    </option>

                                    <!--fetch all category-->
                                    <%
                                        postDao pd = new postDao(connectionProvider.getConnection());
                                        ArrayList<category> list = pd.getAllCategory();

                                        for (category c : list) {
                                    %>
                                    <option value="<%= c.getcId()%>">
                                        <%= c.getName()%>
                                    </option>
                                    <%
                                        }
                                    %>

                                </select>
                            </div>
                            <div class="form-group">
                                <input type="text" name="title" class="form-control" placeholder="enter title">
                            </div>
                            <div class="form-group">
                                <textarea name="content" style="height: 200px;" class="form-control" placeholder="enter your content"></textarea>
                            </div>
                            <div class="form-group">
                                <textarea name="code" style="height: 150px;" class="form-control" placeholder="enter your code"></textarea>
                            </div>
                            <div class="form-group">
                                <label for="file">select Image:</label>
                                <input type="file" name="file" class="form-control">
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                                <button type="submit" class="btn btn-primary">Post</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>

        <!--Bootstrap javaScript-->
        <script
            src="https://code.jquery.com/jquery-3.6.0.min.js"
            integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
        crossorigin="anonymous"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


        <script src="js/myjs.js" type="text/javascript"></script>


        <script>

            $(document).ready(function () {
                let btn1 = false;

                $("#profile-edit-btn").click(function () {
                    if (btn1 == false) {
                        $("#profile-detail").hide();
                        $("#edit-profile").show();
                        $(this).text("Back");
                        btn1 = true;
                    } else {
                        $("#profile-detail").show();
                        $("#edit-profile").hide();
                        $(this).text("Edit");
                        btn1 = false;
                    }
                });
            });




        </script>

    </body>
</html>
