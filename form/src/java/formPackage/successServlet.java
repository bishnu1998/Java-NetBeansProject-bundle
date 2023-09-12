

package formPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class successServlet extends HttpServlet{
   public void doPost(HttpServletRequest request,HttpServletResponse response)
        throws ServletException,IOException{
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      
      String name=request.getParameter("user_name");
      String password=request.getParameter("user_password");
      String email=request.getParameter("user_email");
      String gender=request.getParameter("user_gender");
      String course=request.getParameter("user_course");
      
      out.println("<h2>this is your info!!");
      
      out.println("<br>name:"+name);
         out.println("<br>password:"+password);
         out.println("<br>email:"+email);
         out.println("<br>gender:"+gender);
         out.println("<br>course:"+course);
   }   

   
}
