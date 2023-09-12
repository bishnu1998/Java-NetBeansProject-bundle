
package database34;

import java.sql.*;

public class Database34 {

    public static void main(String[] args) {
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           String host="jdbc.mydql://localhost:3306/admin";
        String uName="root";
        String password="root";
         Connection con=DriverManager.getConnection(host,uName,password);
         System.out.print("connection successfull !!!");
          Statement stmt=con.createStatement();
          ResultSet rs=stmt.executeQuery("select*from user");
          while(rs.next()){
              System.out.println(rs.getInt(1)+" "+rs.getString(2));
             
          }
          con.close();
       }catch(Exception e){
           System.out.println(e);
       }
    }
    
}
