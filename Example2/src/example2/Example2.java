/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;

import java.util.Scanner;

/**
 *
 * @author bishnu
 */
class init{
    int speed = 0;// will get memory each time when object is called
    static int speed1 = 0;// will get memory once only;
    
    //constructor without argument
   init(){
         speed++;
        speed1++;
      
    }
    public void display(){
        System.out.println("speed:"+speed+" "+"speed1:"+speed1);
    }
}

public class Example2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        init a1,a2,a3; //object decleration
        
        a1 = new init(); // a =b+c; a = a+b; a + = b;
         a1.display();
         
        a2 = new init();
        a2.display();
        
        a3 = new init();
         a3.display();

    }
    
}
