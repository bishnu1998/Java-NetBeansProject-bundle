/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance2;

/**
 *
 * @author bishnu
 */
class A{
    int x,y,s;
     public void Sum(int a,int b){
        x = a;
        y=b;
        s= x+y;
        System.out.println("sum:"+s);
    }
    
}
class B extends A{
    int p;
    public void Product(int c,int d){
          System.out.println("product:"+c*d);
    }
}
class C extends B{
    int d;
    public void divison(int c,int d){
          System.out.println("divison:"+c/d);
    }
    
}
public class Inheritance2 extends C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inheritance2 b= new Inheritance2();
        b.Sum(2, 2);
        b.Product(30, 2);
        b.divison(2,2);
    }
     
    
}
