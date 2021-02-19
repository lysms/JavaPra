import java.util.*;
public class NestedGrades{
   public static void main(String [] args) {
      int grade = 0;
      Scanner in = new Scanner(System.in);
      for (int j = 1; j <=5; j++) {       
         /*
         switch (j) {
            case 1:
               grade = 80;
               break;
            case 2:
               grade = 70;
               break;
            case 3:
               grade = 75;
               break;
            case 4:
               grade = 60;
               break;
            case 5:
               grade = 80;
               break;
           }       
*/
         System.out.print("Enter a grade: ");
         grade = in.nextInt();

         for (int i = 1; i <=grade; i++) {
            System.out.print("*");
         }
         System.out.print("\n");
      }       
      System.out.println("This is the end!");
      
   }//main
}//class