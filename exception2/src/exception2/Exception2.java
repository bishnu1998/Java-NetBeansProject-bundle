
package exception2;


public class Exception2 {

    public static void main(String[] args) {
       String s= null;
      //int a[]= new int[10];
     try{
         try{
             System.out.println("divide it");
             int b= 20/0;
         }
         catch(ArithmeticException e){
             System.out.println(e);
         }
         try{
            // System.out.println("this me");
             int a[]= new int[10];
              a[10] = 5;
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println(e);
         }
     }
     catch(Exception e){
         System.out.println(e);
    }
    
}
}