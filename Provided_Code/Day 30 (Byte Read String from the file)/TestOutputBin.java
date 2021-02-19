import java.io.*;
public class TestOutputBin {
 	public static void main(String[] args) throws Exception{
 		Student stu1 = new Student("George Brown", 24680, 3.4);
 		Student stu2 = new Student("Ralph Smith", 12345, 4.0);

 		// Open the file
 		final String fName = "data.dat";
 		FileOutputStream fos = new FileOutputStream(new File(fName));
 		DataOutputStream dos = new DataOutputStream(fos);
 
 		// write out stu1
 		dos.writeUTF(stu1.getName());
 		dos.writeInt(stu1.getId());
 		dos.writeDouble(stu1.getGPA());

 		// write out stu2
 		dos.writeUTF(stu2.getName());
 		dos.writeInt(stu2.getId());
 		dos.writeDouble(stu2.getGPA());

      // close the file
 		dos.close();
 	}
}
