package com.tech.blog.dao;

import com.tech.blog.entities.User;
import java.sql.*;

public class userDao {

    private static Connection con;

    public userDao(Connection con) {
        this.con = con;
    }

    public boolean saveUser(User user) {
        boolean f = false;

        try {
            String q = "INSERT INTO user(firstName,lastName,email,password) VALUES(?,?,?,?)";
            PreparedStatement pstmt = this.con.prepareStatement(q);
            pstmt.setString(1, user.getFirstName());
            pstmt.setString(2, user.getLastName());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getPassword());
     

            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f;
    }

    public User getUserByEmailAndPassword(String email, String password) {
        User user = null;
        try {
            String q = "SELECT*FROM user WHERE email=? AND password=?";
            PreparedStatement pstmt = this.con.prepareStatement(q);
            pstmt.setString(1, email);
            pstmt.setString(2, password);

            ResultSet set = pstmt.executeQuery();

            while (set.next()) {
                user = new User();
                //data from db
                String firstName = set.getString("firstName");
                //set to user object
                user.setFirstName(firstName);

                user.setId(set.getInt("id"));
                user.setFirstName(set.getString("firstName"));
                user.setLastName(set.getString("lastName"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setProfile(set.getString("profile"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    //update
    public boolean updateUser(User user) {
        boolean f = false;
        try {
            String q = "UPDATE user SET firstName=?,lastName=?,email=?,password=?,profile=? WHERE id=?";

            PreparedStatement pstmt = this.con.prepareStatement(q);
            pstmt.setString(1, user.getFirstName());
            pstmt.setString(2, user.getLastName());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getPassword());
            pstmt.setString(5, user.getProfile());
            pstmt.setInt(6, user.getId());

            pstmt.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

}
