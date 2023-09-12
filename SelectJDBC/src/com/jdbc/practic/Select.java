

package com.jdbc.practic;

import java.sql.*;
public class Select {
    public static void main(String[] args) throws SQLException{
        Connection c=ConnectionProvider.getConnection();
        
        String q="SELECT*FROM table1";
        
        Statement stmt=c.createStatement();
        ResultSet set=stmt.executeQuery(q);
        
        while(set.next()){
            int id=set.getInt(1);
            String name=set.getString(2);
            String city=set.getString(3);
            System.out.println("\nid:"+id+"\nname:"+name+"\ncity:"+city);
        }
    }
}
