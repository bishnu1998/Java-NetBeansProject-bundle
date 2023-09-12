
package slider;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Slider implements ChangeListener {
    private static   JSlider slider;
    private static JLabel label;

    public static void main(String[] args) {
        JFrame frame = new JFrame("JSlider");
        frame.setSize(300,300);
        frame.setLocation(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       slider = new JSlider();
        slider.setBounds(30,60,200,25);
        slider.setMaximum(100);
        
        frame.add(slider);
        
        label = new JLabel();
        label.setBounds(50,100,100,25);
        frame.add(label);
         
        slider.addChangeListener(new Slider());
        
        /* slider.addChangeListener((ChangeEvent)->{
            label.setText("current value:"+slider.getValue());
        });*/
        
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("position: "+slider.getValue());
    }
    
}
