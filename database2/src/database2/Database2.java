
package database2;
import java.sql.*;

public class Database2 {

    public static void main(String[] args) {
        // TODO code application logic here
       try{
            String host="jdbc:derby://localhost:3306/Employee [user1 on USER1]";
        String uName="user1";
        String password="user1";
        Connection con=DriverManager.getConnection(host,uName,password);
        System.out.println("conmection successfull");
        
        
        Statement stmt= con.createStatement();
        String SQL="SELECT*FROM user1.workers";
        ResultSet rs=stmt.executeQuery(SQL);
        while(rs.next()){
           int id_col =rs.getInt("ID");
           String first_name=rs.getString("first_name");
           
           System.out.println(id_col+" "+first_name);
       }
        
        
       }catch(SQLException err){
           System.out.println(err.getMessage());
       }
    }
    
}
