
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
        response.sendRedirect("login.jsp");
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

        <!--css-->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>

        <!--google fonts-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Hello, world!</title>
    </head>

    <body>
        <!--navbar-->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="index.jsp">car</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Dropdown
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Something else here</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#">Disabled</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#"  data-toggle="modal" data-target="#add-post-modal">Do post</a>
                    </li>
                </ul>
                <ul class="nav nav-item">
                    <li class="nav-item">
                        <a  class="nav-link " href="#" data-toggle="modal" data-target="#profile-modal"><span class="fa fa-user-circle-o"><%=user.getName()%></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="logoutServlet"><span class="fa fa-user-plus">LogOut</span></a>
                    </li>
                </ul>
            </div>
        </nav>

        <!--end navbar-->


        <!-- main body of the page--> 

        <main>

            <div class="container">
                <div class="row mt-4">
                    <!--first column-->
                    <div class="col-md-4">
                        <!--category-->
                        <div class="list-group">
                            <a href="#" class="list-group-item list-group-item-action active">
                                All Posts
                            </a>

                            <%
                                postDao d = new postDao(ConnectionProvider.getConnection());
                                ArrayList<Category> list1 = d.getAllCategory();

                                for (Category cc : list1) {
                            %> 
                            <a href="#" class="list-group-item list-group-item-action">
                                <%= cc.getName()%>
                            </a>
                            <%
                                }
                            %>
                        </div>

                    </div>
                    <!--second column-->
                    <div class="col-md-8">
                        <!--posts-->
                        <div class="container text-center" id="loader">
                            <i class="fa fa-refresh fa-spin fa-4x" ></i>
                            <h3 class="mt-4">loading...</h3>
                        </div>
                        <div class="container-fluid" id="post-container">
                            
                        </div>
                    </div>
                </div>
            </div>
        </main>



        <!--end of main body of the page-->
        <%
            Message m = (Message) session.getAttribute("msg");
            if (m != null) {
        %>
        <div class="alerat">
            <%= m.getContent()%>
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
                        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="container text-center">
                            <div>
                                <img src="img/<%= user.getProfile()%>" style="height: 100px; width: 100px; border-radius: 15px;">
                            </div>

                            <!--profile detail-->
                            <div class="profile-detail">
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
                                            <th scope="row">Password:</th>
                                            <td><%=user.getPassword()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Address:</th>
                                            <td><%=user.getAddress()%></td>

                                        </tr>
                                        <tr>
                                            <th scope="row">City:</th>
                                            <td><%=user.getCity()%></td>

                                        </tr>
                                    </tbody>
                                </table>
                            </div>

                            <!--edit profile-->
                            <div class="edit-profile" style="display: none;">
                                <form action="editServlet" method="post" enctype="multipart/form-data">
                                    <table class="table">
                                        <thead>
                                            <tr>
                                        <h5>Edit Profile</h5>

                                        </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <th scope="row">Id:</th>
                                                <td><%=user.getId()%></td>

                                            </tr>
                                            <tr>
                                                <th scope="row">Name:</th>
                                                <td><input name="name1" type="text" class="form-group" value="<%= user.getName()%>"> </td>

                                            </tr>
                                            <tr>
                                                <th scope="row">Email:</th>
                                                <td><input name="email" type="email" class="form-group" value="<%=user.getEmail()%>"></td>

                                            </tr>
                                            <tr>
                                                <th scope="row">Password:</th>
                                                <td><input name="password" type="password" class="form-group" value="<%=user.getPassword()%>"></td>

                                            </tr>
                                            <tr>
                                                <th scope="row">Address:</th>
                                                <td><input name="address" type="text" class="form-group" value="<%=user.getAddress()%>"></td>

                                            </tr>
                                            <tr>
                                                <th scope="row">City:</th>
                                                <td><input name="city" type="text" class="form-group" value="<%=user.getCity()%>"></td>

                                            </tr>
                                            <tr>
                                                <th scope="row">File:</th>
                                                <td><input name="file" type="file" class="form-group" value="<%=user.getProfile()%>"></td>

                                            </tr>
                                        </tbody>

                                    </table>
                                    <div class="submit-btn">
                                        <button type="submit" class="btn btn-primary">save</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button id="edit-profile-btn" type="button" class="btn btn-primary">Edit</button>
                    </div>
                </div>
            </div>
        </div>



        <!--add post modal-->

        <!-- Modal -->
        <div class="modal fade" id="add-post-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Provide post detail</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">

                        <form id="add-post-form" action="addPostServlet" method="post" enctype="multipart/form-data">

                            <div class="form-group">
                                <select class="form-control" name="cid">
                                    <option selected="disable">select category</option>

                                    <%
                                        postDao dao = new postDao(ConnectionProvider.getConnection());
                                        ArrayList<Category> list = dao.getAllCategory();
                                        for (Category c : list) {
                                    %>
                                    <option value="<%= c.getCid()%>">
                                        <%= c.getName()%>
                                    </option>
                                    <%
                                        }
                                    %>

                                </select>
                            </div>
                            <div class="form-group">

                                <input name="ptitle" type="text" placeholder="Enter post title" class="form-control">
                            </div>

                            <div class="form-group">
                                <textarea name="pcontent" style="height: 200px;" class="form-control" placeholder="enter your content"></textarea>
                            </div>
                            <div class="form-group">
                                <textarea name="pcode" style="height: 150px;" class="form-control" placeholder="enter your code"></textarea>
                            </div>
                            <div class="form-group">
                                <label for="file">select your pic:</label>
                                <br>
                                <input name="file" type="file" >
                            </div>

                            <div class="container text-center">
                                <button type="submit" class="btn btn-primary">Post</button>
                            </div>
                        </form>

                    </div>

                </div>
            </div>
        </div>
        <!--end addpost modal-->



        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

        <!--sweet alert cdn-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <!--Bootstrap java Script-->
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


        <!--now add post js-->
        <script>

            $(document).ready(function (e) {
                // alert("loaded");

                $("#add-post-form").on("submit", function (event) {
                    //this code gets called when the form is submitted...
                    event.preventDefault();
                    console.log("ajax is working..");

                    // let form=$(this) FormData();
                    let form = new FormData(this);

                    //now requesting to servlet
                    $.ajax({
                        url: "addPostServlet",
                        type: 'POST',
                        data: form,
                        success: function (data, textStatus, jqXHR) {
                            //success..
                            console.log(data);
                            if (data.trim() == 'done') {
                                //usgin sweet alert
                                swal("Good job!", "save successfully!", "success");
                            } else {
                                swal("error!!", "Somethings went wrong!", "error");
                            }
                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            //error...
                        },
                        processData: false,
                        contentType: false

                    });

                });

            });

        </script>


        <!--load post using ajax-->

        <script>
            $(document).ready(function () {
                //alert("hello");

                $.ajax({
                    url: "load_post.jsp",
                    success: function (data, textStatus, jqXHR) {
                        //use to prent in the console
                        console.log(data);
                        $("#loader").hide();
                        //use to display content in web page. i.e windows
                        $("#post-container").html(data);
                    }
                })
            })

        </script>
    </body>
</html>