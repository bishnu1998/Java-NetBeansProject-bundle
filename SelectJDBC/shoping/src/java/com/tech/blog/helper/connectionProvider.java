
package com.tech.blog.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionProvider {
    
    private static Connection con;
    
    public static Connection getConnection(){
        
        try{
            if(con==null){
                //driver class load
            Class.forName("com.mysql.jdbc.Driver");
                    
           //creat connection
                    String url="jdbc:mysql://localhost:3306/techblog";
                    String user="root";
                    String password="root";
           con=DriverManager.getConnection(url,user,password);
            
            }
        }catch(Exception e){
            e.fillInStackTrace();
        }
        return con;
    }
}
