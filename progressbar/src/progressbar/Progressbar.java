
package progressbar;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JLabel;


public class Progressbar {

   
    public static void main(String[] args) {
        JFrame frame = new JFrame("JProgressBar");
        frame.setSize(300,300);
        frame.setLocation(200,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JProgressBar progressbar = new JProgressBar();
        progressbar.setBounds(50,60,200,25);
        //progressbar.setBackground(Color.red);
        progressbar.setMaximum(100);
        frame.add(progressbar);
        
        JLabel label = new JLabel();
        label.setBounds(50,100,200,25);
        frame.add(label);
        
        for(int i=1; i<=100; i++){
            try{
                //int val = progressbar.getValue();
                progressbar.setValue(i);
                label.setText("Loading..."+i+"%");
                Thread.sleep(100);
                
                if(i==100){
                    label.setText("loaded");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
            
        frame.setVisible(true);
        
        
    }
    
}
