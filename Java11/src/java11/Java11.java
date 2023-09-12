/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java11;

import javax.swing.JOptionPane;

/**
 *
 * @author bishnu
 */
public class Java11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              int a,b,s,d,ch;
        a = Integer.parseInt(JOptionPane.showInputDialog("enter the value of a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("enter the value of b:"));
        
        //to show menu option
        JOptionPane.showMessageDialog(null, "1 a to add \n 2 to difference\n");
        
        //to get the choice
        ch = Integer.parseInt(JOptionPane.showInputDialog("enter the choice"));
        
        //switch statement
        switch(ch){
            case 1:
                s = a+b;
                JOptionPane.showMessageDialog(null, "sum of a & b is " +s);
                break;
            case 2:
                d = a-b;
                JOptionPane.showMessageDialog(null, "the different of a & b is " +d);
        }
        
        //terminate program successfully
        System.exit(0);
        
        
    }
    
}
