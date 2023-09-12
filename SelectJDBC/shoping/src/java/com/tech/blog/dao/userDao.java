package com.tech.blog.dao;

import com.mysql.cj.protocol.Resultset;
import com.tech.blog.entities.user;
import java.sql.*;
public class userDao {
    private static Connection con;

    public userDao(Connection con) {
        this.con = con;
    }
    
    //to insert user to database
    public boolean saveUser(user user){
        
        boolean f=false;
        try{
            
            //user--->databases
            
            String query="INSERT INTO user(name,password,email,gender,about) VALUES(?,?,?,?,?)";
            PreparedStatement pstmt=this.con.prepareStatement(query);
            pstmt.setString(1,user.getName());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getGender());
            pstmt.setString(5,user.getAbout());
            
            
            pstmt.executeUpdate();
            f=true;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return f;
        
    }
    
    //get user by their email and password
    public user getUserByEmailAndPassword(String email,String password){
        user user=null;
        try{
            
            String query="SELECT*FROM user WHERE email=? AND password=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            
            ResultSet set=pstmt.executeQuery();
            
            if(set.next()){
                user=new user();
                //data from db
                String name=set.getString("name");
                //set to user object
                user.setName(name);
                
                user.setId(set.getInt("id"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setGender(set.getString("gender"));
                user.setAbout(set.getString("about"));
                user.setDateTime(set.getTimestamp("rdate"));
                user.setProfile(set.getString("profile"));
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }

    
    public boolean updateUser(user user){
        boolean f=false;
        try {
            String q="UPDATE user SET name=?,password=?,email=?, gender=?,profile=? WHERE id=?";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getGender());
            pstmt.setString(5, user.getProfile());
            pstmt.setInt(6, user.getId());
            
            pstmt.executeUpdate();
            f=true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
}
