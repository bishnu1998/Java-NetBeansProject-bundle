
package labeltest;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;

public class TextFieldTest extends JFrame{
    private JTextField text1,text2,text3;
    private JPasswordField password;
    
    public TextFieldTest(){
        super("Testing JTextField and JPasswordField");
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        //construct textfield with default sizing
        text1 = new JTextField(10);
        c.add(text1);
        
        //construct textField with default text
        text2 = new JTextField("enter text here");
        c.add(text2);
        
        //construct textField with default text and 
        //20 visible elemente and no event handler
            text3 = new JTextField("uneditable text field",20);
            text3.setEditable(false);
            c.add(text3);
        
         //construct textfield with default text field
         password = new JPasswordField("hidden text");
         c.add(password);
         
         TextFieldHandler handler = new TextFieldHandler();
         text1.addActionListener(handler);
         text2.addActionListener(new TextFieldHandler());
         text3.addActionListener(handler);
         password.addActionListener(handler);
         
         setSize(325,200);
         setLocation(200,200);
         setVisible(true);
        // show();
    }
    public static void main(String[] args){
        TextFieldTest app = new TextFieldTest();
        app.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
    }
    
    //inner class for event handling
    private class TextFieldHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s = "";
            
            if(e.getSource() == text1)
                s = "text11:"+e.getActionCommand();
            else if(e.getSource() == text2)
                s = "text2: "+e.getActionCommand();
            else if(e.getSource() == text3)
                s= "text3: "+e.getActionCommand();
            else if(e.getSource() == password){
                JPasswordField pwd = (JPasswordField)e.getSource();
                s = "password: "+new String(pwd.getPassword());
            }
            JOptionPane.showMessageDialog(null,s);
        }
    }
    
}