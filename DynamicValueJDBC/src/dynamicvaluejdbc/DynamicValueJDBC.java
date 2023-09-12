
package dynamicvaluejdbc;

import java.sql.*;
import java.io.*;

public class DynamicValueJDBC {

   
    public static void main(String[] args) {
        
        try{
          
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create connection
            String url="jdbc:mysql://localhost:3306/youtube";
            String uName="root";
            String password="root";
            Connection con=DriverManager.getConnection(url,uName,password);
            if(con.isClosed()){
                System.out.println("connection closed..");
            }else{
                System.out.println("connection created...");
                //create quaries
                String q="INSERT INTO table1(tName,tCity) VALUES(?,?)";
                
                //dynami value from user
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter name:");
                String name=br.readLine();
                System.out.println("enter city:");
                String city=br.readLine();
                
                //prepareStatement
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setString(1, name);
                pstmt.setString(2, city);
                
                pstmt.executeUpdate();
                System.out.println("data updated...");
            }
            
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    
}
