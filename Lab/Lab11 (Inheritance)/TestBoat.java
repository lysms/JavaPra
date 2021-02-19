import java.util.Scanner;
public class TestBoat
{
 public static void main(String[] args)
 {
  Boat boat = new Boat("blue", 25);
  System.out.println(boat.toString());
  Scanner kb = new Scanner(System.in);
  System.out.print("Setting Boat's length to ");
  int length = kb.nextInt();
  if(!boat.setLength(length))
  { 
   System.out.println("Error: Boats can only be between 20 and 50 feet, inclusively.");
  }
 
  System.out.print("Setting Boat's color to ");
  kb.nextLine();
  String color = kb.nextLine();
  
  if(!boat.setColor(color))
  {
   System.out.println("Error: Boats can only be white, red, blue and yellow.");
  }
 
  System.out.println(boat.toString()); 
 }//main method
 
}//class