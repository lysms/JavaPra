import java.util.*;

/**
 * TestBoat ... a class to test the Boat and Motor class hierarchies
 *
 * @author Pete Lutz
 * @version 9-19-2017
 */
public class TestBoat {
   // Main program
   public static void main(String[] args) {
      // check for two  boats worth of info in args
      if(args.length != 6) {
         System.out.println("There should be 3 arguments per boat:\n" +
            "     HullID, Model, Type\n" +
            "and there should be 2 boats (= 6 arguments)");
         System.exit(1);
      }
      
      // Get boat 1 info
      String hullid = args[0];
      String model = args[1];
      String type = args[2];
      
      // Make an Outboard motor, store it as a Motor, and pass to Boat constructor
      Motor motor1 = new Outboard("Mercury", 2005, 90, "4-stroke");
      Boat boat1 = new Boat(hullid, model, type, motor1);
      System.out.println("boat1: " + boat1 + "\n");
      
      // Get boat 2 info
      hullid = args[3];
      model = args[4];
      type = args[5];
      
      // Make an InboardOutboard motor, store it as a Motor, and pass to Boat constructor
      Motor motor2 = new InboardOutboard("OMC", 1989, 170, 6);
      Boat boat2 = new Boat(hullid, model, type, motor2);
      System.out.println("boat2: " + boat2);
   }
}