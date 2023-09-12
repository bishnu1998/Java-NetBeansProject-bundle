//Ex2.java
//class Ex2 program whith counter-controlled repetion
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import javax.swing.JOptionPane;

/**
 *
 * @author bishnu
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total, //sum of grades
            gradeCounter, //number of grades entered
            gradeValue, //grade value
            average; //acerage of all grades
        String grade; // grade type by user
        
        //intitialization phase
        total = 0; //clear total 
        gradeCounter =1; //prepate to loop
        
        //processing phase
        while( gradeCounter <= 10) // loop 10 times
        {
            //prompt for input and read grade from user
            grade = JOptionPane.showInputDialog("enter the grade");
             //convert grade from a string to an integer
             gradeValue = Integer.parseInt(grade);
             // add gradevalue to total
             total = total + gradeValue;
              //add 1 to gradecounter
              gradeCounter = gradeCounter +1;
        }
        
        //termination phase
        average = total/10;
         //display average of exam grades
         JOptionPane.showMessageDialog(null,"class average is " + average, "class average", JOptionPane.INFORMATION_MESSAGE);
         System.exit(0); //terminate the program successfully
    }
    
}
