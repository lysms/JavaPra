import java.util.*;
import java.io.*;

/**
 * Class UpperCaseFixed
 * Main program to copy one file to another converting all characters to upper case
 * Fixed to handle exceptions
 * @author Pete Lutz
 * @version 9-20-2017
 */
public class UpperCase {
   public static void main(String[] args) throws Exception {
      // Check for 2 arguments
      if(args.length != 2) {
         System.out.println("There must be two arguments!");
         System.exit(1);
      }
      
      // Get file names
      String fNameIn = args[0];
      String fNameOut = args[1];
      
      // Open the files
      Scanner fIn = new Scanner(new FileReader(new File(fNameIn)));
      PrintWriter fOut = new PrintWriter(new FileWriter(new File(fNameOut)));
            
      // Copy with change to upper case
      while(fIn.hasNextLine()) {
         String line = fIn.nextLine();
         line = line.toUpperCase();
         fOut.println(line);
      }
      
      // Close files
      fIn.close();
      fOut.close();
   }
}