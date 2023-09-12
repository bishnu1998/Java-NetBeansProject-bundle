<%-- 
    Document   : newjsp
    Created on : Jun 14, 2021, 8:28:06 PM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
   </head>
   
    <!--jsp Taglib directive-->
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
   <!--we can use any character or string instate of c in prefix section-->
   <body>
      <h1>This is the new jsp page</h1>
       
      <a href = "<c:url value = "/jsp/index.htm"/>">TEST</a>
       <c:set var="name" value="technology"></c:set>
       <c:out value="${name}"></c:out>
       <c:if test="${3>2}">this is true</c:if>
       
       <c:set var="key" value="bishnu"></c:set>
       <c:out value="${key}"></c:out>
       
   </body>
</html>
