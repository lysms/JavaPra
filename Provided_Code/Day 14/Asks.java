import java.util.*;
public class Asks
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  
  System.out.println("What is your name?");
  String name = in.nextLine();
  
  System.out.println("What is your age?");
  int age = in.nextInt();

  
  System.out.println("What is your weight?");
  double weight = in.nextDouble();


  
  System.out.println("Your name is " + name + " , age is " + age + " , weight is " + weight);
 }
}
  
  