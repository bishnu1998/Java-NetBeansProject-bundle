/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtime2;

import javax.swing.JOptionPane;

/**
 *
 * @author bishnu
 */
public class TestTime2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Time2 obj = new Time2();
        obj.Time1();
        JOptionPane.showMessageDialog(null, "hi i am don:","output",JOptionPane.INFORMATION_MESSAGE);
        
        ClassTest obj1 = new ClassTest();
        String output;
        
         output ="Universal time is:"+obj1.toUniversalString()+"\nStandard time is:"+obj1.toString();
       
         obj1.setTime(8,27,45);
        output =output+"\n\nUniversal time is:"+obj1.toUniversalString()+"\nStandard time is:"+obj1.toString();
        
        obj1.setTime(25, 24, 89);
        output +="\n\nUniversal time is:"+obj1.toUniversalString()+"\nStandard time is:"+obj1.toString();
        
        JOptionPane.showMessageDialog(null,output,"OUTPUT",JOptionPane.INFORMATION_MESSAGE);
        
        
    }
}
