<%-- 
    Document   : index
    Created on : Jun 17, 2021, 3:20:43 PM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   <!--css-->
<!--   <style>
      .container{
         width:40%;
         border:solid black;
         margin:auto;
         padding:20px;
         font-size:20px;
      }
      #myForm table tr td input{
         font-size: 20px;
      }
   </style>-->
<link rel="stylesheet" href="form.css">
   <body>
   <selection>
       <div class="container">
          <h1>My Form</h1>
      <form id="myForm" action="registrationServlet" method="post">
         <table>
            <tr class="form-group">
               <td>Enter your name:</td>
               <td><input type="text" name="user_name" placeholder="user name"></td>
            </tr>
            <tr class="form-group">
               <td>Enter your password:</td>
               <td><input type="password" name="user_password" placeholder="password"></td>
            </tr>
            <tr class="form-group">
               <td>Enter your Email:</td>
               <td><input type="email" name="user_email" placeholder="email"></td>
            </tr>
            <tr>
               <td>select Gender:</td>
               <td><input type="radio" name="user_gender" value="mail">Mail &nbsp &nbsp<input type="radio" name="user_gender" value="female">Female</td>
            </tr>
            <tr class="form-group">
               <td>select your course:</td>
               <td>
                  <select name="user_course">
                     <option value="java">java</option>
                     <option value="pythan">pythan</option>
                     <option value="php">php</option>
                     <option value="c++">c++</option>
                  </select>
               </td>
            </tr>
            <tr class="form-group">
               <td style="text-align: right">
                  <input type="checkbox" value="checked" name="condition">
               </td>
               <td>Agree terms and condition</td>
            </tr>
            <tr class="btn">
               <td> </td>
               <td>
                  <button type="submit">Register</button>
                  <button type="reset">Reset</button>
               </td>
            </tr>
           </table>
      </form>
      </div>
   </selection>
   </body>
</html>
