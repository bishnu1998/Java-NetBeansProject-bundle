
package com.user;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@MultipartConfig
public class Register extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            String name=request.getParameter("user_name");
            String email=request.getParameter("user_email");
            String password=request.getParameter("user_password");
            Part part=request.getPart("image");
            String fileName=part.getSubmittedFileName();
            
            out.println(fileName);
            
            //create connection
            try{
                
                //for time delay of 3 second
                Thread.sleep(2000);
                
                //load driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                //connect
                String url="jdbc:mysql://localhost:3306/youtube";
                String uName="root";
                String pass="root";
                Connection con=DriverManager.getConnection(url,uName,pass);
                
                
                //insert
                String q="INSERT INTO user(name,email,password,profile)VALUES(?,?,?,?)";
                
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setString(1, name);
                pstmt.setString(2, email);
                pstmt.setString(3, password);
                pstmt.setString(4, fileName);
                
                
               
                
                //upload image to the folder
                InputStream is=part.getInputStream();
                byte []data=new byte[is.available()];
                is.read(data);
                
                
                String path=request.getRealPath("/")+"img"+File.separator+fileName;
                out.println(path);
                
                FileOutputStream fos=new FileOutputStream(path);
                fos.write(data);
                fos.close();
                
                 pstmt.executeUpdate();
                out.println("done");
                
            }catch(Exception e){
                e.printStackTrace();
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
