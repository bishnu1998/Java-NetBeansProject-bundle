//This program displays the contents of the authers tables
//int the BOOKs database.     
package tabledisplay;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TableDisplay extends JFrame{

    private Connection connection;
    private JTable table;
    
    public TableDisplay(){
        //the URL specifiing the books database to which 
        // this program connects using jdbc to connect to a 
        //Microsoft ODBC  database.
        
        String url ="jdbc:mysql://localhost:3307/admin";
        String username = "anonymous";
        String password = "guest";
        
        //load the driver to allow connection to the database
        try{
            Class.forName("sun.mysql.jdbc.Driver");
            
            connection = DriverManager.getConnection(url,username,password);
        }catch(ClassNotFoundException cnfex){
            System.err.println("Failed to load JDBC/ODBC driver");
            cnfex.printStackTrace();
            System.exit(1);
        }catch(SQLException sqlex){
            System.err.println("unable to connect ");
            sqlex.printStackTrace();
        }
        
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
       final TableDisplay app= new TableDisplay();
       app.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e){
              System.exit(0);
          } 
       });
    }

}