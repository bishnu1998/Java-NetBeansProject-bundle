
package readsequentialfile;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import createsequentialfile.CreateSequentialFile;
import bankui.BankUI;
import bankaccountrecord.BankAccountRecord;

public class ReadSequentialFile extends JFrame{
    private ObjectInputStream input;
    private BankUI userInterface;
    private JButton nextRecord,open;
    
    //constructor initialize the frame
    public ReadSequentialFile(){
        super("Reading a Sequential File of Object");
        
        getContentPane().setLayout(new BorderLayout());
        userInterface = new BankUI();
        nextRecord = userInterface.getDoTask(); // button asign
        nextRecord.setText("Next Record");
        nextRecord.setEnabled(false);
        
        nextRecord.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               readRecord();
           }
        });
        addWindowListener(new WindowAdapter(){
           public void windowClosing(WindowEvent e){
               if(input !=null)
                   CloseFile();
           } 
        });
        
        open = userInterface.getDoTask2();
        open.setText("Open File");
        open.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                openFile();
            }
        });
        getContentPane().add(userInterface);
        pack();
        setSize(400,400);
        setVisible(true);
    }

   
    public static void main(String[] args) {
        new ReadSequentialFile();
    }
    private void readRecord(){
        BankAccountRecord record;
        // input the values from the file
        try{
            record = (BankAccountRecord) input.readObject();
            String values[] = {
                String.valueOf(record.getAccount()),
            record.getFirstName(),
            record.getLastName(),
            String.valueOf(record.getBalance())         
            };
            userInterface.setFieldValues(values);
        }catch(EOFException eofex){
            nextRecord.setEnabled(false);
            JOptionPane.showMessageDialog(this,"NO more records in file","End of File",
                    JOptionPane.ERROR_MESSAGE);
        }catch(ClassNotFoundException cnfex){
            JOptionPane.showMessageDialog(this,"Unable to create object","class not found",
                    JOptionPane.ERROR_MESSAGE);
        }catch(IOException e){
            JOptionPane.showMessageDialog(this,"Error during read from file",
                    "read Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void CloseFile(){
        try{
            input.close();
            System.exit(0);
        }catch(IOException ioe){
            JOptionPane.showMessageDialog(this,"Error closing file",
                    "Error",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
    
    private void openFile(){
        JFileChooser fileChooser = new JFileChooser();
        
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showOpenDialog(this);
        
        //user clicked cancel button on idalog
        if(result == JFileChooser.CANCEL_OPTION)
            return;
        
        File fileName = fileChooser.getSelectedFile();
        if(fileName == null || fileName.getName().equals(""))
            JOptionPane.showMessageDialog(this,"invalid file name","invalid file name",JOptionPane.ERROR_MESSAGE);
        else{
            try{
                input = new ObjectInputStream(new FileInputStream(fileName));
                open.setEnabled(false);
                nextRecord.setEnabled(true);
            }catch(IOException ioe){
                JOptionPane.showMessageDialog(this,"Error openig File","Error",JOptionPane.ERROR_MESSAGE);
                
            }
        }
    }

}
