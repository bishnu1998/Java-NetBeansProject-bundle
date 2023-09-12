/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import package2.Package2;

//import package1.NewClass;

import pacakage3.Pacakage3;

/**
 *
 * @author bishnu
 */
public class Package1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass c=new NewClass();
        c.display();
        Package2 p=new Package2();
       p.dis();
       
       Pacakage3 p1 = new Pacakage3();//class object
       p1.init();
    }
    
}
