
package ObjectReferenceVariable;


/*
object as reference variable
*/
class Box
{
    double width,height,depth;
    double volume;
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
        Box b1 = new Box();   
        Box b2 = b1;
        b2.boxInput(1, 2, 3);
        
        b2.printVolume();
    }
  
}
