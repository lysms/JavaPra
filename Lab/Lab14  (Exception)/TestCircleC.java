/**
 * ISTE-120 Lab 14
 * TestCircle.java 
 * @author     T.J. Borrelli
 * Updated by JKang & JLeone
 */
 import java.util.*;
public class TestCircleC {
   public static void main(String [] args) {
     // read a radius of the circle from command line
     
     double radius;
     Circle aCircle;
     Scanner kb;
     
    while(true)
    {
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

     }
     catch(java.util.NoSuchElementException nse)
     {
      //System.out.println(nse);
      System.out.println("NoSuchElementException occurred... ");

     }     
     catch(ShapeException sei)
     {
      //System.out.println(sei);
      System.out.println("Shape Exception occurred... ");

     }
     catch(Exception e)
     {
      //System.out.println(nfe);
      System.out.println(e);
     } 
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