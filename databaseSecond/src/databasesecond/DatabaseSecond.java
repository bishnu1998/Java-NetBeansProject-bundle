
package databasesecond;

import java.sql.*;
public class DatabaseSecond {
    public static void main(String[] args)throws SQLException {
        try{
            String host="jdbc:derby://localhost:1527/student [student1 on STUDENT1]";
            String uName="student1";
            String pass="student1";
            Connection con=DriverManager.getConnection(host,uName,pass);
            System.out.println("connection is successfull");
        }catch(SQLException sqlex){
            System.out.println(sqlex.getMessage());
        }
    }
    
}
