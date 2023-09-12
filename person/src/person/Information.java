
package person;
import java.util.Scanner;

class Person{
    String name;
    int age;
    String address;
    int id;
    
    Person(){
        name = ""; 
        age = 0;
        address = "";
        id = 0;
    }
    Scanner obj1 = new Scanner(System.in);
    public void getData(){
        System.out.println("enter the name,age and address:\n");
        name = obj1.next();
        age = obj1.nextInt();
        address = obj1.next();
        if(age>=16){
            System.out.println("enter the citizen no:");
            id = obj1.nextInt();
    }
        else{
            id = 0;
        }
    }
    void display(){
        System.out.println("name: "+name+
                "\nage: "+age+
                "\naddress: "+address+
                "\nCitizen no. : "+id);
    }
}

public class Information {

   
    public static void main(String[] args) {
        Person p = new Person();
        p.getData();
        p.display();
    }
    
}
