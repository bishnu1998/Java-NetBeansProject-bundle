package radiobuttontest;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;

public class RadioButtonTest extends JFrame {
    
    private JTextField t;
    private JRadioButton plain, bold, italic, boldItalic;
    private Font plainFont, boldFont, italicFont, boldItalicFont;
    private ButtonGroup radioGroup;

    //constructor 
    public RadioButtonTest() {
        setSize(300, 300);
        setLocation(200, 100);

        //container 
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //texztField
        
        t = new JTextField("this is JRadioButton", 20);
        t.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        c.add(t);

        //create radiobutton
        plain = new JRadioButton("plain", true);
        c.add(plain);
        bold = new JRadioButton("bold", false);
        c.add(bold);
        italic = new JRadioButton("italic", false);
        c.add(italic);
        boldItalic = new JRadioButton("bold/italic", false);
        c.add(boldItalic);
        
        //butongroup
        radioGroup = new ButtonGroup();
        radioGroup.add(plain);
        radioGroup.add(bold);
        radioGroup.add(italic);
        radioGroup.add(boldItalic);

        //event handling for radioButton
        RadioButtonHandling handler = new RadioButtonHandling();
        plain.addItemListener(handler);
        bold.addItemListener(handler);
        italic.addItemListener(handler);
        boldItalic.addItemListener(handler);
        
        //window close
        addWindowListener(new WindowAdapter(){
            public void windowClose(WindowEvent e){
                System.exit(0);
            }
        });
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new RadioButtonTest();
    }

    //iner class 
    private class RadioButtonHandling implements ItemListener {
        
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource() == plain){
                t.setFont(new Font("TimesRomen",Font.PLAIN,14));
            }
            else if (e.getSource() == bold) {
                t.setFont(new Font("TimesRomen", Font.BOLD, 14));
            } else if (e.getSource() == italic) {
                t.setFont(new Font("TimesRomen", Font.ITALIC, 14));
            }
            else if(e.getSource() == boldItalic){
                t.setFont(new Font("TimesRome",Font.BOLD+Font.ITALIC,14));
            }
            t.repaint();
        }
        
    }
    
}
