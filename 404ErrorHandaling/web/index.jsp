<%-- 
    Document   : index
    Created on : Jun 24, 2021, 6:36:26 PM
    Author     : bishnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add module project</title>
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    </head>
    <body>
        
        <div class="container">
            <div class="row text-center">
                <div class="col-md-6 offset-md-3">
                    <form action="op.jsp" method="post">
                         <div class="card">
                        <div class="card-header bg-dark text-white">
                        <h3>provide me two number</h3>
                        
                        </div>
                         <div class="card-body bg-secondary">
                             <div class="form-group">
                                 <input name="n1" type="number" class="form-control" placeholder="Enter n1">                     
                            </div>
                            <div class="form-group">
                                 <input name="n2" type="number" class="form-control" placeholder="Enter n2">                       
                             </div>                        
                         </div>
                          <div class="card-footer bg-dark text-white">
                             <button type="submit" class="btn btn-outline-light">divide</button>
                        
                          </div>
                        
                    </div>
                    </form>
                </div>
                
            </div>
            
        </div>
    </body>
</html>
