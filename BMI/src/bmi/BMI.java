/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import javax.swing.JOptionPane; //importing JOptionPane class

/**
 *
 * @author bishnu
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float h, //height
                w, //weight
                cal; //calulation
        
        //read height of the user in meater
        h = Float.parseFloat(JOptionPane.showInputDialog("enter the height"));
        
        //read weight of the user in kg
        w = Float.parseFloat(JOptionPane.showInputDialog("enter the weight"));
        
        //calulation of BMI
        cal = w/(h*h);
        
        //applying the condition to find the medical report
        
        if (cal<15)
            JOptionPane.showMessageDialog(null, "your BMI is " +cal+" very severely underweight");
        else if(cal>=15 && cal<16)
            JOptionPane.showMessageDialog(null, "your BMI is " +cal+ " very severly underwight");
        else if(cal>=16 && cal<18.5)
            JOptionPane.showMessageDialog(null, "your DMB is " +cal+ "severely underweight");
        else if(cal>=18.5 && cal<25)
            JOptionPane.showMessageDialog(null, "your DBM is " +cal+ " underwight");
        else if(cal>=25 && cal<30)
            JOptionPane.showMessageDialog(null, "your DBM is " +cal+ "normal (healthy weight");
        else if(cal>=30 && cal<35)
            JOptionPane.showMessageDialog(null, "your DBM is " +cal+ "overweight");
        else if(cal>=35 && cal<40)
            JOptionPane.showMessageDialog(null, "your DBM is " +cal+ "moderately obese");
        else
                JOptionPane.showMessageDialog(null, "your DBM is" +cal+ "very severely obese");
                
        System.exit(0); //terminate program sucessfully
    }
    
    
}
