<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

        <!--css-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            .baner-background{
                clip-path: polygon(49% 0, 100% 0, 100% 100%, 66% 95%, 29% 95%, 0 100%, 0 0);
            }
        </style>
        <title>Hello, world!</title>
    </head>
    <body>

        <!--navbar-->
        <%@include file="navbar.jsp" %>

        <!--registration-->
        <main class="d-flex align-items-center primary-background" style="height:100vh">
            <div class="container">

                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-header primary-background text-center text-white">
                            <span class="fa fa-user-plus fa-3x"></span>
                            <p>Register</p>
                        </div>
                        <div class="card-body">
                            <form id="reg-form" action="registerServlet" method="POST">
                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <label for="inputEmail4">First Name</label>
                                        <input name="firstName" type="text" class="form-control" id="inputEmail4" placeholder="first name">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label for="inputPassword4">Last Name</label>
                                        <input name="lastName" type="text" class="form-control" id="inputPassword4" placeholder="last name">
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="form-group col-md-6">
                                        <label for="inputEmail4">Email</label>
                                        <input name="email" type="email" class="form-control" id="inputEmail4" placeholder="Email">
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label for="inputPassword4">Password</label>
                                        <input name="password" type="password" class="form-control" id="inputPassword4" placeholder="Password">
                                    </div>
                                </div>
                        </div>
                        <div class="form-group col-md-4">
                            <div class="form-check">
                                <input name="check" class="form-check-input" type="checkbox" id="gridCheck">
                                <label class="form-check-label" for="gridCheck">
                                    Check me out
                                </label>
                            </div>
                        </div>
                        <div class="container text-center">
                            <div id="loader" style="display: none">
                                <span class="fa fa-refresh fa-spin fa-3x"></span>
                                <h4>please wet's</h4>
                            </div>
                        </div>
                        <button id="submit-btn" type="submit" class="btn btn-primary">Sign in</button>
                        </form>
                    </div>
                </div>

            </div>
        </main>

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
                console.log("loading....")

                $("#reg-form").on('submit', function (event) {
                    event.preventDefault();

                    let form = new FormData(this);

                    $("#loader").show();
                    $("#submit-btn").hide();
                    //send data to registerServlet
                    $.ajax({
                        url: "registerServlet",
                        type: "POST",
                        data: form,
                        success: function (data, textStatus, jqxHR) {
                            console.log(data)
                            $("#loader").hide();
                            $("#submit-btn").show();
                            
                             if (data.trim() === 'done')
                            {

                                swal("Registered successfully..We are going to redirect to login page")
                                        .then((value) => {
                                            window.location = "loginPage.jsp"
                                        });
                            } else
                            {

                                swal(data);
                            }
                        },
                        error: function (jqXHR, textStatus, errorThrow) {
                            console.log(jqXHR)
                            $("#loader").hide();
                            $("#submit-btn").show();
                            swal("something went wrong!")
                        },
                        processData: false,
                        contentType: false
                    });
                });
            });
        </script>

    </body>
</html>