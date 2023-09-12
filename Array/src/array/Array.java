/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Scanner;

/**
 *
 * @author bishnu
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //array declereation 
         int []a = new int[5];
         int i;
         Scanner obj=new Scanner(System.in);
         for(i=0; i<5; i++){
             System.out.println("enter "+i+ "element");
             a[i]=obj.nextInt();
         }
         System.out.println("Array is:");
         for(i=0; i<5; i++){
             System.out.println(a[i]);
         }}
    
}
