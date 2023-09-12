
package com.tech.blog.helper;

import java.sql.*;
public class ConnectionProvider {
    private static Connection con;
    public static Connection getConnection(){
        try{
            if(con==null){
                //load dreiver
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                //create connection
                String url="jdbc:mysql://localhost:3306/mydb";
                String uName="root";
                String password="root";
                con=DriverManager.getConnection(url,uName,password);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
