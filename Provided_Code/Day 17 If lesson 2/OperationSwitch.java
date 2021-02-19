import java.util.*;
public class OperationSwitch {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("Enter a number: ");
      double num = scn.nextDouble();
      System.out.print("Enter an operation code (S, s, D, H): ");
      String operation = scn.next();
      char code = operation.charAt(0);
      
      switch (code) { // expression must result in char, int, byte, long or short
         case 'S':
            System.out.println("Square: " + num * num);
            break;
         case 's':
            System.out.println("Square root: " + Math.sqrt(num));
            break;
         case 'D':
            System.out.println("Double: " + 2.0 * num);
            break;
         case 'H':  //H or h
         case 'h':
            System.out.println("Half: " + num / 2.0);
            break;
         default:
            System.out.println("DEFAULT");
      } //switch
      
      
      /*
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
   */
   }//main

}//class