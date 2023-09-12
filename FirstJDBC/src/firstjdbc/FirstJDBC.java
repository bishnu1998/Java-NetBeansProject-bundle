
package firstjdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class FirstJDBC {

 
    public static void main(String[] args) {
        try{
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create connection 
            String url="jdbc:mysql://localhost:3306/youtube";
            String user="root";
            String password="root";
            Connection con=DriverManager.getConnection(url, user, password);
            
            if(con.isClosed()){
                System.out.println("connection is closed!");
            }else{
                System.out.println("connsection created...");
            }
            
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    
}
}
