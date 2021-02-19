/**
 * ISTE-120 Lab 14
 * TestCircle.java 
 * @author     T.J. Borrelli
 * Updated by JKang & JLeone
 */
 import java.util.*;
public class TestCircleB {
   public static void main(String [] args) {
     // read a radius of the circle from command line
     
     double radius;
     Circle aCircle;
     Scanner kb;
     try
     {
      kb = new Scanner(System.in);
      System.out.print("Enter a circle radius: ");
      radius = kb.nextDouble();
      kb.nextLine();
      aCircle = new Circle(radius);
      System.out.println(aCircle);
     }
     catch(java.util.InputMismatchException ime)
     {
      //System.out.println(ime);
      System.out.println("InputMismatchException occurred... ");
      System.exit(1);
     }
     catch(java.util.NoSuchElementException nse)
     {
      //System.out.println(nse);
      System.out.println("NoSuchElementException occurred... ");
      System.exit(1);
     }     
     catch(ShapeException sei)
     {
      //System.out.println(sei);
      System.out.println("Shape Exception occurred... ");
      System.exit(1);
     }
     catch(Exception e)
     {
      //System.out.println(nfe);
      System.out.println(e);
      System.exit(1);
     } 
     
     
     /*double result = Integer.parseInt(args[0]);
     if(result < 0)
     {
      throw new ShapeException("Shape Exception Ocurred...");
     }
     */
     
     
     // Instantiate a Circle object
      //Circle aCircle = new Circle(radius);
   
      // Print current status of the circle
      //System.out.println(aCircle);
   }
}