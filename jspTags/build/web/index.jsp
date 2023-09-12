<%-- 
    Document   : index
    Created on : Jun 13, 2021, 9:36:14 PM
    Author     : bishnu
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   <body>
      <h1>Hello World!</h1>
      <!--Declaration tag-->
    <%! 
    //variable declaration
    int x=5;
    int y=5;
    int s;
    
    //method decleration
    public int sum(){
       s=x+y;
       return s;
    }
    
    %>
    
    
    <!--Scripting tag-->
    <%
       //invoce above method
     s=sum();
     out.println("sum of the variable is:");
    sum();
    %>
    
    
    <!--Expression tag(to display)-->
    <%= 
      //displaying the variable values      
           
      //displaying the sum      
            
      s  
            
     %>
   </body>
</html>
