import java.util.*;
public class LetterGrade
{
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  System.out.println("Enter a grade between 0 and 100: ");
  double num = kb.nextDouble();

  if(num < 0 || num > 100)
  {
   System.out.println("The grade must be between 0 and 100 inclusive.-");
   System.exit(0);
  }
  
  int grade = (int)num / 10;
  
  switch(grade)
  {
   case 0:
   case 1:
   case 2:
   case 3:
   case 4:
   case 5:
      System.out.println("The letter grade is F");
      break;
   case 6:
      System.out.println("The letter grade is D");
      break; 
   case 7:
      System.out.println("The letter grade is C");
      break;
   case 8:
      System.out.println("The letter grade is B");
      break;
   case 9:
   case 10:
      System.out.println("The letter grade is A");
      break;
  }
 }
}
   
  