import java.util.*;
import java.io.*;
public class Copy
{
 public static void main(String[] args) throws Exception
 {
  
  int charRead = -1;
  
  if(args.length != 3)
  {
   System.out.println("There must be three arguments!");
   System.exit(0);
  }
  
  String Input_filename = args[0];
  String Output_filename = args[1];
  String letter = args[2];
  
  FileReader fRead = null;
  FileWriter fWrite = null;
  
  try
  {
   fRead = new FileReader(new File(Input_filename));
   fWrite = new FileWriter(new File(Output_filename));
  }
  catch(FileNotFoundException fnfe)
  {
   System.out.println(fnfe);
   System.out.println("Input Fille not found");
   System.exit(0);
  }
  catch(IOException ioe)
  {
   System.out.println(ioe);
   System.exit(0);   
  }
  catch(Exception e)
  {
   System.out.println(e);
   System.exit(0);   
  }
  
  while((charRead = fRead.read()) != -1)
  { 
   fWrite.write(charRead);
  }

  fRead.close();
  fWrite.close();
  
  
  Scanner fOut = new Scanner(new FileReader(new File(Output_filename)));
  Scanner fIn = new Scanner(new FileReader(new File(Output_filename)));  
  
  if(letter.equals("r"))
  {
   for(int i = 0; i < 3; i++)
   {
    String line = fOut.nextLine();
    System.out.println(line);
   }
   fOut.close();
  }
  
  if(letter.equals("a"))
  {
   for(int i = 0; i < 3; i++)
   {
    String line = fOut.nextLine();
    System.out.println(line);
   }
   fOut.close();
   
   for(int i = 0; i < 3; i++)
   {
    String line = fIn.nextLine();
    System.out.println(line);
   }
   fIn.close();
  }
  
  
  
  
  
  
  
 }//main method
 
}//class