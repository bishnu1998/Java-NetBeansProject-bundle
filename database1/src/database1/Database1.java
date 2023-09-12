

package database1;

import java.sql.*;

public class Database1 {

    public static void main(String[] args) throws SQLException {
    try{
         String host="jdbc:derby://localhost:1527/student [student1 on STUDENT1]";
        String uName="Student1";
        String password="Student1";
         Connection con=DriverManager.getConnection(host,uName,password);
         System.out.println("connection successfull");
    }catch(SQLException sqlex){
        System.out.println(sqlex.getMessage());
    }
    }
    
}
