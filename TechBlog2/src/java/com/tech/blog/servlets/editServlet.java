package com.tech.blog.servlets;

import com.tech.blog.dao.Helper;
import com.tech.blog.dao.userDao;
import com.tech.blog.entities.Message;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;
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
        try (PrintWriter out = response.getWriter()) {

            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            //for file
            Part part = request.getPart("profile");
            String fileName = part.getSubmittedFileName();

            //  out.println(firstName+" "+lastName+" "+email+" "+password+" "+fileName);
            HttpSession s = request.getSession();
            User user = (User) s.getAttribute("currentUser");

            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setPassword(password);

            //to get old path
            String oldPathName = user.getProfile();
            user.setProfile(fileName);

            userDao dao = new userDao(ConnectionProvider.getConnection());
            boolean f = dao.updateUser(user);

            if (f) {

                //insertion
                String path = request.getRealPath("/") + "img" + File.separator + user.getProfile();
                Helper h = new Helper();
                h.updateFile(part.getInputStream(), path);

                //deletion
                String oldPath = request.getRealPath("/") + "img" + File.separator + oldPathName;
               h.deleteFile(oldPath);

                Message msg = new Message("successfully updataed", "success");
                s.setAttribute("msg", msg);
                
                response.sendRedirect("profilePage.jsp");
            } else {

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
