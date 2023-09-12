
package com.tech.blog.servlets;

import com.tech.blog.dao.userDao;
import com.tech.blog.entities.Helper;
import com.tech.blog.entities.user;
import com.tech.blog.helper.connectionProvider;
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
public class editServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String gender = request.getParameter("gender");
            Part part = request.getPart("file");
            String fileName = part.getSubmittedFileName();

            HttpSession s=request.getSession();
            user user=(user)s.getAttribute("currentUser");
            
            user.setName(name);
            user.setEmail(email);
            user.setPassword(password);
            user.setGender(gender);
            String oldPathName=user.getProfile();
            user.setProfile(fileName);

            userDao dao = new userDao(connectionProvider.getConnection());

            boolean f = dao.updateUser(user);
            if (f) {
                
                String path=request.getRealPath("/")+"img"+File.separator+user.getProfile();
                Helper h=new Helper();
                boolean f1=h.updateFile(part.getInputStream(), path);
                
                //delete file
                  String oldPath=request.getRealPath("/")+"img"+File.separator+oldPathName;
                  boolean f2=h.deleteFile(oldPath);
              
                response.sendRedirect("profile.jsp");
            } else {
                out.println("error");
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
