
package studenttest1;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String message){
        super(message);
    }
}
public class StudentManager{
    public Student find(String studentId) throws StudentNotFoundException{
        if(studentId.equals("123456")){
            return new Student();
        }else{
            throw new StudentNotFoundException(
            "coldn't found student with ID" +studentId);
        }
    }
}

public class StudentTest1 {

    public static void main(String[] args) {
        StudentManager manager=new StudentManager();
        try{
            Student student=manager.find("123456");
        }catch(StudentNotFoundException ex){
            System.err.print(ex);
        }
    }
    
}
