

<%@page import="com.dbms.pro.entities.Message"%>
<%@page import="com.dbms.pro.entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    User user = (User) session.getAttribute("currentUser");
    if (user == null) {
        response.sendRedirect("loginpage.jsp");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
        <!--Bootstrap css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>

        <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>

        <!--for font awsome icon from w3 school-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <link href="css/mycss.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <!--navbar-->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">profile</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <button style="border: none; background: transparent;"><a class="nav-link" href="#"data-toggle="modal" data-target="#edit-profile-btn">Edit <span class="fa fa-edit"></span></a></button>
                    </li>
                    <li class="nav-item active">
                        <button  style="border: none; background: transparent;"><a class="nav-link" href="deleteServlet">Delete <span class="fa fa-delete"></span></a></button>
                    </li>
                </ul>
                <ul class="navbar-nav mr-right">
                    <li class="nav-item active">
                        <a class="nav-link" href=""><%=user.getName()%> <span class="fa fa-user-circle"></span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="logoutServlet">Logout<span class="fa fa-logout"></span></a>
                    </li>
                </ul>
            </div>
        </nav>
        <!--end of navbar-->

        <section>
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-5">
                        <div class="profile-detail">
                            <div class="profile">
                                <img src="img/<%=user.getProfile()%>" style="height: 150px; width: 150px; border-radius:20%;"/>
                            </div>
                            <div class="message">
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
                            </div>
                            <table class="table table-striped table-dark">
                                <thead>
                                    <tr>
                                        <th scope="col"></th>
                                        <th scope="col"></th>

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
                                        <th scope="row">Address:</th>
                                        <td><%=user.getAddress()%></td>

                                    </tr>

                                </tbody>
                            </table>
                            <div class="btnSet py-2">
                                <a href="#"> <button class="btn btn-primary btn2" data-toggle="modal" data-target="#edit-profile-btn">Edit</button></a>
                                <a href="deleteServlet"> <button class="btn btn-primary btn3">Delete</button></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-7">
                        <div class="container-fluid text-center">
                            <div class="row">
                                <div class="col">
                                    <div class="edit-profile">
                                        <!-- Modal -->
                                        <div class="modal fade" id="edit-profile-btn" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                            <div class="modal-dialog" role="document">
                                                <div class="modal-content">

                                                    <div class="modal-body">
                                                        <div class="profile">
                                                            <img src="img/<%=user.getProfile()%>" style="height: 150px; width: 150px; border-radius: 50%; "/>
                                                        </div>
                                                        <form action="editServlet" method="post" enctype="multipart/form-data">
                                                            <table class="table">
                                                                <thead>
                                                                    <tr>
                                                                <p>Edit Carefully!!</p>
                                                                </tr>
                                                                </thead>
                                                                <tbody>
                                                                    <tr>
                                                                        <th scope="row">Name:</th>
                                                                        <td><input name="name" class="form-control" type="text" value=<%=user.getName()%>></td>

                                                                    </tr>
                                                                    <tr>
                                                                        <th scope="row">Email:</th>
                                                                        <td><input name="email" class="form-control" type="email" value=<%=user.getEmail()%>></td>

                                                                    </tr>
                                                                    <tr>
                                                                        <th scope="row">Password:</th>
                                                                        <td><input name="password" class="form-control" type="password" value=<%=user.getPassword()%>></td>

                                                                    </tr>
                                                                    <tr>
                                                                        <th scope="row">Address:</th>
                                                                        <td><input name="address" class="form-control" type="text" value=<%=user.getAddress()%>></td>

                                                                    </tr>
                                                                    <tr>
                                                                        <th scope="row">Profile;</th>
                                                                        <td><input name="file" class="form-control" type="file" value=<%=user.getProfile()%>></td>

                                                                    </tr>
                                                                </tbody>
                                                            </table>
                                                            <button type="submit" class="btn btn-success">Update</button>
                                                        </form>
                                                    </div>
                                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
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
