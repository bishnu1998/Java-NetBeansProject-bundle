<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    
    <!--font  awesome icon css-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>index jsp</title>
    
    <!--google fonts-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Merriweather:wght@300&display=swap" rel="stylesheet">


    <link href="css/style.css" rel="stylesheet" type="text/css"/>
  </head>
  <body>
    <!--codding area-->
    
    <!--start of navbar-->
    
    <%@include file="navbar.jsp" %>
    <!--end of navbar-->
    
    <!--banner section-->
    <header class="header">
        <div class="container h-100">
            <div class="row h-100 align-items-center">

                <div class="col-md-6 offset-md-3 text-center">
                    <h1>welcome to bishnu website</h1>
                    <p>Documentation and examples for Bootstrap?s 
                        powerful, responsive navigation header, the navbar. 
                        Includes support for branding, navigation, and more, 
                        including support for our collapse plugin.
                    </p>

                    <button class="btn btn-primary" >start learning!!</button>

                </div>
            
        </div>
        
        </div>
    </header>
     <!--end of banner section-->
    
    
    <!--message section-->
    <section class="message py-5">
        
        <div class="container text-center">
            <h1>We've got what you need!</h1>
            <p>start learning coding from our website.
                we provide you the best feature which is the best way
                of teaching programming.At the end you can start your journey on
                coding as a professional programmer.
            </p>
            <button class='btn btn-primary'>Check it out</button>
        </div>
        
    </section>
    
    
    <!--end of message section-->
    
    
    <!--services section-->
    
    <section class="services" >
        <div class="container text-center py-5">
            <h1>About our services</h1>
            
            <div class="row">
                
                <div class='col-md-4'>
                    <!--first col-->
                    <div class="card">
                        <div class="card-body">
                            <i class="fa fa-bar-chart myicon"></i>
                            <h3>Detail Information</h3> 
                            <p>Looking to quickly add Bootstrap to your project? Use BootstrapCDN, provided for free
                            </p>
                            
                        </div>
                        
                    </div>
                </div>
                <div class='col-md-4'>
                    <div class="card">
                        <div class="card-body">
                            <i class="fa fa-bell-o myicon"></i>
                            <h3>Detail Information</h3> 
                            <p>Looking to quickly add Bootstrap to your project? Use BootstrapCDN, provided for free
                            </p>
                            
                        </div>
                        
                    </div>
                </div>
                <div class='col-md-4'>
                    <div class="card">
                        <div class="card-body">
                            <i class="fa fa-braille myicon"></i>
                            <h3>Detail Information</h3> 
                            <p>Looking to quickly add Bootstrap to your project? Use BootstrapCDN, provided for free
                            </p>
                            
                        </div>
                        
                    </div>
                </div>
               
            </div>
            
        </div>
        
    </section>
    
    <!--end of services section-->
    
    <!--download section-->
    
    
  
    
    <section class="message py-5">
        
        <div class="container text-center">
            <h1>Downloads and start!!</h1>
            <p>start learning coding from our website.
                we provide you the best feature which is the best way
                of teaching programming.At the end you can start your journey on
                coding as a professional programmer.
            </p>
            <button class='btn btn-primary'>Check it out</button>
        </div>
        
    </section>
    
      <!--end download section-->
      
      <!--contact section-->
      
      <section class="contact">
          <div class="container text-center py-5">
              <h2>Let's In Touch!!</h2>
              <p>start learning coding from our website.
                we provide you the best feature which is the best way
                of teaching programming.At the end you can start your journey on
                coding as a professional programmer.
            </p>
            <i class='fa fa-phone myicon text-warning'></i>
            <i class="fa fa-heart myicon text-danger"></i>
            <p>+984567998<p>
            <p>www.techSoft.com</p>
          </div>
      </section>
      <!--end of contact section-->
      
      
      <!--important links-->
      
       <section class="message py-5">
        
        <div class="container text-center">
            <h1>Importance Links</h1>
            <div class='container'>
                <div class="row">
                    <div class="col-md-6">
                        <p>faceBook</p> 
                        <p>twiter</p>
                        <p>google</p>
                    </div>
                    <div class="col-md-6">
                        <p>youTube</p> 
                        <p>map</p>
                        <p>classRoom</p>
                    </div>
                </div>
                
            </div>
        </div>
        
    </section>
      <!--end of important links-->
      
      <!--footer section-->
      
      <section class="footer bg-dark">
          <div class="container py-5 text-center text-white">
              <p>
                  Copyright@2020-learn codding with bishnu
              </p>
          </div>
          
      </section>
      <!--end of footer-->
    <!--end of coding area-->

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
    
    <script src="js/javascript.js">
  </body>
</html>