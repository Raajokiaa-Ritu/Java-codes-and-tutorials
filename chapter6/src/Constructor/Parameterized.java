
package Constructor;


class Teacher
{
    String name,id,gender;
    
    Teacher()
    {
      System.out.println("default!");
    }
    Teacher(String n,String i,String g)
    {
        System.out.println("Parameterized constructor");
        name = n;
        id = i;
        gender = g;
    }
    Teacher(String name,String gender)
    {
        this.name = name;
        this.gender = gender;
    }
    void getinfo()
    {
     System.out.println("name   = "+name);
     System.out.println("id     = "+id);
     System.out.println("gender = "+gender);
    }
}

public class Parameterized {
    
    public static void main(String[] args)
    {              
      Teacher  teacher1 = new Teacher();
      teacher1.getinfo();

      Teacher teacher2 = new Teacher("karim","11","male");
      teacher2.getinfo();
      //--------------------------------------
      System.out.println("-----------------");
      
      Teacher t3 = new Teacher("kari","female");
      t3.getinfo();
    }
    
    
}
