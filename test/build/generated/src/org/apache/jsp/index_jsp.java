package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
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
      out.write("  <body>\n");
      out.write("      \n");
      out.write("      <!--register-->\n");
      out.write("      <section class=\"register py-3\">\n");
      out.write("          <div class=\"container text-center\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                  <div class=\"col-md-6 offset-md-3\">\n");
      out.write("                      <div class=\"card\">\n");
      out.write("                          <div class=\"card-header\">\n");
      out.write("                              <span class=\"fa fa-user-plus\"></span>\n");
      out.write("                              <h2>SignIN</h2>\n");
      out.write("                          </div>\n");
      out.write("                          <div class=\"card-body primary-background\">\n");
      out.write("                              <form action=\"registerServlet\" method=\"post\">\n");
      out.write("                                    <div class=\"form-row\">\n");
      out.write("                                        <div class=\"form-group col-md-6\">\n");
      out.write("                                          <label for=\"firstName\">First Name</label>\n");
      out.write("                                          <input name=\"firstName\" type=\"text\" class=\"form-control\" id=\"firstName\" placeholder=\"first name\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group col-md-6\">\n");
      out.write("                                          <label for=\"lastName\">Last Name</label>\n");
      out.write("                                          <input name=\"lastName\" type=\"lastName\" class=\"form-control\" id=\"lastName\" placeholder=\"last name\">\n");
      out.write("                                        </div>\n");
      out.write("                                      </div>\n");
      out.write("                                      <div class=\"form-row\">\n");
      out.write("                                        <div class=\"form-group col-md-6\">\n");
      out.write("                                          <label for=\"inputemail\">Email</label>\n");
      out.write("                                          <input name=\"userEmail\" type=\"email\" class=\"form-control\" id=\"inputEmail4\" placeholder=\"Email\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group col-md-6\">\n");
      out.write("                                          <label for=\"inputPassword4\">Password</label>\n");
      out.write("                                          <input name=\"userPassword\" type=\"password\" class=\"form-control\" id=\"inputPassword4\" placeholder=\"Password\">\n");
      out.write("                                        </div>\n");
      out.write("                                      </div>\n");
      out.write("                                     \n");
      out.write("                                      </div>\n");
      out.write("                                      <div class=\"form-group\">\n");
      out.write("                                        <div class=\"form-check\">\n");
      out.write("                                          <input name=\"check\" class=\"form-check-input\" type=\"checkbox\" id=\"gridCheck\">\n");
      out.write("                                          <label class=\"form-check-label\" for=\"gridCheck\">\n");
      out.write("                                            Check me out\n");
      out.write("                                          </label>\n");
      out.write("                                        </div>\n");
      out.write("                                      </div>\n");
      out.write("                                      <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\n");
      out.write("                                      <button type=\"reset\" class=\"btn btn-primary\">Reset</button>\n");
      out.write("                                </form>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </section>\n");
      out.write("\n");
      out.write("      <!--footer-->\n");
      out.write("    <!-- Optional JavaScript; choose one of the two! -->\n");
      out.write("\n");
      out.write("    <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    <!-- Option 2: Separate Popper and Bootstrap JS -->\n");
      out.write("    <!--\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("    -->\n");
      out.write("  </body>\n");
      out.write("</html>");
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
