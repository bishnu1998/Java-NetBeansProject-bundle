package createsequentialfile;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import bankui.BankUI;
import bankaccountrecord.BankAccountRecord;

public class CreateSequentialFile extends JFrame{
    private ObjectOutputStream output;
    private JButton enter,open;
    private BankUI userInterface;
    
    public CreateSequentialFile(){
        super("creating a Sequential file of object");
        
        getContentPane().setLayout(new BorderLayout());
        userInterface =new BankUI();
        getContentPane().add(userInterface,BorderLayout.CENTER);
        
        enter =userInterface.getDoTask();
        enter.setText("Enter");
        enter.setEnabled(false);
        enter.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e){
               addRecord();
           }
        });
       addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e){
              if(output != null){
              addRecord();
              closeFile();
          }else
                  System.exit(0);
          }
       });
       open = userInterface.getDoTask2();
       open.setText("savae as");
       open.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e){
              openFile();
          } 
       });
        
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args){
        new CreateSequentialFile();
    }
    private void addRecord(){
        int accountNumber = 0; 
        BankAccountRecord record;
        String fieldValues[] = userInterface.getFieldValues();
        
        //if the account field value is not empty
        if(! fieldValues[0].equals("") ){
            try{
                accountNumber = Integer.parseInt(fieldValues[0]);
                if(accountNumber > 0){
                    record = new BankAccountRecord(accountNumber,fieldValues[1],fieldValues[2],
                    Double.parseDouble(fieldValues[3]));
                    output.writeObject(record);
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showConfirmDialog(null, nfe);
            }catch(Exception e){
                closeFile();
            }
        }
    }
    
    private void closeFile(){
        try{
            output.close();
            System.exit(0);
        }catch(IOException ioe){
            JOptionPane.showConfirmDialog(this, ioe);
            System.exit(0);
        }
    }
    
    private void openFile(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int result = fileChooser.showSaveDialog(this);
        if(result == JFileChooser.CANCEL_OPTION)
            return;
        File fileName = fileChooser.getSelectedFile();
        
        if(fileName == null || fileName.getName().equals(""))
            JOptionPane.showMessageDialog(this,"invalid fileName","invalid fileName",JOptionPane.ERROR_MESSAGE);
        else{
            try{
                output = new ObjectOutputStream(new FileOutputStream(fileName));
                open.setEnabled(false);
                enter.setEnabled(true);
            }catch(IOException ioe){
                JOptionPane.showMessageDialog(this, "error opening file","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}