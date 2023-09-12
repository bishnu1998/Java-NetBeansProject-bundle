/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi1;

import java.util.Scanner;
import java.lang.Math;
import javax.swing.JOptionPane;

/**
 *
 * @author bishnu
 */
 class Info{
    private float w; //in kg
    private float h; //in meter
 float cal; //calulation
    
    Scanner obj1 = new Scanner(System.in);
    public void set(){
        System.out.println("enter wight and height:");
        w = obj1.nextFloat();
        h = obj1.nextFloat();
    }
    public float calulation(){
        cal = w/(h*h);
        return cal;
    }
    
}
public class BMI1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Info t = new Info();
        float ans;
        
        t.set();
        ans = t.calulation();
        
        
        //conditional statement
                if (ans<15)
            JOptionPane.showMessageDialog(null, "your BMI is " +ans+" very severely underweight");
        else if(ans>=15 && ans<16)
            JOptionPane.showMessageDialog(null, "your BMI is " +ans+ " very severly underwight");
        else if(ans>=16 && ans<18.5)
            JOptionPane.showMessageDialog(null, "your DMB is " +ans+ "severely underweight");
        else if(ans>=18.5 && ans<25)
            JOptionPane.showMessageDialog(null, "your DBM is " +ans+ " underwight");
        else if(ans>=25 && ans<30)
            JOptionPane.showMessageDialog(null, "your DBM is " +ans+ "normal (healthy weight");
        else if(ans>=30 && ans<35)
            JOptionPane.showMessageDialog(null, "your DBM is " +ans+ "overweight");
        else if(ans>=35 && ans<40)
            JOptionPane.showMessageDialog(null, "your DBM is " +ans+ "moderately obese");
        else
                JOptionPane.showMessageDialog(null, "your DBM is" +ans+ "very severely obese");
                
        System.exit(0); //terminate program sucessfully
    }
    
}
