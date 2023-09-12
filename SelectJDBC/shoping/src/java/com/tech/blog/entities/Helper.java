
package com.tech.blog.entities;

import java.io.*;

public class Helper {

    public boolean updateFile(InputStream is,String path){
        boolean f=false;
        try {
            byte data[]=new byte[is.available()];
            is.read(data);
            
            FileOutputStream fos=new FileOutputStream(path);
            fos.write(data);
            fos.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    
    //delete old file
    public boolean deleteFile(String oldPath){
        boolean f=false;
        try {
            File file=new File(oldPath);
            f=file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return f;
    }
    
}
