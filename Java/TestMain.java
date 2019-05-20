import java.util.Scanner;

public class TestMain{
    
    public static Student createStudent()
            {   Scanner input=new Scanner(System.in);
                 Student s=new Student();
                System.out.println("Enter the Department id:");
                int did=input.nextInt();
                s.setDid1(did);
                System.out.println("Enter the Department name:");
                String dname=input.next();
                s.setDname1(dname);
                System.out.print("\n");
                System.out.println("Enter the Student id:");
                int sid=input.nextInt();
                s.setSid(sid);
                System.out.println("Enter the Student name:");
                String sname=input.next();
                s.setSname(sname);
                
                return s;
            }
        
        public static void main(String args[]){
        
            Student s1;
             
             
            
            s1=createStudent();
            System.out.println("Department id:"+s1.getDid1());
            System.out.println("Department name:"+s1.getDname1());
            System.out.println("Student id:"+s1.getSid());
            System.out.println("Student name:"+s1.getSname());
        }
    }