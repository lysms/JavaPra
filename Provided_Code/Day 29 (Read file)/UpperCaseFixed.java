import java.util.*;
import java.io.*;

/**
 * Class UpperCaseFixed
 * Main program to copy one file to another converting all characters to upper case
 * Fixed to handle exceptions
 * @author Pete Lutz
 * @version 9-20-2017
 */
public class UpperCaseFixed {
   public static void main(String[] args) {
      // Check for 2 arguments
      if(args.length != 2) {
         System.out.println("There must be two arguments!");
         System.exit(1);
      }
      
      // Get file names
      String fNameIn = args[0];
      String fNameOut = args[1];
      
      // Open the files
      Scanner fIn = null;
      PrintWriter fOut = null;
      
      try {
         fIn = new Scanner(new FileReader(new File(fNameIn)));
         fOut = new PrintWriter(new FileWriter(new File(fNameOut)));
      }
//       catch(FileNotFoundException fnfe) {
//          System.out.println(fnfe);
//          System.exit(1);
//       }
//       catch(IOException ioe) {
//          System.out.println(ioe);
//          System.exit(1);
//       }
      catch(Exception e) {
         System.out.println(e);
         System.exit(1);
      }
      
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