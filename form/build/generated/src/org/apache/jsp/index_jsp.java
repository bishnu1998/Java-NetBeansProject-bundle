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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("   <head>\r\n");
      out.write("      <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("      <title>JSP Page</title>\r\n");
      out.write("   </head>\r\n");
      out.write("   <!--css-->\r\n");
      out.write("<!--   <style>\r\n");
      out.write("      .container{\r\n");
      out.write("         width:40%;\r\n");
      out.write("         border:solid black;\r\n");
      out.write("         margin:auto;\r\n");
      out.write("         padding:20px;\r\n");
      out.write("         font-size:20px;\r\n");
      out.write("      }\r\n");
      out.write("      #myForm table tr td input{\r\n");
      out.write("         font-size: 20px;\r\n");
      out.write("      }\r\n");
      out.write("   </style>-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"form.css\">\r\n");
      out.write("   <body>\r\n");
      out.write("   <selection>\r\n");
      out.write("       <div class=\"container\">\r\n");
      out.write("          <h1>My Form</h1>\r\n");
      out.write("      <form id=\"myForm\" action=\"registrationServlet\" method=\"post\">\r\n");
      out.write("         <table>\r\n");
      out.write("            <tr class=\"form-group\">\r\n");
      out.write("               <td>Enter your name:</td>\r\n");
      out.write("               <td><input type=\"text\" name=\"user_name\" placeholder=\"user name\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr class=\"form-group\">\r\n");
      out.write("               <td>Enter your password:</td>\r\n");
      out.write("               <td><input type=\"password\" name=\"user_password\" placeholder=\"password\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr class=\"form-group\">\r\n");
      out.write("               <td>Enter your Email:</td>\r\n");
      out.write("               <td><input type=\"email\" name=\"user_email\" placeholder=\"email\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("               <td>select Gender:</td>\r\n");
      out.write("               <td><input type=\"radio\" name=\"user_gender\" value=\"mail\">Mail &nbsp &nbsp<input type=\"radio\" name=\"user_gender\" value=\"female\">Female</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr class=\"form-group\">\r\n");
      out.write("               <td>select your course:</td>\r\n");
      out.write("               <td>\r\n");
      out.write("                  <select name=\"user_course\">\r\n");
      out.write("                     <option value=\"java\">java</option>\r\n");
      out.write("                     <option value=\"pythan\">pythan</option>\r\n");
      out.write("                     <option value=\"php\">php</option>\r\n");
      out.write("                     <option value=\"c++\">c++</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("               </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr class=\"form-group\">\r\n");
      out.write("               <td style=\"text-align: right\">\r\n");
      out.write("                  <input type=\"checkbox\" value=\"checked\" name=\"condition\">\r\n");
      out.write("               </td>\r\n");
      out.write("               <td>Agree terms and condition</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr class=\"btn\">\r\n");
      out.write("               <td> </td>\r\n");
      out.write("               <td>\r\n");
      out.write("                  <button type=\"submit\">Register</button>\r\n");
      out.write("                  <button type=\"reset\">Reset</button>\r\n");
      out.write("               </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("           </table>\r\n");
      out.write("      </form>\r\n");
      out.write("      </div>\r\n");
      out.write("   </selection>\r\n");
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
