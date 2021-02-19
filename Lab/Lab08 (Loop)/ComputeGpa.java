import java.util.*;
public class ComputeGpa
{
 public static void main(String[] args)
 {
  int course;
  String grade;
  int credit;
  Gpa gpa = new Gpa();
  Scanner kb = new Scanner(System.in);
  while(true)
  {
   System.out.print("Enter number of courses: ");
   course = kb.nextInt();
   if(course <= 0)
   {
    System.out.println("Invalid number of courses - must be greater than 0");
   }
   else
   {
    break;
   }
  }
 
  for(int i = 0; i < course; i++)
  {
   while(true)
   {
    System.out.print("Enter grade (one character): ");
    grade = kb.next();
    if(grade.length() > 1)
    {
     System.out.println("Invalid grade - must enter exactly one letter");
    }
    else if(gpa.getCalcPoints(grade) == -1)
    {
     System.out.println("Invalid grade - must enter A, B, C, D, F (upper or lower case)");
    }
    else
    {
     break;
    }
  
   }
  
  while(true)
  {
   System.out.print("Enter credits: ");
   credit = kb.nextInt();
   if(credit < 0 || credit > 9)
   {
    System.out.println("Invalid credits = must bebetween 0 and 9, inclusively");
   }
   else
   {
    break;
   }
  }
   gpa.addToTotals(grade, credit);
   //System.out.print("Sum Points: " + gpa.getSumWeightedPoints() + "  Sum Credits: " + gpa.getSumCredits());
  }
  
  System.out.printf("%nGPA: %.2f", gpa.getCalcGpa());
 }
}