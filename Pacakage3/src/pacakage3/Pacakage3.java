/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacakage3;

import javax.swing.JOptionPane;
import example.Example;

/**
 *
 * @author bishnu
 */
public class Pacakage3 {

    /**
     * @param args the command line arguments
     */
    public void init(){
        JOptionPane.showMessageDialog(null, "hi i am don!");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass n = new NewClass();
        n.P();
        Example a1,a2;
        a1 = new Example();
        a2 = new Example();
        a1.hello();
    }
    
}
