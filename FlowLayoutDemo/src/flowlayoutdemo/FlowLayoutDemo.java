
package flowlayoutdemo;
import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class FlowLayoutDemo extends JFrame{
    private JButton right,left,center;
    private Container c;
    private FlowLayout layout;
    
    public FlowLayoutDemo(){
        
        super("FlowLayout demo");
        layout = new FlowLayout();
        
        c = getContentPane();
        c.setLayout(layout);
        
        left = new JButton("<<Left");
        left.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e){
               layout.setAlignment(FlowLayout.LEFT);
               //re-align attached components
               layout.layoutContainer(c);
           }
        });
        c.add(left);
        
        center = new JButton("<<Center>>");
        center.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e){
               layout.setAlignment(FlowLayout.CENTER);
               layout.layoutContainer(c);
           }
        });
        c.add(center);
        
        right = new JButton("Right>>");
        right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                layout.setAlignment(FlowLayout.RIGHT);
                layout.layoutContainer(c);
            }
        });
        c.add(right);
        
        setSize(400,400);
        setLocation(200,100);
        setVisible(true);
        
    }

    public static void main(String[] args) {
       FlowLayoutDemo dem= new FlowLayoutDemo();
       dem.addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e){
               System.exit(0);
           }
       }); 
        
    }
    
}
