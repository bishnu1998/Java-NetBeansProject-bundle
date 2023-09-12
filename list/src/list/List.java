
package list;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class List extends JFrame{
    private JList colorList;
    private Container c;
    private String colorNames[] = {"Black","Blue","Cyan","Dark Gray","Green","light Gray", "magenta",
                                "Orange","pink","Red","White","Yellow"};
    private Color colors[] = {Color.BLACK,Color.BLUE,Color.CYAN,Color.darkGray,Color.gray,Color.green,Color.lightGray,
        Color.magenta,Color.orange,Color.pink,Color.red,Color.white,Color.yellow      
    };
    
    public List(){
        super ("JList ");
        c = getContentPane();
        c.setLayout(new FlowLayout());
        
        colorList = new JList(colorNames);
        colorList.setVisibleRowCount(5);
        c.add(new JScrollPane(colorList));
        
        //do not allow multiple selections
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        colorList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e){
                c.setBackground(colors[colorList.getSelectedIndex()]);
            }
        });
        
        addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosed(WindowEvent e){
               System.exit(0);
           } 
        });
        setSize(400,400);
        setLocation(200,100);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new List();
        
    }
   
    
}
