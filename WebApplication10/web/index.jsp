<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <!--font awesome--> 
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
    <!--css-->
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    
       <!--google fonts-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Merriweather:wght@300&display=swap" rel="stylesheet">

    
    <title>Hello, world!</title>
  </head>
  <body>
    <!--navbar-->
    <%@include file="navbar.jsp" %>

    <!--banner section-->
 
    <section class="header">
        <div class="continer h-100">
            <div class="row align-items-center h-100">
                <div class="col-md-6 offset-md-3 text-center">
                    <h1>Welcome to car buy and sell!!</h1>
                    <p>
                       Quickly design and customize responsive mobile-first 
                       sites with Bootstrap, the world?s most popular 
                       front-end open source toolkit, featuring Sass 
                       variables and mixins, responsive grid system, extensive
                       prebuilt components, and powerful JavaScript plugins. 
                    </p>
                    <a href="login_page.jsp" class="btn btn-primary mybtn"><span class="fa fa-user-circle fa-spin"></span> LogIn</a>
                </div>
            </div>
        </div>
    </section>
    
     <!--message section-->
    <section class="message py-5">
        <div class="container">
            <div class="row">
                <div class="col-md-12 text-center">
                    
                    <h2>We have got you what you need!!</h2>
                    <p>
                        Quickly design and customize responsive mobile-first 
                           sites with Bootstrap, the world?s most popular 
                           front-end open source toolkit, featuring Sass 
                    </p>
                    <button class="btn btn-primary mybtn">more info</button>
                </div>    
            </div>
        </div>
    </section>
    
    
    <!--service-->
    <section class="service py-2">
        <div class="container">
            <div class="row text-center">
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">
                            <i class="fa fa-bar-chart myicon"></i> 
                            <h3>Detail Info</h3>
                            <p>
                       Quickly design and customize responsive mobile-first 
                       sites with Bootstrap, the world?s most popular 
                       front-end open source toolkit, featuring Sass 
                       variables and mixins, responsive grid system, extensive
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="cared-body">
                            <i class="fa fa-bell-o myicon"></i>
                            <h3>Detail Info</h3>
                            <p>
                       Quickly design and customize responsive mobile-first 
                       sites with Bootstrap, the world?s most popular 
                       front-end open source toolkit, featuring Sass 
                       variables and mixins, responsive grid system, extensive
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">
                            <i class="fa fa-braille myicon"></i>
                             <h3>Detail Info</h3>
                            <p>
                       Quickly design and customize responsive mobile-first 
                       sites with Bootstrap, the world?s most popular 
                       front-end open source toolkit, featuring Sass 
                       variables and mixins, responsive grid system, extensive
                            </p>
                             
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    
    <!--download section-->
     <section class="message py-5">
        <div class="container">
            <div class="row">
                <div class="col-md-12 text-center">
                    
                    <h2>Download new Feature!!</h2>
                    <p>
                        Quickly design and customize responsive mobile-first 
                           sites with Bootstrap, the world?s most popular 
                           front-end open source toolkit, featuring Sass 
                    </p>
                    <button class="btn btn-primary mybtn">more info</button>
                </div>    
            </div>
        </div>
    </section>
 
    <!--important links-->
    <section class="impLink">
        <div class="container align-items-center">
            <div class="row text-center">
                <h3>Importance links</h3>
                <div class="col-md-6">
                    <p>youtube <span class="fa fa-youtube icon"></span></p>
                    <p>facebook <span class="fa fa-facebook icon"></span></p>
                    <p>Google <span class="fa fa-google icon"></span></p>
                </div>
                <div class="col-md-6">
                    <p>Instagram <span class="fa fa-instagram icon"></span></p> 
                    <p>viber <span class="fa fa-phone icon"></span></p>
                    <p>Email <span class="fa fa-upload icon"></span></p>
                </div>
            </div>
        </div>
    </section>
    
   <!--footer-->
   <section class="footer bg-dark">
       <div class="container py-5 text-white">
           <div class="row text-center">
               <p>Copyright<span class="fa fa-copyright"></span>2021:bishnu soft</p>
           </div>
       </div>
   </section>
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