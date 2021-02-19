import java.util.*;
public class Practice
{
 public static void main(String[] args)
 { 
  Scanner kb = new Scanner(System.in);
  System.out.print("Enter the size: " );
  int size = kb.nextInt();
  int[] [] array = new int[size] [size];
  for(int i = 0; i < size; i++)
  {
   for(int j = 0; j < size; j++)
   {
    System.out.print("Please enter row " + i + " column " + j + ": ");
    int number = kb.nextInt();
    array[i][j] = number;
   }
  } 
  
  for(int i = 0; i < array.length; i++)
  { 
   for(int j = 0; j < array.length; j++)
   { 
     System.out.print(array[i][j] + "\t");
   }  
   System.out.println();  
  }  
  
  
   
 }//main method
 
 
}
