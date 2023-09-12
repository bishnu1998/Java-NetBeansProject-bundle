/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetest;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author bishnu
 * 
 */
 class Time1 {
    private int hour;
    private int minute;
    private int second;
    
  public Time1(){
      setTime(0,0,0);
  }
    
  public void setTime(int h,int m, int s){
      hour = ((h>=0 && h<24) ? h:0);
      minute = ((m>=0 && m<60) ? m:0);
      second = ((s>=0 && s<60) ? s:0);
  }
  
  public String toUniversalString(){
      DecimalFormat twoDigits = new DecimalFormat("00");
      
      return twoDigits.format(hour) + ":"+ twoDigits.format(minute)+":"+twoDigits.format(second);
              
  }
  public String toString(){
      DecimalFormat twoDigits = new DecimalFormat("00");
      
      return ((hour==12 || hour ==0)?12: hour%12) + ":"+ twoDigits.format(minute)+":"+twoDigits.format(second)+
              ":"+(hour<12 ? "AM": "PM");
       
      
  }
}

public class TimeTest {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Time1 t= new Time1();// calls Tim1 constructor
        String output;
        
        output = "the initial universal time is: " + t.toUniversalString() + "\n" + t.toString();
        
      t.setTime(13,27,6);
      
      output = output +"the second time is: "+ t.toUniversalString() + "\n"+t.toString();
        
        JOptionPane.showMessageDialog(null, output, output, JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
        
        
    }
    
}
