/**
 * TryingMethods
 */
public class TryingMethods {

    public static void main(String[] args) {
        iftest(10);

        TryingMethods obj = new TryingMethods();
           
        //This method return somthing
            String day = obj.daysOfWeek(10);   
            
            System.out.println(day);

            System.out.println(sumofNumbers());
        
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

     public String  daysOfWeek (int day){
                
        switch(day) {
            case 1:
            return "Today is Monday" ;
            
            case 2:
            return "Today is Tuesday" ;

            case 3:
            return "Today is Wednesday" ;
            
            case 4:
            return "Today is Thursday" ;

            case 5:
            return "Today is Friday" ;

            default:
            return "Not a weekday , enter days between 1 to 5";


        }

        
      }

      //Sum of numbers <1000 

      public static int sumofNumbers() {
        int sum = 0, i=1;
        while (i<1000) {
            sum+=i;
            i++;
        }
        return sum;
      }

    
}