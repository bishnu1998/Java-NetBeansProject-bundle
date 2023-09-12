/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import javax.swing.JOptionPane;// JOption class 

/**
 *
 * @author bishnu
 */
public class EX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float mark; 
        //read the input from th euser
       mark = Float.parseFloat(JOptionPane.showInputDialog("enter the mark obtain in exam:"));
        
        //if condition
        if(mark >= 90)
            JOptionPane.showMessageDialog(null,"your grade is A","Excillent",JOptionPane.INFORMATION_MESSAGE);
        else if(mark >= 80 && mark<90)
            JOptionPane.showMessageDialog(null, "you grade is B","Verry good",JOptionPane.INFORMATION_MESSAGE);
        else if(mark >=70 &&mark < 80)
            JOptionPane.showMessageDialog(null, "your grade is C","good",JOptionPane.INFORMATION_MESSAGE);
        else if(mark >=60 && mark <70)
            JOptionPane.showMessageDialog(null, "your grade is D","Poor",JOptionPane.WARNING_MESSAGE);
        else 
            JOptionPane.showMessageDialog(null, "your grade is F" ,"Failed",JOptionPane.WARNING_MESSAGE);
        
        System.exit(0); // termination of program successfylly
    }
    
}
