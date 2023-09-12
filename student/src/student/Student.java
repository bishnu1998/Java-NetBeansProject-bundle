

package student;

import java.util.Scanner;

public class Student {
String name;
int roll,i;
float[] mark=new float[5];
String[] subject= new String[]{"math","english","c++","science","social"};
Scanner sc=new Scanner(System.in);
void inputinfo(){
    System.out.println("enter the name:");
    name =sc.next();
    System.out.println("enter the roll.no:");
    roll =sc.nextInt();
    System.out.println("enter the marks of 5 subject:");
    for(i=0; i<5; i++){
        System.out.println("enter the mark in "+subject[i]);
        mark[i]=sc.nextFloat();
    }
}
void display(){
    System.out.println("name:"+name);
    System.out.println("roll:"+roll);
    for(i=0; i<5; i++){
        System.out.println(subject[i]+":"+mark[i]);
    }
}
    public static void main(String[] args) {
      Student s1 = new Student();
      s1.inputinfo();
      s1.display();
    }
    
}
