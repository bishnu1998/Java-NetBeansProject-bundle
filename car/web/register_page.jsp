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
      <!--banner-->
      <%@include file="navbar.jsp" %>
      
      <!--register-->
      <section class="register py-3">
          <div class="container text-center">
              <div class="row">
                  <div class="col-md-6 offset-md-3">
                      <div class="card">
                          <div class="card-header">
                              <span class="fa fa-user-plus"></span>
                              <h2>SignIN</h2>
                          </div>
                          <div class="card-body primary-background">
                              <form action="registerServlet" method="post">
                                    <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="firstName">First Name</label>
                                          <input name="firstName" type="text" class="form-control" id="firstName" placeholder="first name">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="lastName">Last Name</label>
                                          <input name="lastName" type="lastName" class="form-control" id="lastName" placeholder="last name">
                                        </div>
                                      </div>
                                      <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputemail">Email</label>
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
                                        <div class="form-group col-md-6">
                                          <label for="inputState">State</label>  
                                          <input name="userState" type="text" class="form-control" id="inputState">
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

      <!--footer-->
      <%@include file="footer.jsp" %>
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
  </body>
</html>