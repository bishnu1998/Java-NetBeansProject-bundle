package com.tech.blog.servlet;

import com.tech.blog.Dao.Helper;
import com.tech.blog.Dao.userDao;
import com.tech.blog.helper.ConnectionProvider;
import com.tech.blog.inteties.Message;
import com.tech.blog.inteties.User;
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
public class Register extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String name = request.getParameter("name1");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            Part part = request.getPart("file");
            String fileName = part.getSubmittedFileName();

            User user = new User(name, email, password, fileName);

            userDao dao = new userDao(ConnectionProvider.getConnection());
            boolean f = dao.saveUser(user);
            if (f) {
                String path = request.getRealPath("/") + "img" + File.separator + user.getProfile();

                Helper h = new Helper();
                boolean f1 = h.updateFile(part.getInputStream(), path);
                if (f1) {
                    Message msg = new Message("Successfully Register", "success");
                    HttpSession s = request.getSession();
                    s.setAttribute("msg", msg);
                    response.sendRedirect("login.jsp");
                } else {
                    Message msg = new Message("Some thing went wrong!", "error");
                    HttpSession s = request.getSession();
                    s.setAttribute("msg", msg);
                    response.sendRedirect("index.jsp");
                }

            } else {
                Message msg = new Message("Some thing went wrong!", "error");
                HttpSession s = request.getSession();
                s.setAttribute("msg", msg);
                response.sendRedirect("index.jsp");
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
