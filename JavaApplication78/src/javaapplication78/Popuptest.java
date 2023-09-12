
package javaapplication78;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Popuptest extends JFrame{
    private JRadioButtonMenuItem items[];
    private Color colorValues[] = {Color.blue,Color.yellow,Color.red};
    
    public Popuptest(){
        
        super("using JPopupMenus");
        
        final JPopupMenu popupMenu = new JPopupMenu();
        ItemHandler handler = new ItemHandler();
        
        String colors[] = {"Blue","Yellow","Red"};
        ButtonGroup colorGroup = new ButtonGroup();
        items = new JRadioButtonMenuItem[3];
        
        //construct each menu item and add to popup menu; also
        //enable event handling for each menu item
        for(int i=0; i<items.length; i++){
            items[i] = new JRadioButtonMenuItem(colors[i]);
            popupMenu.add(items[i]);
            colorGroup.add(items[i]);
            items[i].addActionListener(handler);
        }
        
        getContentPane().setBackground(Color.WHITE);
        
        //define a mouseListener for the window that displays
        //a JPopupMenu when the popup trigger event occurs
        addMouseListener( new MouseListener() {
               @Override
            public void mouseClicked(MouseEvent e) {
                checkForTriggerEvent(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                checkForTriggerEvent(e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
               checkForTriggerEvent(e);
            }
           public void mousePressed(MouseEvent e){
               checkForTriggerEvent(e);
           }
           public void mouseReleased(MouseEvent e){
               checkForTriggerEvent(e);
           }
           private void checkForTriggerEvent(MouseEvent e){
               if(e.isPopupTrigger())
                   popupMenu.show(e.getComponent(),e.getX(),e.getY());
           }

        });
        
        setSize(300,300);
        show();
    }
            

  
    public static void main(String[] args) {
        Popuptest app = new Popuptest();
        app.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    //inner class
    private class ItemHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            //determin which menu item was selectd 
            for (int i=0; i<items.length; i++)
                if(e.getSource() == items[i]){
                    getContentPane().setBackground(colorValues[i]);
                    repaint();
                   // return;
                }
        }
    }
    
}
