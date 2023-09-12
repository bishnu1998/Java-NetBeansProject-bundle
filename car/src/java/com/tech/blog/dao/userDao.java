
package com.tech.blog.dao;

import com.tech.blog.entities.User;
import java.sql.*;
public class userDao {
    private static Connection con;
    
    //constructor
    public userDao(Connection con){
        this.con=con;
    }
    
    //function
    public boolean saveUser(User user){
        boolean f=false;
        try{
            //insertion
            String q="INSERT INTO user(firstName,lastName,email,password,address,city,state) VALUES(?,?,?,?,?,?,?)";
        
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1, user.getFirstName());
            pstmt.setString(2, user.getLastName());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getPassword());
            pstmt.setString(5, user.getAddress());
            pstmt.setString(6, user.getCity());
            pstmt.setString(7, user.getState());
           
           

            
            pstmt.executeUpdate();
            f=true;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public User getUserByEmailAndPassword(String email, String password) {
    
        User user=null;
        try{
          String q="SELECT*FROM user WHERE email=? AND password=?";
          
          PreparedStatement pstmt=con.prepareStatement(q);
          pstmt.setString(1, email);
          pstmt.setString(2,password);
          
          ResultSet set=pstmt.executeQuery();
          
          if(set.next()){
               user=new User();
               
               user.setId(set.getInt("id"));
               user.setFirstName(set.getString("firstName"));
               user.setLastName(set.getString("lastName"));
               user.setEmail(set.getString("email"));
               user.setPassword(set.getString("password"));
               user.setAddress(set.getString("address"));
               user.setCity(set.getString("city"));
               user.setState(set.getString("state"));
               user.setRdate(set.getTimestamp("rdate"));
               
          }
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
