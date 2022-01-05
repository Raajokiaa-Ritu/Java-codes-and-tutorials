package other;

class BuildStack
{
    int stack[] = new int[10];
    int limit;
    BuildStack(){
        limit = -1;
    }
    void push(int i){
        if(limit==9)
          System.out.println("Full");        
        else
          stack[++limit] = i; 
    }
    int pop(){
        if(limit<0){
          System.out.println("Empty");
          return 0;
        }
        else return stack[limit--];  
    }
}

public class Stack {
    public static void main(String[] args)
    {
        BuildStack b = new BuildStack();
        
        
        for(int i=0;i<11;i++)
            b.push(i);
        
        for(int i=0;i<10;i++)
            System.out.println(b.pop());
    }
}
