
package com.jdbc.practice;

import java.sql.*;
import java.io.*;
public class update {
    public static void main(String[] args){
        try {
            
            Connection c=ConnectionProvider.getConnection();
            
            //query
            String q="UPDATE table1 SET tName=?,tCity=?,tId=?";
            
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("enter Name:");
            String name=br.readLine();
            
            System.out.println("enter City:");
            String city=br.readLine();
            
            System.out.println("enter Id:");
            int id=Integer.parseInt(br.readLine());
            
            //preparStatement
            PreparedStatement pstmt=c.prepareStatement(q);
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);
            
            pstmt.executeUpdate();
            System.out.println("data successfull updated..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
