<%-- 
    Document   : index
    Created on : Jun 15, 2021, 4:31:04 PM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/mylib" prefix="t" %>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   <body>
      <h1>Hello World!</h1>
      <!--mytag name is created on mylib.tld file-->
   <t:mytag></t:mytag>
   
    <t:printTable number="9" color="red"></t:printTable>
    <t:printTable number="5" color="blue"></t:printTable>
   </body>
</html>
