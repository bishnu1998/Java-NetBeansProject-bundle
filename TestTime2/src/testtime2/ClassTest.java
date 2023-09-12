/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtime2;

import java.text.DecimalFormat;

/**
 *
 * @author bishnu
 */
public class ClassTest {
    private int hour;
    private int minute;
    private int second;
    
    //constructor
    public ClassTest(){
        setTime(0,0,0);
    }
    //set new time value
    public void setTime(int h,int m,int s){
        hour = ((h>=0 && h<0)?h:0);
        minute = ((m>=0 && m<60)?m:0);
        second = ((s>=0 && s<60)?s:0);
    }
    //convert to string in universal time format
    public String toUniversalString(){
        
        DecimalFormat twoDigits = new DecimalFormat("00");
        return twoDigits.format(hour)+":"+twoDigits.format(minute)+":"+twoDigits.format(second);
    }
    // convert to string in stannnnnnnder time format
    public String toString(){
        DecimalFormat twoDigits =new DecimalFormat("00");
        
        return ((hour == 12 || hour == 0)?12:hour%12)
                +":"+twoDigits.format(minute)
                +":"+twoDigits.format(second)
                +((hour < 12 ?" AM":" PM"));
    }
}
