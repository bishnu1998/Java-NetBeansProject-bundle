<%-- 
    Document   : index
    Created on : Jun 14, 2021, 8:19:36 PM
    Author     : bishnu
--%>
<!--jsp page directive tags-->
<!--page directive is use to implement java code in jsp page-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>


<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   <body>
      <!--we will discuss all about directive tags-->
      
      <!--jsp include directive-->
      <!--include directive use to include new pages-->
      <%@include file="newjsp.jsp" %>
      
      <h2>this is the index page</h2>
      
      <%@include file="newjsp.jsp" %>
      
      <%!
      //declarative tags
      int a=3,b=5,c=0;
      public void sum(){
         c=a+b;
      }
     
      %>
      
      <%
      //screpting tags
      sum();
      %>
      
      <%=
      c
      %>
      
      
     

 
   </body>
</html>
