import java.util.*;
public class UtilityTester
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  /*System.out.println("Enter an age: ");
  int age = in.nextInt();
  if(Utility.oldEnoughToVote(age))
  {
   System.out.println("The person is old enough to vote.");
  }
  else
  {
   System.out.println("The person is not old enough to vote.");
  }
  

  if(Utility.oldEnoughToDrink(age))
  {
   System.out.println("The person is old enough to drink.");
  }
  else
  {
   System.out.println("The person is not old enough to drink.");
  }
  
  
  System.out.println("Enter a year number: ");
  int year = in.nextInt();
  if(Utility.isLeapYear(year))
  {
   System.out.println("This year is a leap year.");
  }
  else
  {
   System.out.println("This year is not a leap year.");
  }*/
  
  
  System.out.println("Enter a number for a:");
  int a = in.nextInt();
  System.out.println("Enter a number for b:");
  int b = in.nextInt();
  System.out.println("Enter a number for c:");
  int c = in.nextInt();
  
  System.out.println("The smallest number is " + Utility.smallest3(a, b, c));
  
  
 }//main method
 
 
}//class