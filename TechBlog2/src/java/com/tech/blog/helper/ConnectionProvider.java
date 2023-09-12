package com.tech.blog.helper;

import java.sql.*;

public class ConnectionProvider {

    private static Connection con;

    public static Connection getConnection() {

        try {
            if (con == null) {
                //load driver
                Class.forName("com.mysql.jdbc.Driver");

                //create connection
                String url = "jdbc:mysql://localhost:3306/techblog";
                String user = "root";
                String password = "root";
                con = DriverManager.getConnection(url, user, password);
                if(con!=null){
                    System.out.println("connection successfull!!");
                }else{
                    System.out.println("connection unsuccessfull!!");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
