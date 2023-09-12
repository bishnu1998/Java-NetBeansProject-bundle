package com.dbms.pro.helper;

import java.sql.*;

public class ConnectionProvider {

    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null) {
                //drive loader
                Class.forName("com.mysql.jdbc.Driver");
                
                //create connection
                String url="jdbc:mysql://localhost:3306/project1";
                String user="root";
                String password="root";
                con=DriverManager.getConnection(url,user,password);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
