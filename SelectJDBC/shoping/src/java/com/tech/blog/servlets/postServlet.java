/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.servlets;

import com.tech.blog.dao.postDao;
import com.tech.blog.entities.Helper;
import com.tech.blog.entities.post;
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
public class postServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int cId = Integer.parseInt(request.getParameter("cId"));
            String title = request.getParameter("title");
            String content = request.getParameter("content");
            String code = request.getParameter("code");
            Part part = request.getPart("file");
            String fileName = part.getSubmittedFileName();

            HttpSession s = request.getSession();
            user u = (user) s.getAttribute("currentUser");

            int id = u.getId();

            //out.print(title+content+code+fileName+id);
            post p = new post(title, content, code, fileName, cId);

            postDao pd = new postDao(connectionProvider.getConnection());
            boolean f = pd.savePost(p);
            if (f) {
                Helper h=new Helper();
                //path
                String path=request.getRealPath("/")+"pic"+File.separator+p.getpPic();
               boolean b=h.updateFile(part.getInputStream(),path);
                
                response.sendRedirect("profile.jsp");
            } else {
                out.print("error");
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
