
package Constructor;

class Customer
{
    String name;
    int age,budget;
    Customer(String name,int age){
        this.name=name;
        this.age=age;
    }
    Customer(Customer ob,int budget){
        name = ob.name;
        age = ob.age;
        this.budget = budget;                       
    }
    void getinfo(){
     System.out.println(name+" "+age+" "+budget);
    }
}

public class Object_As_Parameter {
    
    public static void main(String[] args)
    {
        Customer ob1 = new Customer("donal trump",78);        
        ob1.getinfo();

        Customer ob2 = new Customer(ob1,200);        
        ob2.getinfo();  
    }
}
