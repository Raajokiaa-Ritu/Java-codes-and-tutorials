
package Constructor;

class Add
{
   int a,b,c;   
   Add(int a)
   {
      this.a = a;
   }
   //a constuctor can return a constructor
   Add increment()
   {
       Add ob =new Add(a+10);
       return ob;
   }
}


public class Return_an_Object {
    
    public static void main(String[] args)
    {
        Add ob1 = new Add(2);
        Add ob2 = ob1.increment();
        
        System.out.println("ob1 = "+ob1.a);
        System.out.println("ob2 = "+ob2.a);
        
    }
    
    
}
