
package combobox;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.WindowAdapter;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;



public class ComboBox extends JFrame{
private JLabel label;
private JComboBox images;
private String names[] = {"logo-coca-cola.png","logo-godrej.png","logo-oppo.png","logo-paypal.png"};
private Icon icons[] = {new ImageIcon(names[0]),new ImageIcon(names[1]),
                         new ImageIcon(names[2]),new ImageIcon(names[3])};

public ComboBox(){
    super("testing JComboBOx");
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    
    images = new JComboBox(names);
    images.setMaximumRowCount(3);
    c.add(images);
  
    images.addItemListener(new Box1());
    
    /*images.addItemListener(new ItemListener() {
       @Override
       public void itemStateChanged(ItemEvent e){
           label.setIcon(icons[images.getSelectedIndex()]);
       } 
    });
    */
    
   label = new JLabel(icons[0]);
   c.add(label);
   
    setSize(400,400);
    setLocation(200,100);
    setVisible(true);
}




    public static void main(String[] args) {
        new ComboBox();
       
       
    }
    //inner class
    private class Box1 implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e){
            label.setIcon(icons[images.getSelectedIndex()]);
        }
        
    }
    
}
