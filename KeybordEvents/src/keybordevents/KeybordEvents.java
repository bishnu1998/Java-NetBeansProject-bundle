

package keybordevents;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeybordEvents extends JFrame implements KeyListener {
private JLabel label1;
private JTextArea area;

public KeybordEvents(){
    label1 =new JLabel();
    area = new JTextArea();
    
    label1.setBounds(10,10,150,40);
    area.setBounds(20,20,150,40);
    area.addKeyListener(this);
    add(label1);
    add(area);
    
    setSize(400,400);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    });
    setVisible(true);
    
}
 
    public static void main(String[] args) {
        new KeybordEvents();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label1.setText("key Type");
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        label1.setText("key pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label1.setText("key Released");
    }
    
}
