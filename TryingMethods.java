/**
 * TryingMethods
 */
public class TryingMethods {

    public static void main(String[] args) {
        iftest(10);
        
    }

    //Method 2
    public static void iftest (int y ) {


        if (y < 2) {
            System.out.println("Minimum wage grade");
           }

           else if (y > 1) {
            System.out.println("Middle Income earner");
           }

           else if (y > 2) {
            System.out.println("Top Earner");
           }

           else
           {
            System.out.println("Cannot be graded, enter a valid wage Grade .Between 1 - 3");
           }

         
     }

    
}