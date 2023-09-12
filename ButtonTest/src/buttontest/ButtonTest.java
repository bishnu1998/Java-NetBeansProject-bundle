
package buttontest;
import javax.swing.JButton;
import java.awt.Container;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class ButtonTest extends JFrame{
    private JButton plainButton,fancyButton;
    
    public ButtonTest(){
       super("testing Buttons");
        
       Container c = getContentPane();
       c.setLayout(new FlowLayout());
       
       //creating buttons
       plainButton = new JButton("plainButton");
       c.add(plainButton);
       
       Icon buy1 = new ImageIcon("buy-1.jpg");
       Icon buy2 = new ImageIcon("buy-2.jpg");
       
       fancyButton = new JButton("fancyButton",buy1);
       fancyButton.setRolloverIcon(buy2);
       c.add(fancyButton);
       
       //creat e3vent handling
       ButtonHandler handler = new ButtonHandler();
       plainButton.addActionListener(handler);
       fancyButton.addActionListener(handler);
       

       setSize(300,300);
       setVisible(true);
    }
    
    
    public static void main(String[] args){
        ButtonTest app = new ButtonTest();
        app.addWindowListener(new WindowAdapter(){
            public void widowClosing(WindowEvent e){
                System.exit(0);
            }
        
    });
    }
    //inner class
    private class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"this is:"+e.getActionCommand());
        }
        
    }
}