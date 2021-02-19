/**
 * ISTE-120 Lab 14
 * TestCircle.java 
 * @author     T.J. Borrelli
 * Updated by JKang & JLeone
 */
public class TestCircleA {
   public static void main(String [] args) {
     // read a radius of the circle from command line
     
     double radius;
     Circle aCircle;
     try
     {
      radius = Double.parseDouble(args[0]);
      aCircle = new Circle(radius);
      System.out.println(aCircle);
     }
     catch(ArrayIndexOutOfBoundsException aie)
     {
      //System.out.println(aie);
      System.out.println("ArrayIndexOutOfBoundsExcception occurred... ");
      System.exit(1);
     }
     catch(NumberFormatException nfe)
     {
      //System.out.println(nfe);
      System.out.println("NumberFormatException occurred... ");
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