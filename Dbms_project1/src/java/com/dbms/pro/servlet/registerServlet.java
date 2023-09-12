package com.dbms.pro.servlet;

import com.dbms.pro.dao.Helper;
import com.dbms.pro.dao.userDao;
import com.dbms.pro.entities.Message;
import com.dbms.pro.entities.User;
import com.dbms.pro.helper.ConnectionProvider;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig
public class registerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String check = request.getParameter("check");

            if (check == null) {
                out.println("checked before..");
            } else {
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String address = request.getParameter("address");
                Part part = request.getPart("file");
                String fileName = part.getSubmittedFileName();

              User user=new User(name,email,password,address,fileName);
              
              userDao dao=new userDao(ConnectionProvider.getConnection());
              boolean f=dao.saveUser(user);
              if(f){
                  Message msg=new Message("Successfully Registered!!","Success","success");
                  HttpSession s=request.getSession();
                  s.setAttribute("msg", msg);
                  response.sendRedirect("registerPage.jsp");
                  
                
              }else{
                  Message msg=new Message("Somethings went wrong!!","error","danger");
                  HttpSession s=request.getSession();
                  s.setAttribute("msg", msg);
                  response.sendRedirect("registerPage.jsp");
              }
              
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
