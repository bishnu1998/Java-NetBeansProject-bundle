
package javaapplication47;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class JavaApplication47 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("JToggleButton");
        frame.setSize(500,500);
        frame.setLocation(200,200);
        frame.setLocation(200,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JToggleButton togglebutton = new JToggleButton("OFF");
        togglebutton.setBounds(100,100,200,50);
        frame.add(togglebutton);
        
        togglebutton.addActionListener((ActionEvent e)->{
            if(togglebutton.getModel().isSelected()){
                togglebutton.setText("on");
            }else{
                togglebutton.setText("off");
            }
        });
        
        frame.setVisible(true);
        
        
    }
    
}
