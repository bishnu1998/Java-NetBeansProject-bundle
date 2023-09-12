

package attribute;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class s1 extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      try {
         /* TODO output your page here. You may use following sample code. */
         out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
         out.println("<title>Servlet s1</title>");         
         out.println("</head>");
         out.println("<body>");
         
         out.println("<h1>servlet1</h1>");
         //reciving value
         String num1=request.getParameter("n1");
         String num2=request.getParameter("n2");
         
         //converting into integer type
         int n1=Integer.parseInt(num1);
         int n2=Integer.parseInt(num2);
         
         //sum...
         int s=n1+n2;
         
         //int to string conversion
         String ad;
         ad = String.valueOf(s);
         
         //attribute...
         //sum is key and s is value which is strin type
         request.setAttribute("sum",ad);
         
         //to move into next page i.e servlet2
         RequestDispatcher rd=request.getRequestDispatcher("s2");
         rd.forward(request,response);
         
         
         out.println("</body>");
         out.println("</html>");
      } finally {
         out.close();
      }
   }

   // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   /**
    * Handles the HTTP <code>GET</code> method.
    *
    * @param request servlet request
    * @param response servlet response
    * @throws ServletException if a servlet-specific error
    * occurs
    * @throws IOException if an I/O error occurs
    */
   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      processRequest(request, response);
   }

   /**
    * Handles the HTTP <code>POST</code> method.
    *
    * @param request servlet request
    * @param response servlet response
    * @throws ServletException if a servlet-specific error
    * occurs
    * @throws IOException if an I/O error occurs
    */
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
      processRequest(request, response);
   }

   /**
    * Returns a short description of the servlet.
    *
    * @return a String containing servlet description
    */
   @Override
   public String getServletInfo() {
      return "Short description";
   }// </editor-fold>

}
