
package other;

public class FinalizeMethod {
   public void finalize()
   {
     System.out.println("object is garbage collected.");
   }
   public static void main(String args[])
   {
       FinalizeMethod f = new FinalizeMethod();
       f = null;
       System.gc(); //garbage collector function
   }
}
