
package studentmanagement;

import com.student.manage.Student;
import com.student.manage.StudentDao;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentManagement {

    public static void main(String[] args) throws IOException {
        System.out.println("welcome to student management app!");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            System.out.println("enter 1 to add user:");
            System.out.println("enter 2 to delete user:");
            System.out.println("enter 3 to display user:"); 
            System.out.println("enter 4 to exit:");
            String s =br.readLine();
            int c=Integer.parseInt(s);
            
            if(c==1){
                
                System.out.println("enter name:");
                String name=br.readLine();
                
                System.out.println("enter phone:");
                String phone=br.readLine();
                
                System.out.println("enter city:");
                String city=br.readLine();
                
                //creating the object of Student to store the data
                Student st=new Student(name,phone,city);
                
                boolean answer=StudentDao.insertStudentToDB(st);
                if(answer){
                    System.out.println("successfull added...");
                }else{
                    System.out.println("try it again!!");
                }
                System.out.println(st);
                
            }
            else if(c==2){
                System.out.println("enter the user id:");
                int userId=Integer.parseInt(br.readLine());
                boolean f=StudentDao.deleteStudent(userId);
                if(f){
                    System.out.println("deleted...");
                }else{
                    System.out.println("something went wrong!");
                }
            }
            else if(c==3){
                
                StudentDao.showAllStudents();
                
            }
            else{
                break;
            }
        }
        System.out.println("thank you for using my application.");
    }
    
}
