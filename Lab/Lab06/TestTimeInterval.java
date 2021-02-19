import java.util.*;
public class TestTimeInterval
{
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  System.out.println("Please enter the first time: ");
  int firstTime = kb.nextInt();
  
  System.out.println("Please enter the second time: ");
  int secondTime = kb.nextInt();
  
  TimeInterval tim = new TimeInterval(firstTime, secondTime);
  
  int time = Math.abs(firstTime - secondTime);
  
  int hour = tim.getHours((int)time / 100);
  int minute = tim.getMinutes(time % 100); 
  double decimal = minute / 60.0;
  double decimalTime = tim.getDecimalTime(hour + decimal);
  
  System.out.println();
  System.out.println("Elapsed time in hrs/min: " + hour + " hours " + minute + " minutes");
  System.out.printf("Elapsed time in decimal: %4.2f", decimalTime);
  
 }//main method
}//class
  