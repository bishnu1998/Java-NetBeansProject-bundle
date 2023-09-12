package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.blog.entities.User;

public final class profile_005fpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    User user=(User)session.getAttribute("currentUser");
    if(user==null){
        response.sendRedirect("login_page.jsp");
    }
    
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <!--google fonts-->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@200&display=swap\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("<!--css-->\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write(" \n");
      out.write("<!--google fonts-->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<title>Hello, world!</title>\n");
      out.write("  </head>\n");
      out.write(" <body>\n");
      out.write("        \n");
      out.write("        <!--navbar-->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light primary-background\">\n");
      out.write("  <div class=\"container-fluid \">\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\">Car</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"fa fa-home\"></span> <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">More <span class=\"fa fa-car\"></span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("          Models <span class=\"fa fa-car\"></span>\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("          <div class=\"dropdown-divider\"></div>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("             <a class=\"nav-link\" href=\"\">LogOut <span class=\"fa fa-user-plus\"></span></a>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("      <ul class=\"navbar-nav mr-left\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"\" data-toggle=\"modal\" data-target=\"#profile-modal\" > <span class=\"fa fa-user-circle-o\"></span>");
      out.print(user.getFirstName());
      out.write("</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("             <a class=\"nav-link\" href=\"logoutServlet\">LogOut <span class=\"fa fa-user-plus\"></span></a>\n");
      out.write("        </li>\n");
      out.write("   \n");
      out.write("      </ul>\n");
      out.write("   </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        \n");
      out.write("   \n");
      out.write("        \n");
      out.write("        <!-- Button trigger modal -->\n");
      out.write("\n");
      out.write("<!-- Modal -->\n");
      out.write("<div class=\"modal fade\" id=\"profile-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("    <div class=\"modal-content\">\n");
      out.write("        <div class=\"modal-header\">\n");
      out.write("            <div class=\"container text-center\" >\n");
      out.write("               <h5 class=\"modal-title\" id=\"exampleModalLabel\">Test</h5>\n");
      out.write("               <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                 <span aria-hidden=\"true\">&times;</span>\n");
      out.write("               </button>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <div class=\"container text-center\">\n");
      out.write("                <img src=\"img/default1.png\" style=\"border-radius: 40px; width: 150px; height: 150px;\">\n");
      out.write("            \n");
      out.write("              \n");
      out.write("              <br>\n");
      out.write("              <div id=\"profile-details\">\n");
      out.write("                  <table class=\"table\">\n");
      out.write("                    <thead>\n");
      out.write("                      <tr>\n");
      out.write("                    <p>Profile</p>\n");
      out.write("                      </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                         <tr>\n");
      out.write("                        <th scope=\"row\">Id:</th>\n");
      out.write("                        <td>");
      out.print( user.getId() );
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <th scope=\"row\">First Name:</th>\n");
      out.write("                        <td>");
      out.print( user.getFirstName() );
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <th scope=\"row\">Last Name:</th>\n");
      out.write("                        <td>");
      out.print( user.getLastName() );
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <th scope=\"row\">Email:</th>\n");
      out.write("                        <td>");
      out.print( user.getPassword());
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                      </tr>\n");
      out.write("                      <tr>\n");
      out.write("                            <th scope=\"row\">Email:</th>\n");
      out.write("                            <td>");
      out.print( user.getPassword());
      out.write("</td>\n");
      out.write("\n");
      out.write("                          </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                  </table>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <!--edit profile-->\n");
      out.write("              <div id=\"profile-edit\" style=\"display:none;\">\n");
      out.write("                  <form action=\"editServlet\" method=\"post\">\n");
      out.write("                      <table class=\"table\">\n");
      out.write("                        <thead>\n");
      out.write("                          <tr>\n");
      out.write("                        <p>Edit Carefully</p>\n");
      out.write("                          </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                             <tr>\n");
      out.write("                            <th scope=\"row\">Id:</th>\n");
      out.write("                            <td>");
      out.print( user.getId() );
      out.write("</td>\n");
      out.write("\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                            <th scope=\"row\">First Name:</th>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" name=\"firstName\" value=\"");
      out.print( user.getFirstName() );
      out.write("\"></td>\n");
      out.write("\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                            <th scope=\"row\">Last Name:</th>\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" name=\"lastName\" value=\"");
      out.print( user.getLastName() );
      out.write("\"></td>\n");
      out.write("\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                            <th scope=\"row\">Email:</th>\n");
      out.write("                            <td><input type=\"email\" class=\"form-control\" name=\"userEmail\" value=\"");
      out.print( user.getEmail());
      out.write("\"></td>\n");
      out.write("\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                            <th scope=\"row\">Email:</th>\n");
      out.write("                            <td><input type=\"password\" class=\"form-control\" name=\"userPassword\" value=\"");
      out.print( user.getPassword());
      out.write("\"></td>\n");
      out.write("\n");
      out.write("                          </tr>\n");
      out.write("                        </tbody>\n");
      out.write("                      </table>\n");
      out.write("                            <button class=\"btn btn-primary\" type=\"submit\">Save</button>\n");
      out.write("                  </form>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("        <button id=\"edit-profile-button\" type=\"button\" class=\"btn btn-primary\">Edit</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("      <!--Bootstrap javaScript-->\n");
      out.write("      <script\n");
      out.write("   src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\n");
      out.write("   integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\n");
      out.write("  crossorigin=\"anonymous\"></script>\n");
      out.write("  \n");
      out.write("   <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("   <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("   <script src=\"js/myJs.js\" type=\"text/javascript\"></script>\n");
      out.write("   \n");
      out.write("   <script>\n");
      out.write("       $(document).ready(function() {\n");
      out.write("        \n");
      out.write("            let btn1=false;\n");
      out.write("            $(\"#edit-profile-button\").click(function() {\n");
      out.write("                \n");
      out.write("                if(btn1==false){\n");
      out.write("                    $(\"#profile-details\").hide();\n");
      out.write("                    $(\"#profile-edit\").show();\n");
      out.write("                    $(this).text(\"back\");\n");
      out.write("                    btn1=true;\n");
      out.write("                }else{\n");
      out.write("                    $(\"#profile-details\").show();\n");
      out.write("                    $(\"#profile-edit\").hide();\n");
      out.write("                    $(this).text(\"Edit\");\n");
      out.write("                    btn1=false;\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        \n");
      out.write("       });\n");
      out.write("   </script>\n");
      out.write("\n");
      out.write(" </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
