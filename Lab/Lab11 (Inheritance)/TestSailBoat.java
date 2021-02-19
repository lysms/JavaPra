import java.util.*;
public class TestSailBoat
{
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  SailBoat sail = new SailBoat("red", 25, 2);
  System.out.println(sail.toString());
  
  System.out.print("Changing Sailboat's color to ");
  String color = kb.nextLine();
  
  if(!sail.setColor(color))
  { 
   System.out.println("Error: Error: Boats can only be white, red, blue and yellow.");
  }
  
  System.out.print("Changing Sailboat's length to ");
  int length = kb.nextInt();
  
  if(!sail.setLength(length))
  { 
   System.out.println("Error: Boats can only be between 20 and 50 feet, inclusively.");
  }
  System.out.println(sail.toString());
 
 }//main method
  
}//class