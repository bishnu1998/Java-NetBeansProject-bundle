
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI {
  
        private static JLabel userLabel;
    private static JTextField userText;
    
    public static void main(String[] args){
         JPanel panel = new JPanel();//invisivle frame
        JFrame frame = new JFrame();//for windows
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        frame.add(panel);
        
        panel.setLayout(null);
        
        //for user section 
         userLabel = new JLabel("User:");// to label the position
        userLabel.setBounds(10,20,80,25); //x-axis,y-axis,width,height
        panel.add(userLabel);
            // to add textField for user
          userText = new JTextField();
        userText.setBounds(100,20,165,25);
        panel.add(userText);
    
         
    }
    //this code run  when the butten is press
   
    
}
