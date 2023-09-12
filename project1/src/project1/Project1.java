
package project1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Project1 implements ActionListener{

    private static JButton button;
    public static void main(String[] args) {
        //frame
      JFrame frame = new JFrame("Login");
      frame.setSize(400,400);
      frame.setLocation(frame.getWidth(),frame.getHeight()/2);
      frame.setLayout(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //first panel
      JPanel panel1 = new JPanel();
      panel1.setBounds(0,0,frame.getWidth(),50);
      panel1.setBackground(new Color(205,92,92,80));
      frame.add(panel1);
      
      
        //font 
      Font font = new Font("",Font.BOLD,30);
     
      
      //label for first panel 
      JLabel label1 = new JLabel("Login");
      label1.setBounds(275,10,100,25);
      label1.setFont(font);
       panel1.add(label1);
      
       
       //second panel
       JPanel panel2 = new JPanel();
       panel2.setBounds(0,50,400,350);
       panel2.setBackground(new Color(230,126,34));
       panel2.setLayout(null);
       frame.add(panel2);
       
       //textfield username
       JLabel user = new JLabel("UserName:");
       user.setBounds(50,60,100,25);
       panel2.add(user);
       JTextField username = new JTextField();
       username.setBounds(150,60,150,25);
       panel2.add(username);
      
       //passwordfield
       JLabel pass = new JLabel("Password:");
       pass.setBounds(50,120,100,25);
       panel2.add(pass);
       JPasswordField password = new JPasswordField();
       password.setBounds(150,120,150,25);
       panel2.add(password);
       
       //login button
        button = new JButton("LogIn");
       button.setBounds(100,200,100,30);
       button.addActionListener(new Project1());
       panel2.add(button);
       
       //cancel button
       JButton cancelbtn = new JButton("Cancel");
       cancelbtn.setBounds(250,200,100,30);
       panel2.add(cancelbtn);
    
      frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(button.isSelected()){
            System.out.println("this is me!");
        }else{
            System.out.println("unsuccessful!");
        }
        
    }
    
}
