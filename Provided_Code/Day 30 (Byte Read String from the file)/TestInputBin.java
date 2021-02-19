import java.io.*;
public class TestInputBin {
 	public static void main(String[] args) {
 		Student stu1 = new Student("", 0, 0.0);
 		Student stu2 = new Student("", 0, 0.0);

 		// open the file for reading
 		final String fName = "data.dat";
      final String F_OUT = "dataOut.dat";
 		DataInputStream dis = null;
      DataOutputStream dos = null;
 		try {
 			FileInputStream fis = new FileInputStream(new File(fName));
         FileOutputStream fos = new FileOutputStream(new File(F_OUT));
 			dis = new DataInputStream(fis);
         dos = new DataOutputStream(fos);
 		}
 		catch(IOException ioe) {
 			System.out.println("Error opening file: " + ioe);
 			System.exit(1);
 		}

 		try {
 			// read in stu1
 			stu1.setName(dis.readUTF());
 			stu1.setId(dis.readInt());
 			stu1.setGPA(dis.readDouble());
         
         dos.writeUTF(stu1.getName());
         dos.writeInt(stu1.getId());
         dos.writeDouble(stu1.getGPA());

 			// read in stu2
 			stu2.setName(dis.readUTF());
 			stu2.setId(dis.readInt());
 			stu2.setGPA(dis.readDouble());
         
         dos.writeUTF(stu2.getName());
         dos.writeInt(stu2.getId());
         dos.writeDouble(stu2.getGPA());
 		}
 		catch(IOException ioe) {
 			System.out.println("Error reading file: " + ioe);
 			System.exit(1);
 		}

 		// Close the file
 		try {
 			dis.close();
 		}
 		catch(IOException ioe) {
 			System.out.println("Error closing file: " + ioe);
 			System.exit(1);
 		}

 		// Print out results
 		System.out.println(stu1 + "\n\n" + stu2);
 	}
}
