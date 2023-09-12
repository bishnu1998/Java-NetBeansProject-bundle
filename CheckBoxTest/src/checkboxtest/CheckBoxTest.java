
package checkboxtest;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class CheckBoxTest extends JFrame{
    private JTextField t;
    private JCheckBox bold,italic;
    public CheckBoxTest(){
        super("JCheckBox text");
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        t = new JTextField("watch the font style chage",20);
        t.setFont(new Font("TimesRoman",Font.PLAIN,14));
        c.add(t);
        
        //creat check box
        bold = new JCheckBox("bold");
        c.add(bold);
        
        italic = new JCheckBox("italic");
        c.add(italic);
       
        
        //ckheckbox event handling
        
        CheckBoxHandling handler = new CheckBoxHandling();
        bold.addItemListener(handler);
        italic.addItemListener(handler);
        
        addWindowListener(new WindowAdapter(){
            public void WindowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        setSize(300,300);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new CheckBoxTest();
        
    }
    
    //iner class
    private class  CheckBoxHandling implements ItemListener{
        
private int valBold = Font.PLAIN;
private int valItalic = Font.PLAIN;
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource() == bold){
                if(e.getStateChange() == ItemEvent.SELECTED)
                    valBold = Font.BOLD;
                else 
                    valBold = Font.PLAIN;
            }
            if(e.getSource() == italic ){
                if(e.getStateChange() == ItemEvent.SELECTED)
                valItalic = Font.ITALIC;
                else
                    valItalic = Font.PLAIN;
                
            }
           
            t.setFont(new Font("TimesToman",valBold+valItalic,14));
            t.repaint();
        }
    
}
    
}
