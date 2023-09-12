
package com.tech.blog.entities;

import java.security.Timestamp;

public class Post {
   private int pid;
   private String ptitle;
   private String pcontent;
   private String pcode;
   private String ppic;
   private Timestamp pdate;
   private int cid;
   private int id;

    public Post(int pid, String ptitle, String pcontent, String pcode, String ppic, Timestamp pdate, int cid, int id) {
        this.pid = pid;
        this.ptitle = ptitle;
        this.pcontent = pcontent;
        this.pcode = pcode;
        this.ppic = ppic;
        this.pdate = pdate;
        this.cid = cid;
        this.id = id;
    }

    public Post(String ptitle, String pcontent, String pconde, String ppic, Timestamp pdate, int cid, int id) {
        this.ptitle = ptitle;
        this.pcontent = pcontent;
        this.pcode = pconde;
        this.ppic = ppic;
        this.pdate = pdate;
        this.cid = cid;
        this.id = id;
    }

    public Post(String ptitle, String pcontent, String pcode, String ppic, int cid, int id) {
        this.ptitle = ptitle;
        this.pcontent = pcontent;
        this.pcode = pcode;
        this.ppic = ppic;
        this.cid = cid;
        this.id = id;
    }
    

    public Post() {
    }

    public Post(int pid, String ptitle, String pcontent, String pcode, String ppic, int cid, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPpic() {
        return ppic;
    }

    public void setPpic(String ppic) {
        this.ppic = ppic;
    }

    public Timestamp getPdate() {
        return pdate;
    }

    public void setPdate(Timestamp pdate) {
        this.pdate = pdate;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
   
   
   
}
