import java.io.*;

/**
 * Class TestOutputBin - class to test writing binary data for students
 * to a file.
 * @author Pete Lutz
 * @version 9-22-2017
 */
import java.io.*;
public class TestOutputBin {
 	public static void main(String[] args) {
 		Student stu1 = new Student("George Brown", 24680, 3.4);
 		Student stu2 = new Student("Ralph Smith", 12345, 4.0);

 		// Open the file
      final String fName = "data.dat";
  		DataOutputStream dos = null;
      try {
         FileOutputStream fos = new FileOutputStream(new File(fName));
         dos = new DataOutputStream(fos);
      }
      catch(IOException ioe) {
         System.out.println("Error opening file: " + ioe);
         System.exit(1);
      }
 
 		try {
         // write out stu1
    		dos.writeUTF(stu1.getName());
    		dos.writeInt(stu1.getId());
    		dos.writeDouble(stu1.getGPA());

    		// write out stu2
    		dos.writeUTF(stu2.getName());
    		dos.writeInt(stu2.getId());
    		dos.writeDouble(stu2.getGPA());
      }
      catch(IOException ioe) {
         System.out.println("Error writing file: " + ioe);
         System.exit(1);
      }

      // close the file
 		try {
         dos.close();
      }
      catch(IOException ioe) {
         System.out.println("Error closing file: " + ioe);
         System.exit(1);
      }
 	}
}
