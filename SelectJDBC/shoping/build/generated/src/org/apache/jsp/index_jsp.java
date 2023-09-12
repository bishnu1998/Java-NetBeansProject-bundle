package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.blog.helper.connectionProvider;
import java.sql.Connection;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/normal_navbar.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("   <head>\r\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("      <title>JSP Page</title>\r\n");
      out.write("      \r\n");
      out.write("      <!--Bootstrap css-->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\"/>\r\n");
      out.write("   \r\n");
      out.write("      <link href=\"css/myStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("      \r\n");
      out.write("      <!--for font awsome icon from w3 school-->\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"/>\r\n");
      out.write("      \r\n");
      out.write("      <style>\r\n");
      out.write("          .banner-background{\r\n");
      out.write("        clip-path: polygon(50% 0%, 100% 0, 100% 60%, 100% 100%, 49% 91%, 0 100%, 0 0);  }\r\n");
      out.write("      </style>\r\n");
      out.write("      \r\n");
      out.write("   </head>\r\n");
      out.write("   <body>\r\n");
      out.write("<!--  \r\n");
      out.write("to check the connection\r\n");
      out.write("<h1>Hello World!</h1>\r\n");
      out.write("      ");
 
      Connection con=connectionProvider.getConnection();
      
      
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      ");
      out.print( con );
      out.write("\r\n");
      out.write("      -->\r\n");
      out.write("      \r\n");
      out.write("      <!--navbar-->\r\n");
      out.write("      ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark primary-background\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fa fa-asterisk\"></span>Tech Blog</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-bell-o\"></span>Learncode with Drugesh<span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item dropdown\">\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <span class=\"fa fa-check-square-o\"</span>Categories\n");
      out.write("        </a>\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Programming Language</a>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Project Learning</a>\n");
      out.write("          <div class=\"dropdown-divider\"></div>\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\">Data Structure</a>\n");
      out.write("        </div>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\"><span class=\"fa fa-address-card-o\"></span>Contact</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"login_page.jsp\"><span class=\"fa fa-user-circle\"></span>Login</a>\n");
      out.write("      </li>\n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("           <a class=\"nav-link\" href=\"register_page.jsp\"><span class=\"fa fa-user-plus\"></span>Registration</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("      <button class=\"btn btn-outline-light my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      <!--banner-->\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"container-fluid p-0 m-0\">\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"jumbotron primary-background text-white banner-background\">\r\n");
      out.write("             \r\n");
      out.write("              <div class=\"container\">\r\n");
      out.write("                  \r\n");
      out.write("                  <h3 class=\"display-3\">Welcome to TechBlog</h3>\r\n");
      out.write("              <p>Welcome to Technical blog,World of Technology \r\n");
      out.write("              Study Groups offer an opportunity to meet online with others interested in developing computational skills and earning certifications. Sessions run daily, Monday through Friday. Sign up in advance to reserve your seat or join a Study Group whenever you can.</p>\r\n");
      out.write("              \r\n");
      out.write("              <p>Study Groups offer an opportunity to meet online with others interested in developing computational skills and earning certifications. Sessions run daily, Monday through Friday. Sign up in advance to reserve your seat or join a Study Group whenever you can.</p>\r\n");
      out.write("              \r\n");
      out.write("              <button class=\"btn btn-outline-light btn-lg\"><span class=\"fa fa-user-plus\"</span>Strats! it's free</button>\r\n");
      out.write("              <a href=\"login_page.jsp\" class=\"btn btn-outline-light btn-lg\"><span class=\"fa fa-user-circle fa-spin\"></span>LogIn</a>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <!--cards-->\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"row mb-2\">\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                  <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("                     <!--<img class=\"card-img-top\" src=\"...\" alt=\"Card image cap\">-->\r\n");
      out.write("                     <div class=\"card-body\">\r\n");
      out.write("                    <h5 class=\"card-title\">Java Programming Language</h5>\r\n");
      out.write("                    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("                    <a href=\"#\" class=\"btn primary-background text-white\">Read more</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                  <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("                     <!--<img class=\"card-img-top\" src=\"...\" alt=\"Card image cap\">-->\r\n");
      out.write("                     <div class=\"card-body\">\r\n");
      out.write("                    <h5 class=\"card-title\">Java Programming Language</h5>\r\n");
      out.write("                    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("                    <a href=\"#\" class=\"btn primary-background text-white\">Read more</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                  <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("                     <!--<img class=\"card-img-top\" src=\"...\" alt=\"Card image cap\">-->\r\n");
      out.write("                     <div class=\"card-body\">\r\n");
      out.write("                    <h5 class=\"card-title\">Java Programming Language</h5>\r\n");
      out.write("                    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("                    <a href=\"#\" class=\"btn primary-background text-white\">Read more</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                  <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("                     <!--<img class=\"card-img-top\" src=\"...\" alt=\"Card image cap\">-->\r\n");
      out.write("                     <div class=\"card-body\">\r\n");
      out.write("                    <h5 class=\"card-title\">Java Programming Language</h5>\r\n");
      out.write("                    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("                    <a href=\"#\" class=\"btn primary-background text-white\">Read more</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                  <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("                     <!--<img class=\"card-img-top\" src=\"...\" alt=\"Card image cap\">-->\r\n");
      out.write("                     <div class=\"card-body\">\r\n");
      out.write("                    <h5 class=\"card-title\">Java Programming Language</h5>\r\n");
      out.write("                    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("                    <a href=\"#\" class=\"btn primary-background text-white\">Read more</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                  <div class=\"card\" style=\"width: 18rem;\">\r\n");
      out.write("                     <!--<img class=\"card-img-top\" src=\"...\" alt=\"Card image cap\">-->\r\n");
      out.write("                     <div class=\"card-body\">\r\n");
      out.write("                    <h5 class=\"card-title\">Java Programming Language</h5>\r\n");
      out.write("                    <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\r\n");
      out.write("                    <a href=\"#\" class=\"btn primary-background text-white\">Read more</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   </div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      <!--Bootstrap javaScript-->\r\n");
      out.write("      <script\r\n");
      out.write("   src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\r\n");
      out.write("   integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\r\n");
      out.write("  crossorigin=\"anonymous\"></script>\r\n");
      out.write("  \r\n");
      out.write("   <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("   <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   <script src=\"js/myjs.js\" type=\"text/javascript\"></script>\r\n");
      out.write("   \r\n");
      out.write("   <!--to check either jquery is applied or not-->\r\n");
      out.write("<!--   <script>\r\n");
      out.write("      \r\n");
      out.write("      $(document).ready(function(){\r\n");
      out.write("         alert(\"document loaded\")\r\n");
      out.write("      })\r\n");
      out.write("   </script>-->\r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
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
