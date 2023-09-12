/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

import java.util.Scanner;

/**
 *
 * @author bishnu
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][]a=new int[2][2];
        int i,j;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter the array elemets");
        for(i=0; i<2; i++)
            for(j=0; j<2; j++){
                a[i][j] = obj.nextInt();
            }
        System.out.println("output of aray is ");
        for(i=0; i<2; i++){
            for(j=0; j<2; j++)
            {
                
                System.out.println(a[i][j]);
                System.out.println("\n");
            }
        }
    }
    
}
