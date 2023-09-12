
package table;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table {

  
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable");

        ///frame.setLayout(null);
        frame.setLocation(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String data[][] = {
            {"ram","12","ktm"},
                {"shyam","19","dailekh"},
                {"bishnu","21","dang"}
        };
        String column[] = {"Name","Age","District"};
        
        JTable table = new JTable(data,column);
        table.setBounds(30,40,200,300);
        //frame.add(table);
        
       JScrollPane scrollpane = new JScrollPane(table);
        frame.add(scrollpane);
       
               frame.setSize(500,500);
        frame.setVisible(true);
        
    }
    
}
