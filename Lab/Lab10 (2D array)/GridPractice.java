/*
Course: ISTE-120
Author: Yanshen Lin
Lab 10 Ex 1, Starter Code
Topic: 2-dim arrays
*/

import java.util.Scanner;
import java.util.Random;

public class GridPractice  {
   public static void main(String[] args)  {
   //declarations
      Scanner in = new Scanner(System.in);
      Random  generator = new Random();
      int [][] grid;	//un-instantiated grid
      int size = 0;	//number of rows and columns
   
   //get size of grid - no validation & instantiate
      System.out.print("Enter size of grid: ");
      size = in.nextInt();
      grid = new int[size][size];
   
   //fill grid with random number from 1..99
      System.out.println();
      for (int row=0; row<size; row++)  {
         for (int col=0; col<size; col++)  {
            grid[row][col] = generator.nextInt(100); //random numbers 0.99 - not 100
         }
      }
   
   //STEP 3(exercise 1):  print grid with formatting to align
   System.out.println("Random values assigned to " + size + " by " + size + " grid");
   for(int i = 0; i < size; i ++)
   {
    for(int j = 0; j < size; j++)
    { 
     System.out.printf("%5s", grid[i][j]);
    }
    System.out.println();
   }
   		
   //STEP 4A (exercise 2): print each row sum
   System.out.println();
   System.out.println("Row     Sum");
   System.out.println("-----------");
   int number = 0;
   /*for(int i = 0; i < size; i++)
   {
    number = number + grid[0][i];
   }
   //System.out.printf("%5s", "0");
   //System.out.printf("%5s", number);
   
   int row = 0;
   for(int i = 0; i < size; i++)
   { 
    row = row + grid[1][i];
   }*/
  for(int time = 0; time < size - 1; time++)
  {
   for(int i = 0 ; i < size; i++)
   { 
    for(int j = 0; j < size; j++)
    {
     number = number + grid[i][j];
    }
    System.out.printf("%5s", time);
    System.out.printf("%5s" , number);
    number = 0;
    time = time + 1;
    System.out.println();
   }
  } 
   
   /*for(int time = 0; time < size - 1; time++)
   {
    System.out.printf("%5s",time);
    System.out.printf("%5s", number);
    time = time + 1;
    System.out.printf("%n%5s", time);
    System.out.printf("%5s", row);    
   }
   /*System.out.printf("%5s", time);
   System.out.printf("%5s", number);
   System.out.printf("%n%5s", "1");
   System.out.printf("%5s", row);*/
   
   //STEP 4B (exercise 2): print each column sum
   System.out.println();
   System.out.println("Col     Sum");
   System.out.println("-----------");
   int col = 0;
  for(int time = 0; time < size - 1; time++)
  {
   for(int i = 0 ; i < size; i++)
   { 
    for(int j = 0; j < size; j++)
    {
     col = col + grid[j][i];
    }
    System.out.printf("%5s", time);
    System.out.printf("%5s" , col);
    col = 0;
    time = time + 1;
    System.out.println();
   }
  } 
   
   //STEP 5 (exercise 3): print two diagonal sums
   int dia = 0;
   for(int i = 0; i < size; i++)
   { 
    dia = dia + grid[i] [i];
   }
   System.out.println("Diagonal from upper left to lower right is " + dia);
  
   System.out.println();
   int diagonal = 0;
   int count = size - 1;
   for(int i = 0; i < size; i++)
   { 
    diagonal = diagonal + grid[i] [count];
    count = count - 1;
   }
   System.out.println("Diagonal from upper right to lower left is " + diagonal);
   }
}