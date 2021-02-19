/**
 * Class to test out the Student class
 * @author Pete Lutz
 * @version 1.0
 */
public class TestStudent {
	public static void main(String[] args) {
      // Create two students
		Student stu1 = new Student("Fred", "Smith", 117834, 3.4);
		Student stu2 = new Student("Mary", "Brown", 887234, 2.8);

      // print out student 1
		System.out.println("Student: " + 
			stu1.getFirstName() + " " + stu1.getLastName() + " " +
			stu1.getStudentId() + " " + stu1.getGpa());
//   		System.out.println("Student: " + 
// 			stu1.firstName + " " + stu1.lastName + " " +
// 			stu1.studentId + " " + stu1.gpa);
      
//       // Call myMethod
//       stu1.myMethod();
//       System.out.println("stu1 last name: " + stu1.getLastName());

      // Call myMethod
      stu1.myMethod("");
      System.out.println("stu1 last name: " + stu1.getLastName());
               
      // print out student 2
		System.out.println("Student: " + 
			stu2.getFirstName() + " " + stu2.getLastName() + " " +
			stu2.getStudentId() + " " + stu2.getGpa());
      
      // change the GPA and ID of student 1
		stu1.setGpa(3.6);
		stu1.setStudentId(449234);
      
      // print out the changed student 1
		System.out.println("After changing stu1");
		System.out.println("Student: " + 
			stu1.getFirstName() + " " + stu1.getLastName() + " " +
			stu1.getStudentId() + " " + stu1.getGpa());
	}
}
