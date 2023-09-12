
package com.tech.blog.helper;

import java.sql.*;
public class ConnectionProvider {
    private static Connection con;
    public static Connection getConnection(){
        try{
            if(con==null){
                //load driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                //connection 
                String url="jdbc:mysql://localhost:3306/youtube";
                String user="root";
                String pass="root";
                con=DriverManager.getConnection(url,user,pass);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
