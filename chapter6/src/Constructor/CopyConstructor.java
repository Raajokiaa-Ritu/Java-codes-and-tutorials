package Constructor;
import java.util.Scanner;

///There is no copy constructor in Java. ///
/*
However, we can copy the values from one object to another 
like copy constructor in C++.
*/
class President
{
    String name,country;    
    President(String name,String country){
        this.name = name;
        this.country = country;
    }   
    //constructor to initialize another object  
    President(President ob){
        name = ob.name;
        country = ob.country;
    }
    void getinfo(){
        System.out.println(name+" "+country);
    }
}


public class CopyConstructor {
    public static void main(String[] args)
    {       
        President p1 = new President("joe biden","usa");
        p1.getinfo();

        President p2 = new President(p1);
        p2.getinfo();    
    }  
}
