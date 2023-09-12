
package com.tech.blog.servlet;

import com.tech.blog.Dao.userDao;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.inteties.Message;
import com.tech.blog.inteties.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@MultipartConfig
public class login extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
             String email=request.getParameter("email");
            String password=request.getParameter("password");
            out.println(email+password);
            
            userDao dao=new userDao(ConnectionProvider.getConnection());
            
            User u=dao.getEmailAndPassword(email,password);
             
               if(u!=null){               
                HttpSession s=request.getSession();
                s.setAttribute("currentUser",u);
                response.sendRedirect("profile.jsp");
            }else{
                Message msg=new Message("Error occure in login","error");
                HttpSession s=request.getSession();
                s.setAttribute("msg", msg);
                response.sendRedirect("login.jsp");
            }
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
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
     * @throws ServletException if a servlet-specific error occurs
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
