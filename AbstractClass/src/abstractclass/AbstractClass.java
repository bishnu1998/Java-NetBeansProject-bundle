/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author bishnu
 */
abstract class Bike{
    Bike(){
        System.out.println("i ma bike!");
    }
abstract void run();
void changeGare(){
    System.out.println("Gare changed!");
}
}
class Hunda extends Bike{
void run(){
System.out.println("speed of: 60km/h");
        }
}
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bike h= new Hunda();
        //Hunda h= new Hunda();
        h.changeGare();
        h.run();
    }
    
}
