import java.util.*;
public class TestPowerBoat
{
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  PowerBoat power = new PowerBoat("yellow", 20, 20);
  System.out.println(power.toString());
  
  System.out.print("Setting Power Boat's engine size to ");
  int size = kb.nextInt();
  
  if(!power.setEngineSize(size))
  { 
   System.out.println("Error: That engine is too powerful. The engine size must be between 1 and 350, inclusively.");
  }
  
  System.out.println(power.toString());
 
 }//main method
  
}//class