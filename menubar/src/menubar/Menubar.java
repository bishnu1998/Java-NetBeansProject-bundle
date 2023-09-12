
package menubar;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Menubar {

    
    public static void main(String[] args) {
        JFrame frame  = new JFrame("menubar");
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(200,100);
        
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        
        menubar.add(file);
        menubar.add(edit);
        
        JMenuItem New= new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        file.add(New);
        file.add(open);
        
        JMenuItem cut = new JMenuItem("cut");
        JMenuItem copy = new JMenuItem("copy");
        edit.add(cut);
        edit.add(copy);
        
      
        frame.setVisible(true);
    }
    
}
