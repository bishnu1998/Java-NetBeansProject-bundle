
package insertjdbc;

import java.sql.*;
public class InsertJDBC {

   
    public static void main(String[] args) {
        try{
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //create connection
            String url="jdbc:mysql://localhost:3306/youtube";
            String user="root";
            String password="root";
            Connection con=DriverManager.getConnection(url,user,password);
           if(con.isClosed()){
               System.out.println("connecton closed");
           }else{
             
               System.out.println("connection created....");
            //create table
            String q="CREATE TABLE table1(tId int(10) primary key auto_increment,tName varchar(50) not null, tCity varchar(50))";
            
            //create statement
            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            
            System.out.println("table is created..");
          }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
