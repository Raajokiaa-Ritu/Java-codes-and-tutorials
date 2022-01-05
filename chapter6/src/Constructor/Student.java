
package Constructor;


public class Student {
    
    String name,gender,id;
    
    Student()
    {
        System.out.println("-----default!-----");
    }
    Student(String name,String gender)
    {
        this.name   = name;
        this.gender = gender;
    }
    Student(String name,String id,String gender)
    {
        this.name   = name;
        this.id     = id;
        this.gender = gender;
    }
    
    void getinfo()
    {
        System.out.println("name = "+name);
        System.out.println("id   = "+id);
        System.out.println("gender = "+gender);
    }
    
    
}
