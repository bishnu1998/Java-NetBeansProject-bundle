<%-- 
    Document   : index
    Created on : Jul 13, 2021, 9:26:43 PM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

         <!--css-->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container ">
            <div class="row">
                <div class="col m6 offset-m3">
                    <div class="card">
                        <div class="card-content">

                            <h2>Register Here!!</h2>
                            <h5 id="msg" class="center-align"></h5>
                        </div>

                        <div class="form center-align" >
                            <form action="Register" method="post" id="myform" enctype="multipart/form-data">
                                <input type="text" name="user_name" placeholder="Enter your name">
                                <input type="password" name="user_password" placeholder="Enter your password">
                                <input type="email" name="user_email" placeholder="Enter your Email">     
                                <div class="file-field input-field">
                                    <div class="btn">
                                        <span>File</span>
                                        <input name="image" type="file">
                                    </div>
                                    <div class="file-path-wrapper">
                                        <input class="file-path validate" type="text">
                                    </div>
                                </div>
                                <button class="btn red" type="submit">Submit</button>
                            </form>

                        </div>

                        <div class="loader center-align">
                            <div class="preloader-wrapper big active">
                                <div class="spinner-layer spinner-blue-only">
                                    <div class="circle-clipper left">
                                        <div class="circle"></div>
                                    </div><div class="gap-patch">
                                        <div class="circle"></div>
                                    </div><div class="circle-clipper right">
                                        <div class="circle"></div>
                                    </div>
                                </div>
                            </div>


                            <h5>Please Wait...</h5>
                            <!--end loader-->
                        </div>    
                    </div>
                </div>
            </div>
        </div>


        <!-- Compiled and minified JavaScript -->

        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>


        <!--jaquary-->

        <script
            src="https://code.jquery.com/jquery-3.6.0.min.js"
            integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
        crossorigin="anonymous"></script>

        <script>
            $(document).ready(function() {
                console.log("loaded..");

                $("#myform").on('submit', function(event) {
                    event.preventDefault();

//                    var f = $(this).serialize();
                        
                        let f=new FormData(this); 
                        
                        
                    console.log("data" + f);

                    $(".loader").show();
                    $(".form").hide();
                    $.ajax({
                        url: "Register",
                        data: f,
                        type: 'POST',
                        success: function(data, textStatus, jqXHR) {
                            console.log(data);
                            console.log("success 123.....");
                            $(".loader").hide();
                            $(".form").show();

                            if (data.trim() === 'done') {
                                $("#msg").html("successfully Register!!");
                            } else {
                                $("#msg").html("something went wrong!!");

                            }
                        },
                        error: function(jqXHR, textStatus, errorThrown) {
                            console.log(data);
                            console.log("Error!!.....");
                            $(".loader").hide();
                            $(".form").show();
                            $("#msg").html("something went wrong!!");
                        },
                        processData: false,
                        contentType: false
                    });
                });
            });
        </script>
    </body>
</html>
