package com.tech.blog.servlet;

import com.tech.blog.dao.userDao;
import com.tech.blog.entities.Message;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.helper.Helper;
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
            String fName = request.getParameter("firstName");
            String lName = request.getParameter("lastName");
            String email = request.getParameter("userEmail");
            String password = request.getParameter("userPassword");
            Part part = request.getPart("file");
            String fileName = part.getSubmittedFileName();

            HttpSession s = request.getSession();
            User user = (User) s.getAttribute("currentUser");

            user.setFirstName(fName);
            user.setLastName(lName);
            user.setEmail(email);
            user.setPassword(password);
            String oldFileName = user.getProfile();
            user.setProfile(fileName);

            userDao dao = new userDao(ConnectionProvider.getConnection());
            boolean f = dao.updateUser(user);
            if (f) {

                String path = request.getRealPath("/") + "img" + File.separator + user.getProfile();

                Helper h = new Helper();
                boolean b = h.saveFile(part.getInputStream(), path);

//                deletion of old file
                    
                    String oldPath=request.getRealPath("/")+"img"+File.separator+oldFileName;
                    boolean of=h.deleteFile(oldPath);
                Message msg = new Message("sucssfully edited", "success");
                s.setAttribute("msg", msg);
                response.sendRedirect("profile_page.jsp");

            } else {
                Message msg = new Message("somethings went wrong", "error", "error");
                s.setAttribute("msg", msg);
                response.sendRedirect("profile_page.jsp");

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
