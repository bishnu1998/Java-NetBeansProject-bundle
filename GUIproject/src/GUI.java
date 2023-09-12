
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI implements ActionListener  {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel password;
    private static JPasswordField passwordField1;
    private static JButton button1;
    private static JLabel success;
    
    
    public static void main(String[] args){
         JPanel panel = new JPanel();//invisivle frame
        JFrame frame = new JFrame();//for windows
        frame.setSize(300,300);// set size width and height
        frame.setLocation(200,200);//set location on the screen 
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
        
        //for password section
         password = new JLabel("password:");
        password.setBounds(10,80,80,25);
        panel.add(password);
        
        //to add textField to password
        passwordField1 = new JPasswordField();
        passwordField1.setBounds(100,80,165,25);
        panel.add(passwordField1);
        
        
        //FOR add button
         button1 = new JButton("LogIn");
        button1.setBounds(100,150,90,30);
        button1.addActionListener(new GUI());
        panel.add(button1);
        
        
        //to display the Login message
        success = new JLabel("");
        success.setBounds(100,180,120,25);
        panel.add(success);
              frame.setVisible(true);
         
    }
    //this code run  when the butten is press

    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of generated methods, choose Tools | Templates.
        
        String user = userText.getText();
        String password = passwordField1.getText();
        System.out.println(user+"\n"+password);
        if(user.equals("bishnu") && password.equals("pun")){
            success.setText("Login successful");
        }
        userText.setText(null);
         passwordField1.setText(null);
    }
   
    
}
