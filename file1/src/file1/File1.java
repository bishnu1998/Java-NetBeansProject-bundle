
package file1;

import static java.awt.PageAttributes.MediaType.D;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;


public class File1 {

    public static void main(String[] args) {
        //int data = 10;
        //String s = "I am don!";
        char []s = new char[20];
        int i;
        //String s;
        try{
            FileReader p3 = new FileReader("D:\\\\bishnu\\\\my");
            p3.read(s);
            System.out.println(s);
    
            //FileWriter p2 = new FileWriter("D:\\bishnu\\my");
            //p2.write(s);
            //FileOutputStream p = new FileOutputStream("D:\\bishnu\\my");
           // FileInputStream p1 = new FileInputStream("D:\\\\bishnu\\\\my");
            //p.write(data);
            //data = p1.read();
            p3.close();
            System.out.println("successfull writen!");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
