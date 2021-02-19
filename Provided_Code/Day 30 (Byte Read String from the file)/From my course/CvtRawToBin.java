import java.util.*;
import java.io.*;

/**
 * Class CvtRawToBin - a class to read the text data in HockeyRaw.txt and
 * convert it to binary in Hockey.dat.
 * Each line in HockeyRaw.txt is delimited by commas, 8 fields per line:
 *    name, number, height, weight, dateofbirth, placeofbirth
 *    height appears as 2 number separated by a space, ft. and inches
 *    place of birth is actually 3 fields, city, state/prov, country
 * @author Pete Lutz
 * @version 9-22-2017
 */
public class CvtRawToBin {
   public static void main(String[] args) {
      /* Open the input file as a Scanner */
      final String inputName = "HockeyRaw.txt";
      Scanner in = null;
      try {
         in = new Scanner(new FileReader(new File(inputName)));
      }
      catch(IOException ioe) { 
         System.out.println("Cannot open input file: " + ioe);
         System.exit(1);
      }

      
      /* Open the output file as a DataOutputStream */
      final String outputName = "Hockey.dat";
      DataOutputStream dos = null;
      try {
         dos = new DataOutputStream(new FileOutputStream(new File(outputName)));
      }
      catch(IOException ioe) { 
         System.out.println("Cannot open output file: " + ioe);
         System.exit(1);
      }
      
      /* Read the input 1 line at a time */
      int lineNo = 1;
      while(in.hasNextLine()) {
         String line = in.nextLine();
         
         // Separate into fields
         String[] field = line.split(",");
         if(field.length != 8 && field.length != 7) {
            System.out.println("Wrong # of fields, line " + lineNo + "\n<" + line + ">");
            System.exit(1);
         }
         
         try {
            // Get name & number
            String name = field[0];
            dos.writeUTF(name);
            int number = Integer.parseInt(field[1]);
            dos.writeInt(number);
            
            // Get height in ft and in and convert to just in
            String[] part = field[2].split(" ");
            if(part.length != 2) {
               System.out.println("Improper height, line " + lineNo + "\n<" + field[2] + ">");
               System.exit(1);
            }
            int height = Integer.parseInt(part[0]) * 12 + Integer.parseInt(part[1]);
            dos.writeInt(height);
            
            // Get weight
            double weight = (double) Integer.parseInt(field[3]);
            dos.writeDouble(weight);
            
            // Get DOB ... appears as day-month-year
            part = field[4].split("-");
            if(part.length != 3) {
               System.out.println("Improper DOB, line " + lineNo + "\n<" + field[4] + ">");
               System.exit(1);
            }
            final String monthStr = "JanFebMarAprMayJunJulAugSepOctNovDec";
            int pos = monthStr.indexOf(part[1]);
            if(pos < 0) {
               System.out.println("Improper month name, line " + lineNo + "\n<" + field[4] + ">");
               System.exit(1);
            }
            int mon = pos / 3 + 1;
            GregorianCalendar dob = 
                  new GregorianCalendar(1900 + Integer.parseInt(part[2]), mon, Integer.parseInt(part[0]));
            dos.writeLong(dob.getTimeInMillis());
            
            // Get place of birth
            String place;
            if(field.length == 8) {
               place = field[5] + field[6] + field[7];
            }
            else {
               place = field[5] + " " + field[6];
            }
            dos.writeUTF(place);
         }
         catch(IOException ioe) {
            System.out.println("IOException: line " + lineNo + " " + ioe);
            System.exit(1);
         }
      }
   }
}