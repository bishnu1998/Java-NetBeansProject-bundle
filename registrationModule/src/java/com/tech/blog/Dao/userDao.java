
package com.tech.blog.Dao;

import com.tech.blog.inteties.User;
import java.sql.*;
public class userDao {
    
    private static Connection con;
    public userDao(Connection con)
    {
        this.con=con;
    }
    
    public boolean saveUser(User user){
        boolean f=false;
        try{
            if(f==false){
              String  q="INSERT INTO user(name,email,password,profile) VALUES(?,?,?,?)";
                
              PreparedStatement pstmt=con.prepareStatement(q);
              pstmt.setString(1, user.getName());
              pstmt.setString(2, user.getEmail());
              pstmt.setString(3, user.getPassword());
              pstmt.setString(4, user.getProfile());
              
              pstmt.executeUpdate();
              f=true;
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return f;
    }

    public User getEmailAndPassword(String email, String password) {
        User user=null;
        try{
            String q="SELECT*FROM user WHERE email=? AND password=?";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            
            ResultSet set=pstmt.executeQuery();
            if(set.next()){
                 user=new User();
                 user.setId(set.getInt("id"));
                 user.setName(set.getString("name"));
                 user.setEmail(set.getString("email"));
                 user.setPassword(set.getString("password"));
                 user.setProfile(set.getString("profile"));
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return user;
    }

    public boolean updateUser(User user) {
        boolean f=false;
        try {
          
                String q="UPDATE user SET name=?,email=?,password=?,profile=? WHERE id=?";
                
                PreparedStatement pstmt=con.prepareStatement(q);
                
                pstmt.setString(1, user.getName());
                pstmt.setString(2, user.getEmail());
                pstmt.setString(3, user.getPassword());
                pstmt.setString(4, user.getProfile());
                pstmt.setInt(5, user.getId());
                
                pstmt.executeUpdate();
                f=true;
                
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    
}
