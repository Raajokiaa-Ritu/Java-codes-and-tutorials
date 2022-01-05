
package MethodOverload;
/*
method overloading is a process that allows a class to have
two or more methods having same name , as long as their 
parameter declaration are different.

These methods are called overloaded method.

so: 
-same method name
-parameter list are different
-inside the same class
*/
class Overload
{
    int a,b,c;
    void add(int a,int b)
    {
     System.out.println(a+b);
    }
    void add(double a ,double b)
    {
        System.out.println(a+b);
    }
    void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    void add()
    {
     System.out.println("nothing to add");
    }
}


public class MethodOverload {
    public static void main(String[] args)
    {
        Overload ob = new Overload();
        ob.add();
        ob.add(5,4);
        ob.add(2.5,2.5);
        ob.add(2,3,4);
    }
}
