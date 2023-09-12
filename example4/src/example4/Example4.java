package example4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example4 extends JFrame{
    private String strings[] = {"Metal","Motif","windows"};
    private UIManager.LookAndFeelInfo looks[];
    private JRadioButton radio[];
    private ButtonGroup group;
    private JButton button;
    private JLabel label;
    private JComboBox comboBox;
    
    public Example4(){
        super("look and feel demo");
        Container c = getContentPane();
        
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(3,1,0,5));
        label = new JLabel("This is a metal look and feel",SwingConstants.CENTER);
        northPanel.add(label);
        button = new JButton("JButton");
        northPanel.add(button);
        comboBox = new JComboBox(strings);
        northPanel.add(comboBox);
        
       c.add(northPanel,BorderLayout.NORTH);
       
       JPanel southPanel = new JPanel();
       radio = new JRadioButton[strings.length];
       group = new ButtonGroup();
       ItemHandler handler = new ItemHandler();
       southPanel.setLayout(new GridLayout(1,radio.length));
       
       for(int i=0; i<radio.length; i++){
           radio[i] = new JRadioButton(strings[i]);
           radio[i].addItemListener(handler);
           group.add(radio[i]);
           southPanel.add(radio[i]);
       }
       c.add(southPanel,BorderLayout.SOUTH);
       
       //get the installed look and geel information
       looks = UIManager.getInstalledLookAndFeels();
       
       setSize(500,500);
       setVisible(true);
       
       radio[0].setSelected(true);
       
    }
    
    
        
    public static void main(String[] args){
        new Example4();
        
    }
 
   
    
    private class ItemHandler implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            for(int i=0; i<radio.length; i++)
                if(radio[i].isSelected()){
                    label.setText("this is a "+ strings[i] +" look and feel");
                    comboBox.setSelectedIndex(i);
                    changeTheLookAndFeel(i);
                }
        }
        
    }
    
       
    
    
    private void changeTheLookAndFeel(int value){
        try{
            UIManager.setLookAndFeel(
            looks[value].getClassName());
            SwingUtilities.updateComponentTreeUI(this);           
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}