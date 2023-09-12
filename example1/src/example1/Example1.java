
class shape{
    void Area(){
        System.out.println("we get shape:\n");
    }
}
class Triangle extends shape{
    void Area(){
        System.out.println("This is Triangle\n");
    }
}
class Rectangle extends shape{
    void Area(){
        System.out.println("This is Rectangle\n");
    }
}

public class Example1{
    public static void main(String[] args){
        shape s;
        s = new shape();
        s.Area();
        
         s = new Triangle(); //upcating
         s.Area();
         
         s = new Rectangle();//upcasting
         s.Area();
    }
}