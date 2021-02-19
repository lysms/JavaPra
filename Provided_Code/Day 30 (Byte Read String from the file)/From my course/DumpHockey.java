import java.util.*;
import java.io.*;

/**
 * Class DumpHockey - a class to read the binary data in Hockey.dat and
 * convert it to text and print it to check Hockey.dat was converted properly.
 * Each record in Hockey.dat cotains:
 *    name - UTF, number - int, height - int, weight - double
 *    dateofbirth - millis, placeofbirth - UTF
 * @author Pete Lutz
 * @version 9-22-2017
 */
public class DumpHockey {
   public static void main(String[] args) {
      // Open input file
      DataInputStream dis = null;
      final String fileName = "Hockey.dat";
      try {
         dis = new DataInputStream(new FileInputStream(new File(fileName)));
      }
      catch(IOException ioe) { 
         System.out.println("Cannot open input file: " + ioe);
         System.exit(1);
      }
      
      while(true) {
         try {
            String name = dis.readUTF();
            int number = dis.readInt();
            int height = dis.readInt();
            double weight = dis.readDouble();
            long dobMillis = dis.readLong();
            Date dob = new Date(dobMillis);
            String place = dis.readUTF();
            
            System.out.printf("%-20.20s %3d %3d %6.2f %s %s\n",
               name, number, height, weight, dob.toString(), place);
         }
         catch(EOFException eofe) {
            break;
         }
         catch(IOException ioe) {
            System.out.println("IOException reading file: " + ioe);
            System.exit(1);
         }
      }
   }
}