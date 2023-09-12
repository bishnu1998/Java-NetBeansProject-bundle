

package preparedstatementjdbc;

import java.sql.*;
public class PreparedStatementJDBC {

 
    public static void main(String[] args) {
        // TODO code application logic here
       try{
           //load driver
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           //create connection 
           String url="jdbc:mysql://localhost:3306/youtube";
           String uName="root";
           String password="root";
           Connection con=DriverManager.getConnection(url,uName,password);
           
           //create quaries
           String q="INSERT INTO table1(tName,tCity) VALUES(?,?)";
           //PreparedStatement
           PreparedStatement pstmt=con.prepareStatement(q);
           pstmt.setString(1, "ram");
           pstmt.setString(2, "ktm");
           
           pstmt.executeUpdate();
           System.out.println("data updated..");
           
           //close connection
           con.close();
           
       }catch(Exception e){
           e.printStackTrace();
       }
        
    }
    
}
