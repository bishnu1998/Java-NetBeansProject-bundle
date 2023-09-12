
package calculater2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.awt.Font.BOLD;


public class Calculater2 extends JFrame{
    private JButton btn[]=new JButton[20];
    private String btnString[] ={
        "C","CL","sqrt","%","7","8","9","+","4","5","6","-","1","2","3","*","0",".","=","/"
    };
    private JLabel label;
    private int x1=0; 
    private int y1=80;
    private String operator="";
    private String firsttext="";
    private double num1,num2;
    
   Calculater2(){
       setSize(325,490);
       setLocation(50,50);
       setLayout(null);
       setResizable(false);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       label = new JLabel();
       label.setBounds(0,0,getWidth()-20,80);
       label.setHorizontalAlignment(SwingConstants.RIGHT);
       label.setFont(new Font("",Font.BOLD,20));
       add(label);
       
       for(int i=0; i<btn.length; i++){
           btn[i]=new JButton();
           btn[i].setBounds(x1,y1,80,80);
           btn[i].setFont(new Font("Lucida Handwritting",Font.BOLD,20));
           btn[i].setText(btnString[i]);
           
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
           }if(i==15){
               y1+=80;
               x1=0;
           }
           
           ActionListenerHandler handler = new ActionListenerHandler();
           btn[i].addActionListener(handler);
       }
       
       for(int i=3; i<btn.length; i+=4){
           btn[i].setBackground(Color.ORANGE);
           btn[i].setForeground(Color.RED);
           
       }
       for(int i=0; i<3; i++){
           btn[i].setBackground(Color.BLUE);
           btn[i].setForeground(Color.LIGHT_GRAY);
       }
        setVisible(true);
    }

    
    public static void main(String[] args) {
       Calculater2 cal = new Calculater2();
       cal.addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent e){
               System.exit(0);
           }
       });
    }
    
    private class ActionListenerHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JButton b = (JButton)e.getSource();
            
            if(b.getText().equals("C")){
                label.setText("");
            }else if(b.getText().equals("CL")){
                label.setText(label.getText().substring(0,label.getText().length()-1));
            }else if(b.getText().equals("+")){
                operator="+";
                firsttext=label.getText();
                label.setText("");
            }else if(b.getText().equals("-")){
                operator="-";
                firsttext=label.getText();
                label.setText("");
            }else if(b.getText().equals("*")){
                operator="*";
                firsttext=label.getText();
                label.setText("");
            }else if(b.getText().equals("/")){
                operator="/";
                firsttext=label.getText();
                label.setText("");
            }else if(b.getText().equals("sqrt")){
                try{
                    double d =Double.parseDouble(label.getText());
                    label.setText(""+(Math.sqrt(d)));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null,"this is expressinon can't be evaluated");
                    label.setText("");
                }
            }else if(b.getText().equals("=")){
                try{
                    
                    num1=Double.parseDouble(firsttext);
                    num2=Double.parseDouble(label.getText());
                    
                    if(operator.equals("+")){
                    label.setText(""+(num1+num2));
                    }
                    if(operator.equals("-")){
                        label.setText(""+(num1-num2));
                    }
                    if(operator=="*"){
                        label.setText(""+(num1*num2));
                    }
                    if(operator=="/"){
                        try{
                            label.setText(""+(num1/num2));
                        }catch(Exception e1){
                            System.out.println(e);
                        } 
                    }
                }
            }
            
        }
        
    }
    
}
