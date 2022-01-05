
package thisKeyword;

import java.util.Scanner;

class Student
{
    String name,id,gender;
    
   
    Student(String name,String id,String gender)
    {
        this.name = name;
        this.id   = id;
        this.gender = gender;
    }
    void getinfo()
    {
     System.out.println("name   = "+name);
     System.out.println("id     = "+id);
     System.out.println("gender = "+gender);
    }
}
public class thisKeyword
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      String name,id,gender;
      
      System.out.print("name = ");name = input.nextLine();
      System.out.print("id    = ");id = input.next();      
      System.out.print("gender = ");gender = input.next();      
      //------------------------------      
      
      System.out.println("\n\n_______Printing Output_______\n");      
      Student s2 = new Student(name,id,gender);
      s2.getinfo();
      
     
    }    
    
    
    
}
