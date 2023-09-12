<%@page import="com.tech.blog.inteties.User"%>
<%@page import="com.tech.blog.inteties.Message"%>
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
        <div class="container text-center ">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-header">
                            <h3>Register</h3>
                        </div>
                        <div class="card-body">
                            <%
                                Message m=(Message)session.getAttribute("msg");
                                if(m!=null)
                                {
                            %>
                            <div class="alert">
                                <%= m.getMessage() %>
                            </div>
                            <%
                                session.removeAttribute("msg");
                                }
                            %>
                            <form action="Register" method="post" enctype="multipart/form-data">
                                <div class="form-row">
                                    <div class="form-group col-md-12">

                                        <input name="name1" type="text" class="form-control" id="inputEmail4" placeholder="Name">
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group col-md-12">

                                        <input name="email" type="email" class="form-control" id="inputEmail4" placeholder="Email">
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group col-md-12">

                                        <input name="password" type="password" class="form-control" id="inputPassword4" placeholder="Password">
                                    </div>
                                </div>
                               

                                <div class="form-group col-md-12">
                                    
                                    <input name="file" type="file" class="form-control" id="inputZip">
                                </div>
                        </div>
                        
                        <button type="submit" class="btn btn-primary">Sign in</button>
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
</body>
</html>