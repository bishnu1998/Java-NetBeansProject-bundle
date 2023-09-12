
package com.jdbc.practice;

import java.sql.*;
public class ConnectionProvider {
    
    private static Connection con;
    public static Connection getConnection(){
        
        try {
            if(con==null){
                //load driver 
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                //create connection
                String url="jdbc:mysql://localhost:3306/youtube";
                String uName="root";
                String password="root";
                con=DriverManager.getConnection(url,uName,password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
