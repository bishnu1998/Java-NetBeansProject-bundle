
package exception1;


public class Exception1 {

    
    public static void main(String[] args) {
        int a=6,b= 0;
     try{
         
          int d = a/b;
      System.out.println("result is:"+d);
     }
     catch(Exception e){
         System.out.println("this is the exception::"+a/(b+2));
     }
    }
    
}
