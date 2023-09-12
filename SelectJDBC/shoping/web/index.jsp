<%-- 
    Document   : index
    Created on : Jun 20, 2021, 6:18:03 PM
    Author     : bishnu
--%>

<%@page import="com.tech.blog.entities.post"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.entities.category"%>
<%@page import="com.tech.blog.dao.postDao"%>
<%@page import="com.tech.blog.helper.connectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
      
      <!--Bootstrap css-->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous"/>
   
      <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>
      
      <!--for font awsome icon from w3 school-->
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
      
      <style>
          .banner-background{
        clip-path: polygon(50% 0%, 100% 0, 100% 60%, 100% 100%, 49% 91%, 0 100%, 0 0);  }
      </style>
      
   </head>
   <body>
<!--  
to check the connection
<h1>Hello World!</h1>
      <% 
      Connection con=connectionProvider.getConnection();
      
      %>
      
      <%= con %>
      -->
      
      <!--navbar-->
      <%@include file="normal_navbar.jsp"%>
      
      <!--banner-->
      
      <div class="container-fluid p-0 m-0">
          
          <div class="jumbotron primary-background text-white banner-background">
             
              <div class="container">
                  
                  <h3 class="display-3">Welcome to TechBlog</h3>
              <p>Welcome to Technical blog,World of Technology 
              Study Groups offer an opportunity to meet online with others interested in developing computational skills and earning certifications. Sessions run daily, Monday through Friday. Sign up in advance to reserve your seat or join a Study Group whenever you can.</p>
              
              <p>Study Groups offer an opportunity to meet online with others interested in developing computational skills and earning certifications. Sessions run daily, Monday through Friday. Sign up in advance to reserve your seat or join a Study Group whenever you can.</p>
              
              <button class="btn btn-outline-light btn-lg"><span class="fa fa-user-plus"</span>Strats! it's free</button>
              <a href="login_page.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-user-circle fa-spin"></span>LogIn</a>
              </div>
          </div>
      </div>
      
      <!--cards-->
    <!--  <div class="container">
          
          <div class="row mb-2">
              <div class="col-md-4">
                  <div class="card" style="width: 18rem;">-->
                     <!--<img class="card-img-top" src="..." alt="Card image cap">-->
                   <!--  <div class="card-body">
                    <h5 class="card-title">Java Programming Language</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn primary-background text-white">Read more</a>
                    </div>
                   </div>
              </div>
              <div class="col-md-4">
                  <div class="card" style="width: 18rem;">
                     <!--<img class="card-img-top" src="..." alt="Card image cap">-->
              <!--       <div class="card-body">
                    <h5 class="card-title">Java Programming Language</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn primary-background text-white">Read more</a>
                    </div>
                   </div>
              </div>
              <div class="col-md-4">
                  <div class="card" style="width: 18rem;">
                     <!--<img class="card-img-top" src="..." alt="Card image cap">-->
                 <!--    <div class="card-body">
                    <h5 class="card-title">Java Programming Language</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn primary-background text-white">Read more</a>
                    </div>
                   </div>
              </div>
          </div>
          
          
          
          <div class="row">
              <div class="col-md-4">
                  <div class="card" style="width: 18rem;">
                     <!--<img class="card-img-top" src="..." alt="Card image cap">-->
             <!--        <div class="card-body">
                    <h5 class="card-title">Java Programming Language</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn primary-background text-white">Read more</a>
                    </div>
                   </div>
              </div>
              <div class="col-md-4">
                  <div class="card" style="width: 18rem;">
                     <!--<img class="card-img-top" src="..." alt="Card image cap">-->
             <!--        <div class="card-body">
                    <h5 class="card-title">Java11 Programming Language</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn primary-background text-white">Read more</a>
                    </div>
                   </div>
              </div>
              <div class="col-md-4">
                  <div class="card" style="width: 18rem;">
                     <!--<img class="card-img-top" src="..." alt="Card image cap">-->
             <!--        <div class="card-body">
                    <h5 class="card-title">Java Programming Language</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" class="btn primary-background text-white">Read more</a>
                    </div>
                   </div>
              </div>
          </div>
      </div>-->
      
      
          <!--main body-->

        <div class="container-fluid">
            <div class="row mt-5">
                <div class="col-md-2">
                    <!--categories-->
                    <div class="list-group">
                        <a href="#" class="list-group-item list-group-item-action active">
                            All Posts
                        </a>

                        <%
                            postDao d = new postDao(connectionProvider.getConnection());
                            ArrayList<category> list1 = d.getAllCategory();

                            for (category cc : list1) {
                        %> 
                        <a href="#" class="list-group-item list-group-item-action">
                            <%= cc.getName()%>
                        </a>
                        <%
                            }
                        %>
                    </div>

                </div>
                <div class="col-md-10">
                    <!--posts-->

                    <div class="container-fluid">
                        <div class="row mt-2">
                            
                                 <%
                            ArrayList<post> ls = d.getAllPost();
                            for (post p1 : ls) {
                        %>
                       <div class="col-md-6 py-2">
                        <div class="card" style="width: 23rem;">
                            <img class="card-img-top" src="pic/<%=p1.getpPic()%>" >
                            <div class="card-body">
                                <h5 class="card-title"><%=p1.getpTitle()%></h5>
                                <p class="card-text"><%=p1.getpContent()%></p>
                                <a href="#" class="btn btn-primary">More!</a>
                            </div>
                        </div>
                                 </div>
                        <%
                            }
                        %>
                           
                        </div>
                       
                    </div>

                </div>
            </div>
        </div>
      
      
      <!--Bootstrap javaScript-->
      <script
   src="https://code.jquery.com/jquery-3.6.0.min.js"
   integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
  
   <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
   
   
   <script src="js/myjs.js" type="text/javascript"></script>
   
   <!--to check either jquery is applied or not-->
<!--   <script>
      
      $(document).ready(function(){
         alert("document loaded")
      })
   </script>-->
   </body>
</html>
