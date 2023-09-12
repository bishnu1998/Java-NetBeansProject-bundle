package bankui;

import javax.swing.*;
import java.awt.*;

public class BankUI extends JPanel{
    protected final static String name[] = {
      "Account number","First name","last name","Balance","Transaction Amount"  
    };
    protected JLabel labels[];
    protected JTextField fields[];
    protected JButton doTask,doTask2;
    protected JPanel innerPanelCenter, innerPanelSouth;
    protected int size = 4;
    protected static final int Account = 0,First =1,Last = 2,Balance = 3,Transaction = 4;
    
    public BankUI(){
        this(4);
    }
    public BankUI(int mySize){
        size = mySize;
        labels = new JLabel[size];
        fields = new JTextField[size];
        
        for(int i=0; i<labels.length; i++){
            labels[i] = new JLabel(name[i]);
        }
        for(int i=0; i<fields.length; i++){
            fields[i] = new JTextField();
        }
        
        innerPanelCenter = new JPanel();
        innerPanelCenter.setLayout(new GridLayout(size,2));
        
        for(int i=0; i<size; i++){
            innerPanelCenter.add(labels[i]);
            innerPanelCenter.add(fields[i]);
        }
        
        doTask = new JButton();
        doTask2 = new JButton();
        
        innerPanelSouth = new JPanel();
        innerPanelSouth.add(doTask);
        innerPanelSouth.add(doTask2);
        
        //setLayout(new BorderLayout());
        add(innerPanelCenter,BorderLayout.CENTER);
        add(innerPanelSouth,BorderLayout.SOUTH);
        validate();
    }
    
    public JButton getDoTask() {
        return doTask;
    }
    public JButton getDoTask2(){
        return doTask2;
    }
    public JTextField[] getFields() {
        return fields;
    }
    public void clearFields(){
        for(int i=0; i<size; i++)
            fields[i].setText("");
    }
    public void setFieldValues(String s[]) throws IllegalArgumentException{
        if(s.length != size)
            throw new IllegalArgumentException("ther must be" +size+
                    "string in the array");
        for(int i=0; i<size; i++)
            fields[i].setText(s[i]);
    }
    public String[] getFieldValues(){
        String values[] = new String[size];
        
        for(int i=0; i<size; i++)
            values[i] = fields[i].getText();
        return values;
    }
}