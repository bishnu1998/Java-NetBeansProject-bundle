
package costum;

import javax.swing.JOptionPane;

class RamException extends Exception{
    RamException(String s){
        super(s);//invoke parent class Exception
    }
}
class Test{
    void validate(int age) throws Exception{
        if(age<18)
        {
            throw new RamException("you are children");
        }else{
            JOptionPane.showMessageDialog(null,"U are welcome to vote");
        }
    }
}
public class Costum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test t = new Test();
        try{
        t.validate(12);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"exception occure"+e);
        }
    }
    
}
