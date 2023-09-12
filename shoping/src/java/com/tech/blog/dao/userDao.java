
package com.tech.blog.dao;

import com.tech.blog.entities.User;
import java.sql.*;

public class userDao {
    
    private static Connection con;

    public userDao(Connection con) {
        this.con = con;
    }
    
     //get user by their email and password
    public User getUserByEmailAndPassword(String email,String password){
        User user=null;
        try{
            
            String query="SELECT*FROM user WHERE email=? AND password=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            
            ResultSet set=pstmt.executeQuery();
            
            if(set.next()){
                user=new User();
                //data from db
                String name=set.getString("name");
                //set to user object
                user.setName(name);
                
                user.setId(set.getInt("id"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                   user.setDateTime(set.getTimestamp("rdate"));
                user.setProfile(set.getString("profile"));
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
