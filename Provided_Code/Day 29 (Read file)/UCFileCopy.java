/**
 *copy a file to other file, the computer will automatically creat a copy file. 
 *Just need to declare the name in argumentline
 */
import java.io.*;
import java.util.*;

public class UCFileCopy
{
 public static void main(String[] args) throws Exception
 {
  
  if(args.length != 2)
  {
   System.out.println("Two filenames are needed");
   System.exit(1);
  }
  
  String inFileName = args[0];
  String outFileName = args[1];
  
  
  Scanner fIn = null;
  PrintWriter fOut = null;
  
  
  try
  {
   fIn = new Scanner(new FileReader(new File(inFileName)));
   fOut = new PrintWriter(new FileWriter(new File(outFileName)));
  }
  catch (FileNotFoundException fnfe) //File not found exception
  {
   System.out.println(fnfe);
   fnfe.printStackTrace();
   System.exit(1);
  }
  catch (IOException ioe)// IO exception
  {
   System.out.println(ioe);
   ioe.printStackTrace();
   System.exit(1);
  }
  catch (Exception e)// Exception
  {
   System.out.println(e);
   e.printStackTrace();
   System.exit(1);
  }
  
  
  
  while(fIn.hasNextLine())
  {
   String line = fIn.nextLine();
   line = line.toUpperCase();
   fOut.println(line);
  }
  
  System.out.println("\nThe end is reached");
  
  
  
  fIn.close();
  fOut.close();
  
  
  
  
  
 }//main method
 
 
 
}//class