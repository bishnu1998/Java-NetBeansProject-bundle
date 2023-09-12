

package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {
public void calculation(){
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter the height of well");
      float h=sc.nextFloat();
      int i=0;
      float dis=0;
      /*do{
         dis=dis+7;
         if(dis>h){
            i++;
            break;
         }    
         dis=dis-2;
            i++;
      }while(dis<=h);*/
      for(i=1; dis<=h; i++){
         dis=dis+7;
         if(dis>h){
            break;
         }
         else{
            dis=dis-2;
         }
      }
      System.out.println("day to come out is: "+i);
}
   public static void main(String[] args) {
      JavaApplication3 ja=new JavaApplication3();
      ja.calculation();
   }
   
}
