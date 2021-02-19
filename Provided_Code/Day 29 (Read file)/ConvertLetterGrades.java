import java.util.*;
/**
 * Class ConvertLetterGrades
 * Main program to convert letter grades to numeric grades.
 * Stops when a Q is entered. If an illegal letter grade is
 * entered, throws an InputValidationException
 * @author Pete Lutz
 * @version 9-20-2017
 */
public class ConvertLetterGrades {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      try {
         while(true) {
            System.out.print("Enter a letter grade: ");
            String grade = in.nextLine();
            
            switch(grade.charAt(0)) {
               case 'A':   System.out.println("A = 4");
                           break;
               case 'B':   System.out.println("B = 3");
                           break;
               case 'C':   System.out.println("C = 2");
                           break;
               case 'D':   System.out.println("D = 1");
                           break;
               case 'F':   System.out.println("F = 0");
                           break;
               case 'Q':   System.out.println("Quitting!");
                           System.exit(1);
                           break;
               default:    throw new InputValidationException("Illegal grade: " + grade.charAt(0));
            }
         }
      }
      catch(InputValidationException ive) {
         System.out.println(ive);
         System.exit(1);
      }
   }
}