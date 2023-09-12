/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetest2;

import javax.swing.JOptionPane;

/**
 *
 * @author bishnu
 */
public class TimeTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "this is me bishnu!", "output", JOptionPane.INFORMATION_MESSAGE);
        
        Time4 obj1 = new Time4();
        
        //declaration of object
        Time4 t1,t2,t3,t4;
        t1 = new Time4(2);
        t2 = new Time4(21,34);
        t3 = new Time4(12,25,42);
        t4 = new Time4(t3); //uset t3 as initial value
        
        String output;
        
        output = "constructed with:\n"+obj1.toUniveralString()+"\n"+obj1.toString();
        output  = output +"\n\nhour spacified:\n"+t1.toUniveralString()+"\n"+t1.toString();
        output  = output +"\n\nhour and minute specified:\n"+t2.toUniveralString()+"\n"+t2.toString();
         output  = output +"\n\nhour, minute and second specified:\n"+t3.toUniveralString()+"\n"+t3.toString();
          output  = output +"\n\nobject specified:\n"+t4.toUniveralString()+"\n"+t4.toString();
          
          JOptionPane.showMessageDialog(null, output,"TIME",JOptionPane.INFORMATION_MESSAGE);
          
          System.exit(0);
                
    }
    
}
