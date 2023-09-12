
package jframe;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Jframe implements ActionListener {

    private static JTextField P;
    private static JTextField R;
    private static JTextField N ;
    private static JLabel ans;
    private static JTextField ans1;
    private static JButton button;
    private static int EMI;
    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        frame.setSize(500,500);
        frame.setLocation(200,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // for heading
        JLabel label1 = new JLabel("EMI Calculater");
        label1.setBounds(100,10,100,25);
        frame.add(label1);
        
        //for principal
        JLabel label2= new JLabel("Princival (p):");
        label2.setBounds(20,40,100,25);
        frame.add(label2);
        
        P = new JTextField();
        P.setBounds(150,40,100,25);
        frame.add(P);
        
        //for rate of interest
        JLabel label3 = new JLabel("Rate (R):");
        label3.setBounds(20,80,100,25);
        frame.add(label3);
        
        R = new JTextField();
        R.setBounds(150,80,100,25);
        frame.add(R);
        
        
        //for tenure of repayment
        JLabel label4 = new JLabel("Tenure (N):");
        label4.setBounds(20,120,100,25);
        frame.add(label4);
        
        N= new JTextField();
        N.setBounds(150,120,100,25);
        frame.add(N);
        
        //button
        button = new JButton("BMI calulate");
        button.setBounds(100,200,100,30);
        button.addActionListener(new Jframe());
        frame.add(button);
        
        //for answer
        JLabel ans =new  JLabel("sum is"+"     =");
        ans.setBounds(40,300,200,25);
        frame.add(ans);
        
        ans1= new JTextField();
        ans1.setBounds(130,300,100,25);
        frame.add(ans1);
        
      
        frame.setVisible(true);
      
    }
    @Override
    public void actionPerformed(ActionEvent e){
         int P1 = Integer.parseInt(P.getText());
         int R1 = Integer.parseInt(R.getText());
          int N1 = Integer.parseInt(N.getText());
          
          //EMI =([P1*R1*(1+R1)^N1]/[(1+R1)^(N1-1)]);
           EMI = (P1*R1*(1+R1)^N1)/((1+R1)^(N1-1));      
         
          ans1.setText("EMI is :"+EMI);
        
      
        
        
        
        
    }
    
}
