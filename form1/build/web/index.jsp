<%-- 
    Document   : index
    Created on : Jun 18, 2021, 10:24:39 PM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   <link rel="stylesheet" href="form1.css">
   <body>
      <selector>
      <div class="container">
         <div class="header">
            <h1>Form</h1>
         </div>
         
         <div class="myForm">
            <form action="" method="post">
               <div class="form-group">
                  <label for="userName">Name</label>
                  <input type="text" id="userNaem" name="userName">
               </div>
               <div class="form-group">
                  <label for="userPassword">Pasword</label>
                  <input type="password" id="userPassword" name="userPassword">
               </div>
               <div class="form-group">
                  <label for="email">email</label>
                  <input type="email" id="email" name="email">
               </div>
               <div class="form-group">
                  <label for="message">Message</label>
                  <textarea name="message" id="message" cols="30" rows="10"></textarea>
               </div>
               
               <div class="btn">
                  <button type="submit">submit</button>
                  <button type="reset">reset</button>
               </div>
            </form>
         </div>
      </div>
      </selector>
   </body>
</html>
