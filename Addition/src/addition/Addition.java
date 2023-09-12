/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addition;

/**
 *
 * @author bishnu
 */
import javax.swing.JOptionPane; //import calss JOptinonPane
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstNumber, //first string inter by user
        secondNumber; //second number enter by user
        int num1, //first num to add
                num2, //second num to add
                sum;  //sum of num1 and num2
        //reading firsNum from user as string
        firstNumber = JOptionPane.showInputDialog("enter first num.");
        
        //read secondNum from user as string
        secondNumber = JOptionPane.showInputDialog("enter second num.");
        
        //convert number from type string to integer.
        num1 = Integer.parseInt(firstNumber);
        num2 = Integer.parseInt(secondNumber);
        
        //add the number
        sum = num1 + num2;
        
        //display the result
        JOptionPane.showMessageDialog(null, "the sum is " +sum, "Results", JOptionPane.PLAIN_MESSAGE );
        
        System.exit(0); // terminate the program successfully
    }
    
}
