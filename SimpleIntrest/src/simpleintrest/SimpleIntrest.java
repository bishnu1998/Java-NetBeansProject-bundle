/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleintrest;

/**
 *
 * @author bishnu
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

class Info{
    private float p;
    private int t;
    private float r;
    private float i;
    
    //constructor
    public Info(){
        p = 0;
        t = 0;
        r = 0;
    }
    
    Scanner obj1 = new Scanner(System.in);
    
    //method
    public void set(){
        System.out.println("enter Principle,time and rate:\n");
        //JOptionPane.showMessageDialog(null,"enter Principle,time and rate:\n");
        p = obj1.nextFloat();
        t = obj1.nextInt();
        r = obj1.nextFloat();
       
    }
    public void calulate(){
        i = (p*t*r)/100;
        JOptionPane.showMessageDialog(null, "Simpale Intrest is:"+i, "Simple Intrest", JOptionPane.INFORMATION_MESSAGE);
    }
}
public class SimpleIntrest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Info t = new Info();
        t.set();
        t.calulate();
      
       System.exit(0);
        
        
    }
    
}
