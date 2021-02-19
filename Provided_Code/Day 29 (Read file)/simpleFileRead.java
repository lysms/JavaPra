import java.io.*;
import java.util.*;
public class simpleFileRead
{
 public static void main(String[] args) throws Exception
 {
 
  System.out.print("Enter a filename: ");
  
  Scanner in = new Scanner(System.in);
  String fileName = in.nextLine();
  
  Scanner fIn = new Scanner(new FileReader(new File(fileName)));
  
  while(fIn.hasNextLine())
  {
   String line = fIn.nextLine();
   System.out.println(line);
  }
  
  System.out.println("\nThe end is reached");
  
  fIn.close();
  
  
  
  
  
  
 }//main method
 
}//class