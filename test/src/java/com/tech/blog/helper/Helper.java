
package com.tech.blog.helper;

import java.io.*;

public class Helper {
    
    public static boolean saveFile(InputStream is, String path){
        boolean f=false;
        try{
            if(f==false){
                byte data[]=new byte[is.available()];
                is.read(data);
                
                FileOutputStream fos=new FileOutputStream(path);
                fos.write(data);
                fos.close();
                f=true;
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return f;
    }

    public boolean deleteFile(String oldPath) {
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
