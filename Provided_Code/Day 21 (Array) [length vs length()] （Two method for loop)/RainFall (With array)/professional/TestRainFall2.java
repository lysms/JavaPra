import java.util.*;

public class TestRainFall2 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      if(args.length != 12) {
         System.out.println("Exactly 12 numbers are needed.");
         System.exit(0);
      }
      
      MonthlyRain2 mr = new MonthlyRain2(
         Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]),
         Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]), 
         Double.parseDouble(args[6]), Double.parseDouble(args[7]), Double.parseDouble(args[8]), 
         Double.parseDouble(args[9]), Double.parseDouble(args[10]), Double.parseDouble(args[11]));

      boolean keepGoing = true;
      while(keepGoing) {
         System.out.println("Enter a month number (1-12, 0 to end): ");
         int monthNo = in.nextInt(); in.nextLine();
         if(monthNo == 0) {
            keepGoing = false;
         }
         else {
            System.out.println("The amount of rain in month " + mr.getMonthName(monthNo) + " was: " +
               mr.getRainFall(monthNo));
         }
      }
      
      System.out.println("Rainfall Summary:\n" + mr);
   }
}
         