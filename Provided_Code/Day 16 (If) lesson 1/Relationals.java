import java.util.*;
public class Relationals
{
 public static void main(String[] args)
 {
  double x = 1.4 * 165;
  System.out.println(x);
  final double TOLERANCE = 0.0001;
  if(Math.abs(x - 231.0) < TOLERANCE)
  {
   System.out.println(x);
  }
  
  Scanner kb = new Scanner(System.in);
  int age = kb.nextInt();
  boolean ok = (age >= 18 ? true : false);
  if(ok)
  {
   System.out.println("You can vote.");
  }
  else
  {
   System.out.println("You cannot vote");
  }
 }
}