import java.util.*;
public class TestMonth
{
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  System.out.println("Enter the month number (1 - 12): ");
  int number = kb.nextInt();
  Month month = new Month(number);
  System.out.println("The month is: " + month.getName());
 }//main method
}//class