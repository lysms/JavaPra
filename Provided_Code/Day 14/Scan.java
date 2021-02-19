import java.util.*;
public class Scan
{
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  System.out.println("What integer you want to input?");
  int myInt = kb.nextInt();
  
  System.out.println("What double number you want to input?");
  double myDouble = kb.nextDouble();
  
  System.out.println("What string you want to input?");
  String myString = kb.next();
  
  System.out.println();
  System.out.println("The integer you enter is " + myInt);
  System.out.println("The double number you enter is " + myDouble);
  System.out.println("The string you enter is " + myString);
  
  
  
  //String.format
  double startPi = Math.PI;
  String myPi = String.format("%6.5f", startPi);
  System.out.println(myPi);
 }
}
  
  
  