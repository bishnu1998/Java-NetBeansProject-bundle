
package database;
import java.sql.*;

public class Database {


    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            
            try (Connection con = DriverManager.getConnection(  
                    "jdbc:oracle:thin:@localhost:1521:xe","admin","#b.p1455")) {
                Statement stmt=con.createStatement();
                
                //step4 execute query
                ResultSet rs=stmt.executeQuery("select * from emp");
                while(rs.next())
                    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            }  
  
  
        }catch(Exception e){ System.out.println(e);}  
        
    }
    
}
