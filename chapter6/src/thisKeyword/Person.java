package thisKeyword;
/*
"this" keyword used to refer current class object.
usage of "this" keyword:-
1. refer current class instance variable
2. call current class constructor
3. call current class method
*/
class Person1
{
    //instance variable
    String name,color;
    int age;
    Person1(String name,int age){
        this.name = name;//current class intance variable
        this.age = age;
    }    
    //-------call current class constructor--------
    Person1(String name,String color,int age){
     this(name,age); 
     this.color = color;
    }
    void getinfo(){
     System.out.println(name+" "+color+" "+age);
    }
    
    //----call current class method--------
    void message(){
      this.getClass();
    }
}


public class Person {
    
    public static void main(String[] args)
    {                
        Person1 p1 = new Person1("kim",22);
        Person1 p2 = new Person1("kimso","white",32);
        p2.getinfo();
        p2.message();
       
    }  
}
