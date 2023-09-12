/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add1;

import javax.swing.JOptionPane;

/**
 *
 * @author bishnu
 */
public class Add1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,s,k;
        float p;
        n = Integer.parseInt(JOptionPane.showInputDialog("enter the digit:"));
        
        while(n!=0){
            p = n%10;
            s+=p;
        
        }
        JOptionPane.showMessageDialog(null, "sum of n is "+ s);
    }
    
}
