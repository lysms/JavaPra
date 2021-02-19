import java.util.*;
public class Array
{
 public static void main(String[] args)
 {
  int sum = 0;
  double point = 0;
  
  Scanner kb = new Scanner(System.in);
  int[] array = new int[4];
  char[] array1 = new char[4];
    
  for(int i = 0; i < array.length; i++)
  {
   int count = i + 1;
   while(true)
   {
    System.out.print("Enter credits for course " + count + ":");
    array[i] = kb.nextInt();  
    if(array[i] < 0 || array[i] > 9)
    {
     System.out.println("Invalid number - number between 0 and 9, inclusively");
    }
    else
    {
     break;
    }
   }
  while(true)
  {
   System.out.print("Enter grade for course " + count + ":");
   array1[i] = kb.next().charAt(0);  
   if(letterToNumeric(array1[i]) == -1)
   {
    System.out.println("Invalid letter grade - letter grade entered by the user will be a single character with value A, B, C, D, or F (upper or lower case).");
   }
   else
   {
    break;
   }
  }
 }
 
 for(int i = 0; i < array.length; i++)
 {
  sum = array[i] + sum;
  point = point + array[i] * letterToNumeric(array1[i]);
 }
 
 System.out.print("\nTotal number of credits: " + sum);
 System.out.print("\nTotal number of points: " + point);
 double gpa = (double)point / sum;
 System.out.printf("\nGPA: %.2f", gpa);
  
  
  /*for(int i = 1; i <= 4; i++)
  {
   while(true)
   {
    System.out.print("Enter grade for course " + i + ":");
    char grade = kb.next().charAt(0);  
    if(letterToNumeric(grade) == -1)
    {
     System.out.println("Invalid letter grade - letter grade entered by the user will be a single character with value A, B, C, D, or F (upper or lower case).");
    }
    else
    {
     break;
    }
   }
  }*/

 
 
 
  
 }//main method
 
 public static double letterToNumeric(char letterGrade)
 {
  int number;
  switch(letterGrade)
  {
   case 'a':
      number = 4;
      break;
   case 'A':
      number = 4;      
      break;
   case 'b':
      number = 3;
      break;
   case 'B':
      number = 3;
      break;
   case 'c':
      number = 2;
      break;
   case 'C':
      number = 2;
      break;
   case 'd':
      number = 1;
      break;
   case 'D':
      number = 1;
      break;
   case 'f':
      number = 0;
      break;
   case 'F':
      number = 0;
      break;
   default:
      number = -1;
  }
  return number;
 }
 
}//class