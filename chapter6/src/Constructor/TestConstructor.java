 
package Constructor;

/*
In Java, a constructor is a block of codes similar to the method.It is called
when an instance of the class is created.At the time of calling constructor, 
memory for the object is allocated in the memory.
It is a special type of method which is used to initialize the object.Every 
time an object is created using the new() keyword, at least one constructor 
is called.It calls a default constructor if there is no constructor available in
the class.In such case, Java compiler provides a default constructor by default.

Rules defined for the constructor.
-Constructor name must be the same as its class name
-A Constructor must have no explicit return type
-A Java constructor cannot be abstract, static, final, and synchronized
-A constructor is automatically called when an object is created.

There are two types of constructors in Java:
-Default constructor (no-arg constructor)
-Parameterized constructor


*/

class Box
{
    double w,d,h;
    Box()
    {
        System.out.println("this is a constructor");
    }
}

public class TestConstructor {
    
    public static void main(String[] args)
    {
        Box box1=new Box();
        
    }
    
    
    
    
}
