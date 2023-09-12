

<%@page import="com.tech.blog.entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    User u = (User) session.getAttribute("currentUser");
    if (u == null) {
        response.sendRedirect("loginPage.jsp");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            .baner-background{
                clip-path: polygon(49% 0, 100% 0, 100% 100%, 66% 95%, 29% 95%, 0 100%, 0 0);
            }
        </style>
    </head>
    <body>
        <!--navbar-->
        <nav class="navbar navbar-expand-lg navbar-dark primary-background">
            <a class="navbar-brand" href="index.jsp">TechBlog</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">

                    <li class="nav-item">
                        <a class="nav-link" href="#"><span class="fa fa-address-book-o"></span>Contact</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <span class="fa fa-info"></span>Categories
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </li>


                </ul>
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="modal" data-target="#profile-modal" href=""><span class="fa fa-user-circle"></span><%=u.getFirstName()%></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="logoutServlet"><span class="fa fa-user-plus"></span>LogOut</a>
                    </li>
                </ul>
            </div>
        </nav>

        <!--end of navbar-->

        <!--Profile Modal -->
        <div class="modal fade" id="profile-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">TechBlog</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="container text-center">
                            <img src="img/<%=u.getProfile()%>" class="img-fluid" style="height: 200px; width: 200px; border-radius: 50%;">
                        </div>
                        <div id="profile-detail">
                            <table class="table">

                                <tbody>
                                    <tr>
                                        <th scope="row">Id</th>
                                        <td><%=u.getId()%></td>
                                    </tr>
                                    <tr>
                                        <th scope="row">First Name</th>
                                        <td><%=u.getFirstName()%></td>

                                    </tr>
                                    <tr>
                                        <th scope="row">Last Name</th>
                                        <td><%=u.getLastName()%></td>

                                    </tr>
                                    <tr>
                                        <th scope="row">Email</th>
                                        <td><%=u.getEmail()%></td>

                                    </tr>
                                    <tr>
                                        <th scope="row">Password</th>
                                        <td><%=u.getPassword()%></td>

                                    </tr>
                                </tbody>
                            </table>
                        </div>

                        <!--edit profile-->
                        <div id="edit-profile" style="display: none;">
                            <form id="edit-form" action="editServlet" method="post" enctype="multipart/form-data">
                                <table class="table">

                                    <tbody>
                                        <tr>
                                            <th scope="row">Id</th>
                                            <td><%=u.getId()%></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">First Name</th>
                                            <td><input type="text" class="form-control" name="firstName" value="<%=u.getFirstName()%>"></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Last Name</th>
                                            <td><input type="text" name="lastName" class="form-control" value="<%=u.getLastName()%>"></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Email</th>
                                            <td><input type="email" name="email" class="form-control" value="<%=u.getEmail()%>"></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Password</th>
                                            <td><input type="password" name="password" class="form-control" value="<%=u.getPassword()%>"></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Profile</th>
                                            <td><input type="file" name="profile" class="form-control" value="<%=u.getProfile()%>"></td>

                                        </tr>
                                    </tbody>
                                </table>
                                <div class="container text-center">
                                    <button class="btn btn-primary" type="submit">Save</button>
                                </div>
                            </form>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button id="edit-profile-btn" type="button" class="btn btn-primary">Edit</button>
                    </div>
                </div>
            </div>
        </div>



        <!--js-->
        <script
            src="https://code.jquery.com/jquery-3.6.0.min.js"
            integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="js/myJs.js" type="text/javascript"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>


        <script>
            $(document).ready(function () {
                console.log("loading....");




                let btn1 = false;
                $("#edit-profile-btn").click(function () {
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
                })
            })
        </script>
    </body>
</html>
