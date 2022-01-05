
package ParameterizedMethod;
import java.util.Scanner;
/*
1.returning value from a method
2.parameterize method

*/

class Box
{
    double w,h,d,vol;
    
    void setVolume(double x,double y,double z)
    {
        w = x;
        h = y;
        d = z;
    }
    double getVolume()
    {
        vol = w*h*d;
        return vol;
    }
}

public class TestBox {
    
    public static void main(String[] args)
    {
        Box mybox = new Box();
        Scanner input = new Scanner(System.in);
        double x,y,z;
        System.out.print("x = ");
        x = input.nextDouble();
        
        System.out.print("y = ");
        y = input.nextDouble();
        
        System.out.print("z = ");
        z = input.nextDouble();
        
        mybox.setVolume(x, y, z);
        System.out.println("volume = "+mybox.getVolume());
        
        
    }
    
    
    
    
    
}
