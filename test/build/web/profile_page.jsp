<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.entities.Category"%>
<%@page import="com.tech.blog.dao.postDao"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.entities.Message"%>
<%@page import="com.tech.blog.entities.User"%>
<!doctype html>
<%
    User user = (User) session.getAttribute("currentUser");
    if (user == null) {
        response.sendRedirect("login_page.jsp");
    }
%>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <!--google fonts-->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@200&display=swap" rel="stylesheet">


        <!--google fonts-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Hello, world!</title>
    </head>
    <body>
        <!--navbar-->
        <nav class="navbar navbar-expand-lg navbar-light primary-background">
            <div class="container-fluid ">
                <a class="navbar-brand" href="index.jsp">Car</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="index.jsp">Home <span class="fa fa-home"></span> <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">More <span class="fa fa-car"></span></a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="login_page.jsp">LogIn <span class="fa fa-user-circle-o"></span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-toggle="modal" data-target="#post-modal" href="login_page.jsp">Post <span class="fa fa-bell-o"></span></a>
                        </li>
                    </ul>
                    <ul class="nav navbar">
                        <li class="nav-item">
                            <a data-toggle="modal" data-target="#profile-modal"class="nav-link" href="login_page.jsp"><%=user.getFirstName()%><span class="fa fa-user-circle-o"></span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="login_page.jsp">logOut <span class="fa fa-user-circle-o"></span></a>
                        </li>

                    </ul>
                </div>
            </div>
        </nav>

        <!--end navbar-->


        <%
            Message m = (Message) session.getAttribute("msg");
            if (m != null) {
        %>
        <div class="alert">
            <%=m.getContent()%>

        </div>
        <%
                session.removeAttribute("msg");
            }
        %>





        <!-- Modal -->
        <div class="modal fade" id="profile-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Profile</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="container text-center">



                            <!--profile detail-->
                            <div class="profile-detail">
                                <div>
                                    <img src="img/<%=user.getProfile()%>" style="height: 150px; width: 150px; border-radius: 10px;">
                                </div>
                                <table class="table">
                                    <thead>

                                    </thead>
                                    <tbody>
                                        <tr>
                                            <th scope="col">Id:</th>
                                            <th scope="col"><%=user.getId()%></th>

                                        </tr>
                                        <tr>
                                            <th scope="row">First Name:</th>
                                            <td><%=user.getFirstName()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Last Name:</th>
                                            <td><%=user.getLastName()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Email:</th>
                                            <td><%=user.getEmail()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Password:</th>
                                            <td><%=user.getPassword()%></td>

                                        </tr>
                                    </tbody>

                                </table>
                            </div>
                            <!--end of profile detail-->


                            <!--edit profile-->
                            <div class="edit-profile" id="edit-form" style="display: none;">
                                <form action="editServlet" method="post" enctype="multipart/form-data">
                                    <table class="table">
                                        <thead>

                                        <h5 scope="col">Edit Carefully!!</h5>

                                        </thead>
                                        <tbody>
                                            <tr>
                                                <th scope="col">Id:</th>
                                                <th scope="col"><%=user.getId()%></th>

                                            </tr>
                                            <tr>
                                                <th scope="row">First Name:</th>
                                                <td><input type="text" class="form-control" name="firstName" value="<%=user.getFirstName()%>"></td>

                                            </tr>
                                            <tr>
                                                <th scope="row">Last Name:</th>
                                                <td><input type="text" class="form-control" name="lastName" value="<%=user.getLastName()%>"></td>

                                            </tr>
                                            <tr>
                                                <th scope="row">Email:</th>
                                                <td><input type="email" class="form-control" name="userEmail" value="<%=user.getEmail()%>"></td>

                                            </tr>
                                            <tr>
                                                <th scope="row">Password:</th>
                                                <td><input type="password" class="form-control" name="userPassword" value="<%=user.getPassword()%>"></td>

                                            </tr>
                                            <tr>
                                                <th scope="row">File</th>
                                                <td><input type="file" class="form-control" name="file" ></td>

                                            </tr>
                                        </tbody>

                                    </table>
                                    <div class="container">
                                        <button type="submit" class="btn btn-primary">Save</button>
                                    </div>
                                </form>
                            </div>
                            <!--end of edit profile-->
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button id="edit-profile-btn" type="button" class="btn btn-primary">Edit</button>
                    </div>
                </div>
            </div>
        </div>


        <!--post modal-->
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
                        <form action="addPostServlet" method="post" enctype="multipart/form-data">
                            <div class="form-group">
                                <select class="form-control">
                                    <option selected="disable">Select Category</option>
                                    
                                  

                                </select>
                            </div>
                            <div class="form-group">
                                <input name="pTitle" type="text" class="form-control" placeholder="enter title">
                            </div>
                            <div class="form-group">
                                <textarea name="pContent" class="form-control" placeholder="enter the content" style="height: 150px;"></textarea>
                            </div>
                            <div class="form-group">
                                <textarea name="pCode" class="form-control" placeholder="enter the code" style="height: 150px;"></textarea>
                            </div>
                            <div class="form-group">
                                <label for="file">select your pic:</label>
                                <br>
                                <input name="file" type="file" class="form-control">
                            </div>

                            <div class="container text-center">
                                <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                                <button type="submit" class="btn btn-primary">Post</button>
                            </div>
                        </form>
                    </div>

                </div>
            </div>
        </div>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


        <!--use for ajax javascript-->
        <script
            src="https://code.jquery.com/jquery-3.6.0.min.js"
            integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
        crossorigin="anonymous"></script>


        <script>
            $(document).ready(function () {
                let btn1 = false;
                $("#edit-profile-btn").click(function () {
                    if (btn1 == false) {
                        $(".profile-detail").hide();
                        $(".edit-profile").show();
                        $(this).text("Back");
                        btn1 = true;
                    } else {
                        $(".profile-detail").show();
                        $(".edit-profile").hide();
                        $(this).text("Edit");
                        btn1 = false;
                    }
                })
            })

        </script>


    </body>
</html>