/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package button1;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author bishnu
 */
public class Button1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("JLabel");
        frame.setSize(300,300); // use to size the windows.
        frame.setLocation(50,50); // to locate the position of opening windows
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("Hello World");
        label.setBounds(frame.getWidth()/2,frame.getHeight()/2,1000,100);
        label.setToolTipText("this is a label"); //to display message when mouse cursor move to this position
        frame.add(label);
        
        frame.setVisible(true);
    }
    
}
