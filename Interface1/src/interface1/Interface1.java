/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

import java.util.Scanner;

/**
 *
 * @author bishnu
 */

interface student{
    public void getData();
    public void Display();
 
}
class Test implements student{
    String name;
    int roll;
    String collage;
    
    Scanner obj1 = new Scanner(System.in);
    public void getData(){
        System.out.println("enter name,roll and collage name!");
        name = obj1.next();
        roll = obj1.nextInt();
        collage = obj1.next();
        
    }
    public void Display(){
        System.out.println(name+" "+roll+" "+collage);
    }
    public void Dispaly2(){
     System.out.println(name+" "+roll+" "+collage);
}
}
public class Interface1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Test t1 = new Test();
       t1.getData();
       t1.Display();
       t1.Dispaly2();
    }
    
}
