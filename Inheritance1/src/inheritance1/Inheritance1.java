/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance1;

/**
 *
 * @author bishnu
 */
class Parent{
    int x,y,s;
    public void Sum(int a,int b){
        x = a;
        y=b;
        s= x+y;
        System.out.println("sum:"+s);
    }
    
}
public class Inheritance1 extends Parent{
  

    /**
     * @param args the command line arguments
     */
    int p;
    public void Product(int c,int d){
          System.out.println("product:"+c*d);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Inheritance1 h=new Inheritance1();
        h.Sum(10,20);
        h.Product(2, 3);
    }
    
}
