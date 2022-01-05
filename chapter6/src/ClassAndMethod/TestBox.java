
package ClassAndMethod;

/*
Declare and initialize of object
Object can be initialize using 3 methods:
  -using reference variable
  -using method
  -using contructor
*/

class Box
{
    //inside the class,outside the method-->instance variable
    double width,height, depth,volume;//instance valriable
    Box(double width,double height,double depth)
    {
        this.width  = width;
        this.height = height;
        this.depth  = depth;
    }

    void boxInput(double width,double height,double depth)
    {
        this.width  = width;
        this.height = height;
        this.depth  = depth;
    }
    void printVolume()
    {
        volume = depth * height * width;
        System.out.println("volume       = "+volume);
    }
}
public class TestBox {
    
    public static void main(String[] args)
    {
        //3.using constructor
        Box ob = new Box(2,2,2);
        ob.printVolume();
               
        ob.boxInput(2, 3, 4); //2.using method
        ob.printVolume();
        
        ob.width = 1;
        ob.height=2;
        ob.depth=3; //1.using reference variable
        ob.printVolume();
        
       
        
    }
}
