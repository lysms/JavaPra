/**
  * Yanshen Lin
  * ISTE-120
**/
import java.util.*; 
public class Skyscraper
{
 private int[] [] puzzle;
 private int[] right;
 private int[] left;
 private int[] top;
 private int[] bottom;
 
 Scanner kb = new Scanner(System.in);
 
 
 public void read()
 {
  System.out.print("What size of puzzle are you making? ");
  int size = kb.nextInt();
  puzzle = new int[size] [size];
  right = new int[size];
  left = new int[size];
  top = new int[size];
  bottom = new int[size];

  for(int i = 0; i < size; i++)
  {
   for(int j = 0; j < size; j++)
   {
    System.out.print("Please enter row " + i + " column " + j + ": ");
    puzzle[i][j] = kb.nextInt();
   }//second loop
   
  }//first loop
  
 }//class read
 
 
 public void computeClues()
 {
//top array
   int largest = 0;
   int clue = 0;
   for(int row = 0; row < puzzle.length; row++)
   {
    for(int col = 0; col < puzzle.length; col++)
    { 
     int local = puzzle[col][row];
     if(local > largest)
     {
      clue = clue + 1;
      largest = local;
     }
     
    }//loop
    top[row] = clue;
    clue = 0;
    largest = 0;
   }//loop
  
  
//left array
   for(int row = 0; row < puzzle.length; row++)
   {
    for(int col = 0; col < puzzle.length; col++)
    { 
     int local = puzzle[row][col];
     if(local > largest)
     {
      clue = clue + 1;
      largest = local;
     }
     
    }//loop
    left[row] = clue;
    clue = 0;
    largest = 0;
   }//loop

      
  
//bottom array
   for(int row = 0; row < puzzle.length; row++)
   {
    for(int col = puzzle.length - 1; col >= 0; col--)
    { 
     int local = puzzle[col][row];
     if(local > largest)
     {
      clue = clue + 1;
      largest = local;
     }
     
    }//loop
    bottom[row] = clue;
    clue = 0;
    largest = 0;
   }//loop
  
  
//right array
   for(int row = 0; row < puzzle.length; row++)
   {
    for(int col = puzzle.length - 1; col >= 0; col--)
    { 
     int local = puzzle[row][col];
     if(local > largest)
     {
      clue = clue + 1;
      largest = local;
     }
     
    }//loop
    right[row] = clue;
    clue = 0;
    largest = 0;
   }//loop
 }
 
 
 public void printPuzzle()
 {
  System.out.print("    |");
  for(int i = 0; i < top.length;i++)
  {
   System.out.printf("%3s   ", top[i]);
  }
  System.out.print("|");
  System.out.println("\n----------------------------------");
  
  for(int i = 0; i < puzzle.length; i++)
  { 
   System.out.printf("%1s " , left[i]);
   System.out.print("  |");
   for(int j = 0; j < puzzle.length; j++)
   { 
     System.out.printf("%3s   ", puzzle[i][j]);
   }  
   System.out.print("|");
   System.out.printf(" %3s", right[i]);
   System.out.println();  
  }
  
  
  
  System.out.println("----------------------------------");
  System.out.print("    |");
  for(int i = 0; i < top.length;i++)
  {
   System.out.printf("%3s   ", bottom[i]);
  }
  System.out.print("|");
 
 }
  
  
  
  
  
  
}//class
