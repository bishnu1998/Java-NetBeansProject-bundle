

package formPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registrationServlet extends HttpServlet {
   public void doPost(HttpServletRequest request,HttpServletResponse response)
           throws ServletException,IOException{
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      
      out.println("<h2>welcome to register servlet</h2>");
      
      String name=request.getParameter("user_name");
      String password=request.getParameter("user_password");
      String email=request.getParameter("user_email");
      String gender=request.getParameter("user_gender");
      String course=request.getParameter("user_course");
      String cond=request.getParameter("condition");
      
     if(cond!=null){
         if(cond.equals("checked")){
         out.println("<br>name:"+name);
         out.println("<br>password:"+password);
         out.println("<br>email:"+email);
         out.println("<br>gender:"+gender);
         out.println("<br>course:"+course);
         
         RequestDispatcher rd=request.getRequestDispatcher("successServlet");
         rd.forward(request, response);
         
         }else{
         out.println("checked condition not satisfied");
         }
        }else{
         out.println("agree term and condition");
         
         RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
         rd.include(request,response);
      }
     
   }
}
