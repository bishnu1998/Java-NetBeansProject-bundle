
package com.jdbc.practic;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
//        ConnectionProvider con=new ConnectionProvider();
//        Connection c=con.getConnection();
        
        
        try{
            Connection c=ConnectionProvider.getConnection();
        if(c!=null){
            //create query
            String q="INSERT INTO image(pic) VALUES(?)";
            
            //to choose file
            JFileChooser jfc=new JFileChooser();
            jfc.showOpenDialog(null);
            File file=jfc.getSelectedFile();
            
            FileInputStream fis=new FileInputStream(file);
            
            //create prepareStatement
            PreparedStatement pstmt=c.prepareStatement(q);
            pstmt.setBinaryStream(1,fis,fis.available());
            
            pstmt.executeUpdate();
           JOptionPane.showMessageDialog(null, "Image successfully loded...");
            
        }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
