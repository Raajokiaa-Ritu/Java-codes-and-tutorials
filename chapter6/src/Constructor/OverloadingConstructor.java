
package Constructor;

public class OverloadingConstructor {
    
    
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.getinfo();
        
        System.out.println();
        
        Student s2 = new Student("ritu","fe");
        s2.getinfo();
        
        System.out.println();
        
        Student s3 = new Student("ritu","13","fe");
        s3.getinfo();
    }
    
    
       
    
}
