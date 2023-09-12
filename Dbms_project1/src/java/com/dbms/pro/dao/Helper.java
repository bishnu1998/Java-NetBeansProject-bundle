package com.dbms.pro.dao;

import java.io.*;

public class Helper {

//    to save user Image
    public boolean saveImage(InputStream is, String path) {
        boolean f = false;
        try {
            byte data[] = new byte[is.available()];
            is.read(data);

            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

//    to deleter user image
    public boolean deleteImage(String oldPath) {
        boolean f = false;
        try {
            File file = new File(oldPath);
            f = file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

}
