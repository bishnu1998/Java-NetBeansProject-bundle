/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bs_to_ad;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author bishnu
 */
class Date{
    private int year; //1-12
    private int month; //1-12
    private int day;// 1-30
    
    Scanner obj1 = new Scanner(System.in);
    public void Get(){
        System.out.println("enter year,month and day on BS: ");
        year = obj1.nextInt();
        month = obj1.nextInt();
        day = obj1.nextInt();
    }

    public void Calulate(){
        if(day > 17){
            day =day - 17;
        }
        else
        {
            day = day + 30;
            --month;
            day = day - 17;
        }
        if(month > 8){
            month = month - 8;
        }
        else {
            month = month + 12;
            --year;
            month = month - 8;
        }
        year = year - 56;
    }
        public String BS(){
    return (year + " - " + month + " - " + day);
}
    public void display(){
        JOptionPane.showMessageDialog(null, "Date converson from BS to AD", "BS TO AD",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Date on BS: "+BS());
    }
}
public class BS_TO_AD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date d = new Date();
        d.Get();
        d.Calulate();
        d.display();
        
        System.exit(0);
    }
    
}
