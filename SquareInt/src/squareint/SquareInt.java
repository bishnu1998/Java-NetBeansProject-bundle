/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squareint;

import java.awt.Container;
import javax.swing.*;
/**
 *
 * @author bishnu
 */
class name{
        public void init(){
        String output ="";
        
        JTextArea outputArea = new JTextArea(10,20);
        
        //get the applet's GHI component display are
        Container c = getContentPane();
        
        //attach outPutArea to container c
        c.add(outputArea);
        
        int result;
        for(int x=1; x<=10; x++){
            result = Square(x);
            output= output + "the Square of"+ x +"is"+result+"\n";
        }
        outputArea.setText(output);
       
    }
     public int Square(int y){
            return y*y;
        }
     
     private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
public class SquareInt {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        name na = new name();
        na.init();
       
    }

    
    
}
