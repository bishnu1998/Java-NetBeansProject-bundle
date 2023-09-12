
package multipleselection;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class MultipleSelection extends JFrame{
    private String choose[];
    private Container c;
    private JList copyList,colorList;
    private JButton copy;
     private String colorNames[] = {"Black","Blue","Cyan","Dark Gray","Green","light Gray", "magenta",
                                "Orange","pink","Red","White","Yellow"};
    private Color colors[] = {Color.BLACK,Color.BLUE,Color.CYAN,Color.darkGray,Color.gray,Color.green,Color.lightGray,
        Color.magenta,Color.orange,Color.pink,Color.red,Color.white,Color.yellow      
    };
    
    //constructor
    public MultipleSelection(){
        super ("multiple selection of list");
        
        setSize(400,400);
        setLocation(200,100);
        
        c = getContentPane();
        c.setLayout(new FlowLayout());
        
        colorList = new JList(colorNames);
        colorList.setVisibleRowCount(5);
       // colorList.setFixedCellWidth(100);
        colorList.setFixedCellHeight(15);
        colorList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        c.add(new JScrollPane(colorList));
        
        copy = new JButton("Copy>>>");
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                copyList.setListData(colorList.getSelectedValues()); 
            }
        });
        c.add(copy);
        
      copyList = new JList();
      copyList.setVisibleRowCount(5);
      copyList.setFixedCellWidth(100);
      copyList.setFixedCellHeight(15);
      copyList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      c.add(new JScrollPane(copyList));
      copyList.addListSelectionListener(new ListSelectionListener() {
         @Override
         public void valueChanged(ListSelectionEvent e){
             c.setBackground(colors[copyList.getSelectedIndex()]);
         } 
      });
      
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        MultipleSelection mul = new MultipleSelection();
        mul.addWindowListener(new WindowAdapter() {
            @Override
           public void windowClosed(WindowEvent e){
               System.exit(0);
           }
        });
        
    }
    
}
