/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author bishnu
 */
class test{
    int a;
    float b;
    //defaulte constructer
    test(){
        a=0;
        b=0;
    }
    test(int x,float y){
        a = x;
        b = y;
    }
    public void display(){
        System.out.println("a: "+a+"b: "+b);
    }
}
public class Constructor {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test t1,t2;
        t1 = new test();
        t2 = new test(2, 3.55f);
        t1.display();
        t2.display();
    }
    
}
