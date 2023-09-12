
package pkginterface;

import java.util.Scanner;

interface office{
   public void getdata();
    public void display();
}
class staff implements office{
    String office;
    String name;
    Scanner obj1 = new Scanner(System.in);
   public void getdata(){
        System.out.println("enter the name of office and staff:\n");
        office = obj1.next();
        name = obj1.next();
    }
   public void display(){
        System.out.println("\n\noffice: "+office+"\nstaff name: "+name);
        
    }
}
public class Interface {

    public static void main(String[] args) {
        staff f = new staff();
        f.getdata();
        f.display();
    }
    
}
