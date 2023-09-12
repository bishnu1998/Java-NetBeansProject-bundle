

package com.tech.blog.servlets;

import com.tech.blog.dao.userDao;
import com.tech.blog.entities.user;
import com.tech.blog.helper.connectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@MultipartConfig
public class registerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
//            fetch all form data
            String check=request.getParameter("check");
//            out.println(check);
            if(check==null){
                //code
                out.println("box not checked");
            }else{
                String name=request.getParameter("user_name");
                String password=request.getParameter("user_password");
                String email=request.getParameter("user_email");
                String gender=request.getParameter("gender");
                String about=request.getParameter("about");
                
                System.out.println("first");
                //create user object and set all data to that object
                user user=new user(name,password,email,gender,about);
                
                System.out.println("second");
                //create user dao object
                userDao dao=new userDao(connectionProvider.getConnection());
                System.out.println("third");
                if(dao.saveUser(user)){
                    out.println("successfully registered!!");
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
