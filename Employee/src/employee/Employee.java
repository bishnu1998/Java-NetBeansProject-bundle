/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author bishnu
 */
class Data{  
        String name; //employee name
        String office; //name of office
        int id; //employee id no.
        float salary; 
    
    Scanner obj1 = new Scanner(System.in);
    public void GetInfo(){
        System.out.println("Enter the name,id,salary of emplloye and office name:\n");
        name = obj1.next();
        id = obj1.nextInt();
        salary = obj1.nextFloat();
        office = obj1.next();
    }
    
    public void Display(){
        JOptionPane.showMessageDialog(null, "Employee INFO:\n" +"Name = "+name+"\n"+"ID no = "+id+"\n"+"Salary = "+salary+"\n"+"Office = "+ office);
    }
}
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Data d = new Data();
        d.GetInfo();
        d.Display();
        
        System.exit(0);
    }
    
}
