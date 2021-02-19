import java.util.*;
public class Operation {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter a number: ");
      double num = scn.nextDouble();
      System.out.print("Enter an operation code (S, s, D, H): ");
      String operation = scn.next();
      char code = operation.charAt(0);
      
      if (code == 'S') {
         System.out.println("Square: " + num * num);
      }
      else if (code == 's') {
         System.out.println("Square root: " + Math.sqrt(num));
      }
      else if (code == 'D') {
         System.out.println("Double: " + 2.0 * num);
      }
      else if (code == 'H') {
         System.out.println("Half: " + num / 2.0);
      }
      else {
         System.out.println("Invalid code");
      }
   
   }//main

}//class