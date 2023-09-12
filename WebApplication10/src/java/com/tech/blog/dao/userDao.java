
package com.tech.blog.dao;

import com.tech.blog.entities.User;
import java.sql.*;
public class userDao {
    
    private static Connection con;
    
    public boolean SaveUse(User user){
        boolean f=false;
        try{
            
            //create query
            String q="INSERT INTO user(firstName,lastName,email,password,address,city)VALUES(?,?,?,?,?,?)";
            //PREPARESTATEMENT
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1, user.getFirstName());
            pstmt.setString(2, user.getLastName());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4,user.getPassword());
            pstmt.setString(5,user.getAddress());
            pstmt.setString(6, user.getCity());
            
            pstmt.executeUpdate();
            f=true;
            System.out.println("successfully inserted..");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
}
