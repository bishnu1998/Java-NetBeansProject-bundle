/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfage;

interface Animal{
public void animalSound();
public void animalSleep();
}
class Dog implements Animal{
    public void animalSound(){
        
        System.out.print("dow sound bhuk bhuk");
    }
    public void animalSleep(){
        System.out.println("Dog sleep here!");
    }
}
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog a1 = new Dog();
        a1.animalSound();
        a1.animalSleep();
    }
    
}
