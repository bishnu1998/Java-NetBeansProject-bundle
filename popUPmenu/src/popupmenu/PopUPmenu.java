
package popupmenu;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import java.awt.BorderLayout;
import javax.swing.JMenuItem;
import javax.swing.JButton;



public class PopUPmenu {

  
    public static void main(String[] args) {
        JFrame frame = new JFrame("popupmenu");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocation(200,100);
        
        JPopupMenu popupmenu = new JPopupMenu();
        popupmenu.addSeparator();
        
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        
        popupmenu.add(cut);
        popupmenu.add(copy);
        
        JButton btn = new JButton("right click on me");
        frame.add(btn,BorderLayout.NORTH);
        
        btn.setComponentPopupMenu(popupmenu);
        
        
        frame.setVisible(true);
    }
    
}
