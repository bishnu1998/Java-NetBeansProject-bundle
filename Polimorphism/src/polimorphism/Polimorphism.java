/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphism;

/**
 *
 * @author bishnu
 */
class Animal{
    public void animalSound(){
        System.out.println("Animals make sound");
    }
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("pig makes WEE WEE");
    }
}
class dog extends Animal{
    public void animalSound(){
        System.out.println("dog makes sound: wo wo");
    }
}
public class Polimorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a1 = new Animal(); //polimarphic variable
        a1.animalSound();
        a1 = new Pig();// reference of pig
        a1.animalSound();
        a1 = new dog();
        a1.animalSound();
    }
    
}
