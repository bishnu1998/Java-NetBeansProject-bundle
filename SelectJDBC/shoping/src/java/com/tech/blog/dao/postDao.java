
package com.tech.blog.dao;

import com.tech.blog.entities.category;
import com.tech.blog.entities.post;
import java.sql.*;
import java.util.ArrayList;
public class postDao {
    private static Connection con;
    
    public postDao(Connection con){
        this.con=con;
    }
    
    public ArrayList<category> getAllCategory(){
        ArrayList<category> list=new ArrayList();
        try {
            String q="SELECT*FROM category";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            ResultSet set=pstmt.executeQuery();
            while(set.next()){
               int cId=set.getInt("cId");
               String name=set.getString("name");
               String description=set.getString("description");
               
               category ca=new category(cId,name,description);
               list.add(ca);
            }
        } catch (Exception e) {
            e.printStackTrace();
                    
        }
        
        return list;
    }
    
    //fetch post
    public ArrayList<post> getAllPost(){
        ArrayList<post> list=new ArrayList();
        try {
            String q="SELECT*FROM post";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            ResultSet set=pstmt.executeQuery();
            while(set.next()){
                int pId=set.getInt("pId");
                String pTitle=set.getString("pTitle");
                String pContent=set.getString("pContent");
                String pCode=set.getString("pCode");
                String pPic=set.getString("pPic");
                
                post p=new post(pTitle,pContent,pCode,pPic);
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
                    
        }
        
        return list;
    }
    
    public boolean savePost(post p){
        boolean f=false;
        try {
            String q="INSERT INTO post(pTitle,pContent,pCode,pPic,cId) VALUES(?,?,?,?,?)";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1, p.getpTitle());
            pstmt.setString(2, p.getpContent());
            pstmt.setString(3, p.getpCode());
            pstmt.setString(4, p.getpPic());
            pstmt.setInt(5, p.getcId());
            
            pstmt.executeUpdate();
            f=true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
