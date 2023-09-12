<%-- 
    Document   : navbar
    Created on : Jun 19, 2021, 8:37:29 PM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   
   <!-----------Font Awesome Icons----->
  <link rel="stylesheet" href="./css/all.css"/>
  
      <!-----Custume style------>
    <!--<link rel="stylesheet" href="./css/style.css"/>-->
    <link rel="stylesheet" href="./navbar.css"/>
    
    <body>
      <nav>
         <div class="main-menu">
            
            <ul>
               <li><a href="#"><i class="fab fa-facebook">Facebook</i></a>
               
                  <div class="sub-menu">
                      <ul>
                            <li><a href="#"><i class="fab fa-facebook">face</i></a></li>
                            <li><a href="#"><i class="fab fa-instagram">insta</i></a></li>
                            <li><a href="#"><i class="fab fa-youtube">yout</i></a></li>
                        </ul>
                  </div>
               </li>
               <li><a href="#"><i class="fab fa-instagram">Instagram</i></a></li>
               <li><a href="#"><i class="fab fa-viber">Viber</i></a></li>
               <li><a href="#"><i class="fab fa-youtube">Youtube</i></a></li>
               <li><a href=""><i class="fab fa-google">Google</i></a></li>
            </ul>
         </div>
      </nav>
   </body>
</html>
