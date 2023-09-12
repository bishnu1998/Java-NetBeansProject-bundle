
package com.tech.blog.servlet;

import com.tech.blog.dao.userDao;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String check=request.getParameter("check");
            if(check==null){
                out.println("check before...");
            }else{
                String firstName=request.getParameter("firstName");
                String lastName=request.getParameter("lastName");
                String email=request.getParameter("userEmail");
                String password=request.getParameter("userPassword");
                String address=request.getParameter("userAddress");
                String city=request.getParameter("userCity");
                String state=request.getParameter("userState");
                
                //create object of User
                User user=new User(firstName,lastName,email,password,address,city,state);
                
                //create object of userDao
                userDao dao=new userDao(ConnectionProvider.getConnection());
                if(dao.saveUser(user)){
                    out.println("successfull Inserted..");
                }else{
                    out.println("error occure!!");
                }
            }
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
