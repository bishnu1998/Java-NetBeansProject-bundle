
package menubar2;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Menubar2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
      
        menubar.add(file);
        menubar.add(edit);
          
        JMenuItem new1 = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        
        file.add(new1);
        file.add(open);
        
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem cut = new JMenuItem("cut");
        
        edit.add(cut);
        edit.add(copy);
        
        
        frame.setVisible(true);
        
     
    }
    
}
