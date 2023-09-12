/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

//default sclass

import java.util.Scanner;

class Student{
   String name;
   int roll;
   float per;
   
   Scanner obj=new Scanner(System.in);
   //mehtod 
   public void Get(){
       System.out.println("enter the name, roll and percent of a student");
       name= obj.next();
       roll=obj.nextInt();
       per=obj.nextFloat();    
   }
   public void display(){
       System.out.print("name="+name+"\nroll="+roll+"\npercentage="+per);
   }
}
/**
 *
 * @author bishnu
 */
public class Class3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Student s=new Student();
        s.Get();
        System.out.println("detail of student");
        s.display();
*/
       NewClass c=new NewClass();
       c.testing();
       
       NewJFrame n= new NewJFrame();
       n.setVisible(true);
       
    }
    
}
