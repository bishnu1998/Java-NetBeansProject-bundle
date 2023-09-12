
package dbms;

import java.sql.*;
import java.sql.DriverManager;

public class DBms {

    public static void main(String[] args) throws Exception {
        String url= "jdbc:mysql://localhost:3307/admin";
        String username = "root";
        String password = "";
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("connection successful!!");
        }catch (SQLException e){
            System.out.println("error fonund!");
            e.printStackTrace();
        }
    }
    
}
