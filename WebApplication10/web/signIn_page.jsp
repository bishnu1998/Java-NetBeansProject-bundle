<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    
      <!--font awesome--> 
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    <!--css-->
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <link href="css/loginCss.css" rel="stylesheet" type="text/css"/>
   
        <title>signIn Page</title>
    </head>
    <body>
        
        <!--navbar-->
        <%@include file="navbar.jsp" %>
        <!--end navbar-->
        <section class="loginBackground">
            <div class="container text-center py-3">
                <div class="row">
                    <div class="col-mx-8 offset-md-3">
                        <div class="card primary-background">
                            <div class="card-header">
                                <span class="fa fa-user-plus icon"></span>
                                <h3>SignIn</h3>
                            </div>
                            <div class="card-body">
                                <form action="RegisterServlet" method="post">
                                    <div class="form-row">
                                      <div class="form-group col-md-6">
                                        <label for="firstName">First Name</label>
                                        <input name="firstName" type="text" class="form-control" id="firstName" placeholder="First Name">
                                      </div>
                                      <div class="form-group col-md-6">
                                        <label for="lastName">Last Name</label>
                                        <input name="lastName" type="text" class="form-control" id="lastName" placeholder="Last Name">
                                      </div>
                                    </div>
                                    <div class="form-row">
                                      <div class="form-group col-md-6">
                                        <label for="inputEmail4">Email</label>
                                        <input name="userEmail" type="email" class="form-control" id="inputEmail4" placeholder="Email">
                                      </div>
                                      <div class="form-group col-md-6">
                                        <label for="inputPassword4">Password</label>
                                        <input name="userPassword" type="password" class="form-control" id="inputPassword4" placeholder="Password">
                                      </div>
                                    </div>
                                    <div class="form-group">
                                      <label for="inputAddress">Address</label>
                                      <input name="userAddress" type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
                                    </div>          
                                    <div class="form-row">
                                      <div class="form-group col-md-6">
                                        <label for="inputCity">City</label>
                                        <input name="userCity" type="text" class="form-control" id="inputCity">
                                      </div>
                                      <div class="form-group col-md-4">
                                        <label for="inputState">State</label>
                                        <input type="text" name="userState" class="form-control" id="inputState">
                                      </div>
                                      <div class="form-group col-md-2">
                                        <label for="inputZip">Zip</label>
                                        <input name="userZip" type="text" class="form-control" id="inputZip">
                                      </div>
                                    </div>
                                    <div class="form-group">
                                      <div class="form-check">
                                        <input name="check" class="form-check-input" type="checkbox" id="gridCheck">
                                        <label class="form-check-label" for="gridCheck">
                                          Check me out
                                        </label>
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
        
          <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    </body>
</html>
