
package loginform;

import javax.swing.JOptionPane;

class example{
    int count1 = 0; // nurmal type of variable
    static int count2 = 0; // static type of variable
    void calculate(){ // increase the variable every call 
        count1 ++;
        count2 ++;
        
    }
    void display(){ //display
        System.out.println( "count1="+count1+"\t"+"count2 ="+count2);
    }
}

public class Loginform {
    public static void main(String[] args) {
        example e1;
        e1 = new example();
        e1.calculate();
             e1.display();
             
        e1.calculate();
       e1.display();
       
        e1.calculate();
        
   
         
        e1.display();
        
    }
    
}
