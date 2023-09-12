
package javaapplication87;

import java.sql.*;

public class JavaApplication87 {

    
    public static void main(String[] args) {
       String url = "jdbc:mysql://localhost:3307/admin";
       String username = "root";
       String password = "";
       
       try{
           Connection con = DriverManager.getConnection(url,username,password);
           System.out.println("Connection sucessful!@");
       }catch(SQLException sqlex){
           System.out.println("connection error! ");
           sqlex.printStackTrace();
       }
    }
    
}
