
package com.dbms.pro.dao;

import com.dbms.pro.entities.User;
import java.sql.*;
public class userDao {
    private static Connection con;

    public userDao(Connection con) {
        this.con=con;
    }
    //register user
    public boolean saveUser(User user){
        boolean f=false;
        try {
            String q="INSERT INTO user(name,email,password,address,profile)VALUES(?,?,?,?,?)";
            
            PreparedStatement pstmt=this.con.prepareStatement(q);
            pstmt.setString(1, user.getName());
            pstmt.setString(2,user.getEmail());
            pstmt.setString(3,user.getPassword());
            pstmt.setString(4,user.getAddress());
            pstmt.setString(5,user.getProfile());
            
            pstmt.executeUpdate();
            f=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    //login user
    public User loginUser(String email,String password){
        User user=null;
        try {
            String q="SELECT*FROM user WHERE email=? AND password=?";
            
            PreparedStatement pstmt=this.con.prepareStatement(q);
            pstmt.setString(1,email);
            pstmt.setString(2,password);
            
            ResultSet set=pstmt.executeQuery();
            
            if(set.next()){
                user=new User();
                
//                int id=set.getInt("id");
//                user.setId(id);
                
                user.setId(set.getInt("id"));
                user.setName(set.getString("name"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setAddress(set.getString("address"));
                user.setProfile(set.getString("profile"));
              //  user.setDateTime(set.getTimestamp("dateTime"));
                
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return user;
    }
    
    //Update user
    public boolean updateUser(User user){
        boolean f=false;
        try {
            String q="UPDATE user SET name=?,email=?,password=?,address=?,profile=? WHERE id=?";
            
            PreparedStatement pstmt=this.con.prepareStatement(q);
            pstmt.setString(1,user.getName());
            pstmt.setString(2,user.getEmail());
            pstmt.setString(3,user.getPassword());
            pstmt.setString(4,user.getAddress());
            pstmt.setString(5,user.getProfile());
            pstmt.setInt(6,user.getId());
            
            pstmt.executeUpdate();
            f=true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return f;
    }
    
    //delete user
    public boolean deleteUser(int id){
        boolean f=false;
        try {
            String q="DELETE FROM user WHERE id=?";
            
            PreparedStatement pstmt=this.con.prepareStatement(q);
            pstmt.setInt(1,id);
            
            pstmt.executeUpdate();
            f=true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return f;
    }
    
}
