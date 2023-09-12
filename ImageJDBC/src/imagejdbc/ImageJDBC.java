
package imagejdbc;

import java.sql.*;
import java.io.*;
public class ImageJDBC {

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
                
                //create quearis
                String q="INSERT INTO image(pic) VALUES(?)";
                
                //get values
                 FileInputStream fis=new FileInputStream("./img/default.png");
                //preapredStatement
                PreparedStatement pstmt=con.prepareStatement(q);
                pstmt.setBinaryStream(1,fis,fis.available());
                
                pstmt.executeUpdate();
                System.out.println("file successfully loade.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
