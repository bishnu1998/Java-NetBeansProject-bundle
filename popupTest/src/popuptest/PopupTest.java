
package popuptest;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class PopupTest extends JFrame{
    private Color color[] = {Color.BLACK,Color.BLUE,Color.CYAN,Color.DARK_GRAY};
    private JRadioButtonMenuItem colorItem[];
    private ButtonGroup colorGroup;
    
    public PopupTest(){
        String colorName[] ={"Black","Blue","Cyan","Dark Gray"};
        JPopupMenu popupMenu = new JPopupMenu();
        colorItem = new JRadioButtonMenuItem[colorName.length];
        colorGroup = new ButtonGroup();
        RadioButtonHandler c1 = new RadioButtonHandler();
        for(int i=0; i<colorItem.length; i++){
            colorItem[i] = new JRadioButtonMenuItem(colorName[i]);
            popupMenu.add(colorItem[i]);
            colorGroup.add(colorItem[i]);
            colorItem[i].addActionListener(c1);
        }
        
        addMouseListener(new MouseListener() {
           public void mouseClicked(MouseEvent e){
               mouseClickEvent(e);
           } 
           public void mouseEntered(MouseEvent e){
               mouseClickEvent(e);
           }
           public void mouseExited(MouseEvent e){
               mouseClickEvent(e);
           }
           public void mousePressed(MouseEvent e){
               mouseClickEvent(e);
           }
           public void mouseReleased(MouseEvent e){
               mouseClickEvent(e);
           }
           private void mouseClickEvent(MouseEvent e){
               if(e.isPopupTrigger())
                   popupMenu.show(e.getComponent(),e.getX(),e.getY());        
           }
        });
        
        setSize(300,300);
        setVisible(true);
        
    }
   
    public static void main(String[] args) {
        PopupTest ap = new PopupTest();
        ap.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e){
              System.exit(0);
          } 
       });
    }
    
    public class RadioButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            for(int i=0; i<colorItem.length; i++){
                if(e.getSource() == colorItem[i]){
                    getContentPane().setBackground(color[i]);
                    repaint();
                    break;
                }
            }
            
        }
    }
    
}
