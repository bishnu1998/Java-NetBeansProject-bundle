

package database3;

import java.sql.*;

public class Database3 {

    public static void main(String[] args) {
      
        try{
            String host="jdbc:mysql://localhost:3307/db";
            String uName="root";
            String password="";
            Connection con=DriverManager.getConnection(host,uName,password);
            System.out.println("connection successfull");
            
        }catch(SQLException sqlex){
            System.out.println(sqlex.getMessage());
        }
    }
    
}
