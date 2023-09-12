

package example12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example12 extends JFrame{
private JButton btn;
private int a,b;
Example12(){
    super("button");
    Container c=getContentPane();
    c.setLayout(new FlowLayout());
    
    btn =new JButton("click");
    c.add(btn);
    
/*btn.addActionListener(new ActionListener(){  
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("hello");
        }
    });  */
    
    btnHandler handler=new btnHandler();
    btn.addActionListener(handler);
   
   setSize(400,400);
   setVisible(true);
}

    public static void main(String[] args) {
        Example12 e1=new Example12();
        e1.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    } 
    
    private class btnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "hello bishnu");
        }
    }
}
