
package finallyblock;

public class ThrowBlock {

    void validation(int age){
                if( age<16){
            throw new ArithmeticException("invalid age");
        }
        else{
            System.out.println("wlcome to vote");
        }
  
    }
    public static void main(String[] args) {
      ThrowBlock f = new ThrowBlock();
      f.validation(5);
      //f.validation(19);
    }
    
}
