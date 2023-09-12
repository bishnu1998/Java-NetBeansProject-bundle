<%@page import="com.tech.blog.inteties.User"%>
<%@page import="com.tech.blog.inteties.Message"%>
<%
    User user = (User) session.getAttribute("currentUser");

    if (user == null) {
        response.sendRedirect("login.jsp");
    }
%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <title>Hello, world!</title>
    </head>
    <body>
        <%@include file="navbar.jsp" %>

        <!--form-->
        <div class="container text-center py-5">
            <div class="row">
                <div class="col-md-4 offset-md-4 py-4">
                    <div class="card">
                        <div class="card-header">

                        </div>
                        <div class="card-body">
                            <div class="container text-center">

                                <!--profile detail-->
                                <div id="profile-detail">

                                    <img src="img/<%=user.getProfile()%>" style="height: 150px; width:150px; border-radius: 10px;">

                                    <!--message-->
                                    <%
                                        Message m = (Message) session.getAttribute("msg");
                                        if (m != null) {
                                    %>
                                    <div class="alert">
                                        <%=m.getMessage()%>
                                    </div>
                                    <%
                                            session.removeAttribute("msg");
                                        }

                                    %>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                        <h5>Profile Detail</h5>

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
                                                <th scope="row">Password</th>
                                                <td><%=user.getPassword()%></td>

                                            </tr>
                                        </tbody>
                                    </table>
                                </div>

                                <!-- Button trigger modal -->
                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
                                    Edit
                                </button>
                                <form action="logout" method="post">
                                   <div class="form-group py-4">
                                        <button type="submit" class="btn btn-primary btn-lg">
                                        Logout
                                    </button>
                                   </div>
                                </form>

                                <!-- Modal -->
                                <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="exampleModalLabel"></h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>
                                            <div class="modal-body">
                                                <!--profile edit-->
                                                <div id="profile-edit">

                                                    <img src="img/<%=user.getProfile()%>" style="height: 150px; width:150px; border-radius: 10px;">

                                                    <form action="editServlet" method="post" enctype="multipart/form-data">
                                                        <table class="table">

                                                            <thead>
                                                                <tr>
                                                            <h5>Profile Detail</h5>

                                                            </tr>
                                                            </thead>
                                                            <tbody>
                                                                <tr>
                                                                    <th scope="row">Id:</th>
                                                                    <td><%=user.getId()%></td>

                                                                </tr>
                                                                <tr>
                                                                    <th scope="row">Name:</th>
                                                                    <td><input type="text" class="form-control" name="name1" value="<%=user.getName()%>"></td>

                                                                </tr>
                                                                <tr>
                                                                    <th scope="row">Email:</th>
                                                                    <td><input type="email" class="form-control" name="email" value="<%=user.getEmail()%>"></td>

                                                                </tr>
                                                                <tr>
                                                                    <th scope="row">Password</th>
                                                                    <td><input type="password" class="form-control" name="password" value="<%=user.getPassword()%>"></td>

                                                                </tr>
                                                                <tr>
                                                                    <th scope="row">File:</th>
                                                                    <td><input type="file" class="form-control" name="file" value="<%=user.getProfile()%>" ></td>

                                                                </tr>
                                                            </tbody>
                                                        </table>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                                                            <button type="submit" class="btn btn-primary">Save</button>
                                                        </div>
                                                    </form>
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
        </div>


        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>



    </body>
</html>