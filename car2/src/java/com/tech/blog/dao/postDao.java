package com.tech.blog.dao;

import com.tech.blog.entities.Category;
import com.tech.blog.entities.Post;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class postDao {

    Connection con;

    public postDao(Connection con) {
        this.con = con;
    }

    public ArrayList<Category> getAllCategory() {

        ArrayList<Category> list = new ArrayList<>();

        try {

            String q = "SELECT * FROM category";

            Statement st = con.createStatement();
            ResultSet set = st.executeQuery(q);

            while (set.next()) {

                int cid = set.getInt("cid");
                String name = set.getString("name");
                String description = set.getString("description");

                Category c = new Category(cid, name, description);
                list.add(c);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public boolean savePost(Post p) {
        boolean f = false;
        try {
            String q = "INSERT INTO  post(ptitle,pcontent,pcode,ppic,cid,id)VALUES(?,?,?,?,?,?)";

            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, p.getPtitle());
            pstmt.setString(2, p.getPcontent());
            pstmt.setString(3, p.getPcode());
            pstmt.setString(4, p.getPpic());
            pstmt.setInt(5, p.getCid());
            pstmt.setInt(6, p.getId());

            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f;
    }

    //get all the post
    public List<Post> getAllPosts() {

        List<Post> list = new ArrayList<>();
        //fetch all the list of post
        try {

            String q = "SELECT*FROM post ORDER BY pid";
            PreparedStatement pstmt = con.prepareStatement(q);

            ResultSet set = pstmt.executeQuery();

            while (set.next()) {
                int pid = set.getInt("pid");
                String ptitle = set.getString("ptitle");
                String pcontent = set.getString("pcontent");
                String pcode = set.getString("pcode");
                String ppic = set.getString("ppic");
               // Timestamp pdate = set.getTimestamp("pdate");
                int cid = set.getInt("cid");
                int id = set.getInt("id");

                Post pPost = new Post(pid, ptitle, pcontent, pcode, ppic, cid, id);

                list.add(pPost);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public List<Post> getAllPostByCid(int cid) {
        List<Post> list = new ArrayList<>();
        //fetch all list using cid
        try {

            String q = "SELECT*FROM post WHERE cid=?";
            PreparedStatement pstmt = con.prepareStatement(q);

            ResultSet set = pstmt.executeQuery();
            pstmt.setInt(1, cid);
            
            while (set.next()) {
                int pid = set.getInt("pid");
                String ptitle = set.getString("ptitle");
                String pcontent = set.getString("pcontent");
                String pcode = set.getString("pcode");
                String ppic = set.getString("ppic");
                Timestamp pdate = set.getTimestamp("pdate");
                int id = set.getInt("id");

                Post pPost = new Post(pid, ptitle, pcontent, pcode, ppic, cid, id);

                list.add(pPost);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;

    }

}
