
package thisKeyword;
class Student1
{
    String name,id,gender;//instance variable
    
    Student1(String name,String id,String gender) //local variable
    {
        //name = name --> instance varible hiding
        //assignment to itselft. solution -> use this keyword
        //this.instanceVariable = Localvariable
        
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

public class InstanceVariableHiding {
    
    public static void main(String[] args)
    {
         
        Student1 s1 = new Student1("ritu","13","fe");
        s1.getinfo();
        
        
    }
    
    
}
