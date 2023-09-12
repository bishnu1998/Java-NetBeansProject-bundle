<!doctype html>
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
    <%@include file="navbar.jsp" %>

    <!--login-->
     <section class="register py-3">
          <div class="container text-center">
              <div class="row">
                  <div class="col-md-4 offset-md-4">
                      <div class="card">
                          <div class="card-header">
                              <span class="fa fa-user-plus"></span>
                              <h2>LogIn</h2>
                          </div>
                          <div class="card-body primary-background">
                              <form action="loginServlet" method="post">    
                                      <div class="form-row">
                                        <div class="form-group col-md-12">
                                          <label for="inputemail">Email</label>
                                          <input name="userEmail" type="email" class="form-control" id="inputEmail4" placeholder="Email">
                                        </div>
                                        <div class="form-group col-md-12">
                                          <label for="inputPassword4">Password</label>
                                          <input name="userPassword" type="password" class="form-control" id="inputPassword4" placeholder="Password">
                                        </div>
                                      </div>
                                      <button type="submit" class="btn btn-primary">Sign in</button>
                                      <button type="reset" class="btn btn-primary">Reset</button>
                                </form>
                          </div>
                      </div>
                  </div>
              </div>
          </div>
      </section>
    <!--footer-->
    <%@include file="footer.jsp" %>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>