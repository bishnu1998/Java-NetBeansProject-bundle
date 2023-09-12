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
      out.write("   <link rel=\"stylesheet\" href=\"form1.css\">\r\n");
      out.write("   <body>\r\n");
      out.write("      <selector>\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("         <div class=\"header\">\r\n");
      out.write("            <h1>Form</h1>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         <div class=\"myForm\">\r\n");
      out.write("            <form action=\"\" method=\"post\">\r\n");
      out.write("               <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"userName\">Name</label>\r\n");
      out.write("                  <input type=\"text\" id=\"userNaem\" name=\"userName\">\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"userPassword\">Pasword</label>\r\n");
      out.write("                  <input type=\"password\" id=\"userPassword\" name=\"userPassword\">\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"email\">email</label>\r\n");
      out.write("                  <input type=\"email\" id=\"email\" name=\"email\">\r\n");
      out.write("               </div>\r\n");
      out.write("               <div class=\"form-group\">\r\n");
      out.write("                  <label for=\"message\">Message</label>\r\n");
      out.write("                  <textarea name=\"message\" id=\"message\" cols=\"30\" rows=\"10\"></textarea>\r\n");
      out.write("               </div>\r\n");
      out.write("               \r\n");
      out.write("               <div class=\"btn\">\r\n");
      out.write("                  <button type=\"submit\">submit</button>\r\n");
      out.write("                  <button type=\"reset\">reset</button>\r\n");
      out.write("               </div>\r\n");
      out.write("            </form>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      </selector>\r\n");
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
