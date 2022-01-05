
package other;

class WhileDemo
{
    int i;
    void getinfo(int n)
    {
        while(i<n)
        {
            System.out.println(i);
            i++;
        }
    }
}
class DoWhileDemo
{
    int i;
    void getinfo(int n)
    {
        do{
            System.out.println(i);
            i++;
        }while(i<n);
    }
}

public class Loops {
    public static void main(String[] args) {
        WhileDemo ob = new WhileDemo();
        ob.getinfo(5);
        System.out.println("-----\n");
        DoWhileDemo ob1 = new DoWhileDemo();
        ob1.getinfo(6);
    }
}
