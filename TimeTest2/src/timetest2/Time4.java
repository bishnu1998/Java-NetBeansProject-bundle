/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetest2;

import java.text.DecimalFormat;

/**
 *
 * @author bishnu
 */
public class Time4 {
    private int hour;
    private int minute;
    private int second;
    
    
    //constructor with no argument
    public Time4(){
        setTime(0,0,0);
    }
    //constructor with only one argument hour
    public Time4(int h){
        setTime(h,0,0);
    }
   //constructor with two argument hour and minute
    public Time4(int hour,int minute){
        setTime(this.hour,this.minute,0);
    }
    //construct with all three argument and by concept of this function
    public Time4(int hour,int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    //calling object
    public Time4(Time4 time){
        setTime(time.hour,time.minute,time.second);
    }
    
    //Set a new time value using universal time preferance
    public void setTime(int hour,int m ,int second){
        this.hour =((hour>=0 && hour<24)?hour:0);
        minute = ((m>=0 && m<60)?m:0);
        this.second = ((second>=0 && second<60)?second:0);
    }
    
    //convert to string in universal time format
    public String toUniveralString(){
        DecimalFormat twoDigits = new DecimalFormat("00");
        
        return twoDigits.format(hour)+":"+
                twoDigits.format(minute)+":"+
                twoDigits.format(second)+":";
    }
    
    //convert to string in standard time format
    public String toString(){
        DecimalFormat twoDigits = new DecimalFormat("00");
        
        return ((hour == 12 || hour == 0)? 12: hour%12)+":"+
                twoDigits.format(minute)+":"+
                twoDigits.format(second)+":"+
                ((hour<12)?" AM" :" PM");
        
    }
}
