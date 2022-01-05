
package other;

import java.util.Scanner;
/*
variable are 3types:
1.Local: a variable that is declared inside a method is called local variable
         It can be declared inside a method,constructor or in a block.

2.Instance: a variable that is declared inside the class but outside any method
            is called instance variable.It is not declared as static

3.static/class variable: a variable that is declared as static is called 
                         static or class variable. it can't be declared
                         as local variable.



*/


class Mobile
{
    
    String name, price; //instance variable
    static String company; //static/class variable
    
    Mobile(String name,String price) //local variable
    {
        this.name = name;
        this.price = price;
    }
    void getinfo()
    {
        System.out.println("name = "+name+"\n"+"price = "+price);
    }
}


public class VariableTypes {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String n,p;
        
        System.out.print("name = "); 
        n = input.nextLine();
        System.out.print("price = ");
        p = input.next();
        
        Mobile m1 = new Mobile(n,p);
        m1.getinfo();
        
        
    }
    
    
}
