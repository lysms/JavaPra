import java.util.*;
public class EasterTester
{
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  System.out.println("Enter the year: ");
  int year = kb.nextInt();
  Easter time = new Easter(year);
  System.out.println("Month: " + time.getEasterSundayMonth());
  System.out.println("Day: " + time.getEasterSundayDay());
 }
}