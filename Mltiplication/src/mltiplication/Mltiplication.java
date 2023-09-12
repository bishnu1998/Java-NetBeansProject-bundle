/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mltiplication;

import javax.swing.JOptionPane;

/**
 *
 * @author bishnu
 */
public class Mltiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,a;
        String s="";
        a = Integer.parseInt(JOptionPane.showInputDialog("enter the value of a:"));
        
        //for loop to continue the etration
        for(i=1; i<=10; i++){
            s+= a+"x"+i+"="+a*i+"\n";
            JOptionPane.showMessageDialog(null, s);     
        }
        System.exit(0);// to terminate the program
    }
    
}
