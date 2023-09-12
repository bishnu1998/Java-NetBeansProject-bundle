
package calulater1;
import java.awt.*;
import static java.awt.Font.BOLD;
import java.awt.event.*;
import javax.swing.*;

public class Calulater1 extends JFrame implements ActionListener{
    private JButton btn[] = new JButton[20]; //Array of 20 button calaulater
    private String btntext[] = {
        "C","CE","sqrt","%","7","8","9","+","4","5","6","-","1","2","3","*","=","0",".","/"
    };
    private int x1=0;
    private int y1=80;
    private JLabel label;
    private String operator=""; //to hold the operater
    private double num1,num2;// operand on calulater
    private String firsttxt="";// hold the inital value on it

public Calulater1(){
  setSize(325,495);
  setLocation(300,100);
  setLayout(null);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setResizable(false);
  
  label = new JLabel();
  label.setBounds(0,0,getWidth()-20,80);
  label.setHorizontalAlignment(SwingConstants.RIGHT); //to come numer from right
  label.setFont(new Font("",Font.BOLD,20));
  add(label);
  
  for(int i=0; i<btn.length; i++){
      btn[i] = new JButton();
      btn[i].setBounds(x1,y1,80,80);//int x, int y, int width ,int height
      btn[i].setFont(new Font("Lucida Handwriting",Font.BOLD,20));
      btn[i].setText(btntext[i]);
      
      
      btn[i].setBackground(Color.GRAY);
      btn[i].setForeground(Color.ORANGE);
      
      
      add(btn[i]);
      
      x1+=80;
      if(i==3){
          y1+=80;
          x1=0;
          
      }
      if(i==7){
          y1+=80;
          x1=0;
      }
      if(i==11){
          y1+=80;
          x1=0;
      }
        if(i==15){
          y1+=80;
          x1=0;
      }
        
        btn[i].addActionListener(this);
  }
  for(int i=3; i<btn.length; i+=4){
      btn[i].setBackground(Color.ORANGE);
      btn[i].setForeground(Color.red);
        
  }
  for(int i=0; i<3; i++){
      btn[i].setBackground(Color.BLUE);
      btn[i].setForeground(Color.LIGHT_GRAY);
      
  }
      setVisible(true);
   
}
@Override
public void actionPerformed(ActionEvent ae){
    JButton b = (JButton)ae.getSource();
    
    if(b.getText().equals("C")){
        label.setText("");
    }else if(b.getText().equals("CE")){
        label.setText(label.getText().substring(0,label.getText().length()-1));
    }else if(b.getText().equals("+")){
        operator = "+";
        firsttxt=label.getText();
        label.setText("");
    }else if(b.getText().equals("-")){
        operator="-";
        firsttxt=label.getText();
        label.setText("");
    }else if(b.getText().equals("*")){
        operator="*";
        firsttxt=label.getText();
        label.setText("");
    }else if(b.getText().equals("/")){
        operator="/";
        firsttxt=label.getText();
        label.setText("");
    }else if(b.getText().equals("%")){
        operator="%";
        firsttxt=label.getText();
        label.setText("");
    }else if(b.getText().equals("sqrt")){
        try{
            double d=Double.parseDouble(label.getText());
            label.setText(""+(Math.sqrt(d)));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"this expression can't be evaluated");
            label.setText("");
        }
    }else if(b.getText().equals("=")){
        try{
            num1 =Double.parseDouble(firsttxt);
            num2 =Double.parseDouble(label.getText());
            
            if(operator=="+"){
                label.setText(""+(num1+num2));
            }else if(operator=="-"){
                label.setText(""+(num1-num2));
            }else if(operator=="*"){
                label.setText(""+(num1*num2));
            }else if(operator=="/"){
                label.setText(""+(num1/num2));
            }else if(operator=="%"){
                label.setText(""+(num1%num2));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"this expression can't be evaluated");
            label.setText("");
        }
    }else{
        String lbltxt=label.getText();
        
        String btntxt =b.getText();
        
        label.setText(lbltxt+""+btntxt);
    }
}

//main 
    public static void main(String[] args) {
     Calulater1 cal = new Calulater1();
    }

}
