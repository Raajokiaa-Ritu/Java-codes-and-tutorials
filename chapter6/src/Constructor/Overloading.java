
package Constructor;

import java.util.Scanner;

//----------overloading constructor---------
class Student1
{
    String name;
    String country;
    int age;
    Student1()
    {
        System.out.println("default!");
    }
    Student1(String name,String country)
    {
        this.name = name;
        this.country = country;
    }
    Student1(String name,String country,int age)
    {
        this(name,country);
        this.age = age;
    }
    void getinfo()
    {
        System.out.println("name = "+name+"\ncountry = "+country+"\nage = "+age);
    }
    
}


public class Overloading {
    
    public static void main(String[] args)
    {
        Student1 s1 = new Student1();
        s1.getinfo();
        System.out.println("----------------------");
       
        Student1 s2 = new Student1("joe biden","USA");
        s2.getinfo();
        
        System.out.println("----------------------");
        Student1 s3 = new Student1("joe biden","USA",60);
        s3.getinfo();
        
    }
            
    
    
    
}
