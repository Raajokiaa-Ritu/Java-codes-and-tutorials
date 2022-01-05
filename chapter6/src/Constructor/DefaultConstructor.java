
package Constructor;
/*
Rule: If there is no constructor in a class, 
compiler automatically creates a default constructor.
The default constructor is used to provide the default values 
to the object like 0, null, etc., depending on the type.
*/
class Bike
{
    int name,id;
    
    /*Bike()
    {
     System.out.println("this is a default constructor");
    }*/
    //compiler automatically creates a default constructor.
    
    void getinfo()
    {
      System.out.println("name = "+name);
      System.out.println("id   = "+id);
      
    }
    
}

public class DefaultConstructor {
    public static void main(String[] args)
    {
        Bike bike1 = new Bike();
        bike1.getinfo();
    }
   
}
