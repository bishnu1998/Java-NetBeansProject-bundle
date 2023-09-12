
package information;

import java.util.Scanner;

class Staff{
   int code;
    String name;
    
    Scanner obj1 = new Scanner(System.in);
    public void getData1(){
        System.out.println("Enter the name and code of office staff\n");
       
        name = obj1.next();
         code = obj1.nextInt();
    }
    public void display1(){
        System.out.println("name="+name+"\ncode="+code);
    }
}
class Teacher extends Staff{
   
    private String subject;
    private String publication;
    
    Scanner obj2 = new Scanner(System.in);
    public void getData1(){
        System.out.println("Enter the subject and publication:\n");
        subject = obj2.next();
        publication = obj2.next();
        
    }
    public void display1(){
        System.out.println("\nSubject="+subject+"\npublication="+publication);
    }
}
class Officer extends Staff{
    private String ch;
    Scanner obj3 = new Scanner(System.in);
    public void getData1(){
        System.out.println("enter the grade of office:");
        ch = obj3.next();
        }
    public void display1(){
        System.out.println("\nGrade="+ch);
    }
}
class Typist extends Staff{
    int speed;
    Scanner obj4 = new Scanner(System.in);
     public void getData1(){
        System.out.println("enter the speed:");
        speed = obj4.nextInt();
        }
    public void display1(){
        System.out.println("\nSpeed="+speed);
    }
}
class Regular extends Typist{
   
}

class Casual extends Typist{
     String daily;
    float wages;
     Scanner obj5 = new Scanner(System.in);
     public void getData1(){
        System.out.println("enter the day and wages:\n");
      daily = obj5.next();
      wages = obj5.nextFloat();
        }
    public void display1(){
        System.out.println("\ndaily="+daily+"\nwages="+wages);
    }
}
public class Information {

    public static void main(String[] args) {
        
 Staff s = new Staff();
 s.getData1();
 s.display1();
 
 s = new Teacher();
 s.getData1();
 s.display1();
 
 s = new Officer();
 s.getData1();
 s.display1();
 
 s = new Typist();
 s.getData1();
 s.display1();
 
 s = new Casual();
 s.getData1();
 s.display1();
       
    }
    
}
    