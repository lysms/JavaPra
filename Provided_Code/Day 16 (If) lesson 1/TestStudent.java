/**
 * Class to test out the Student class
 * @author Pete Lutz
 * @version 1.0
 */
public class TestStudent {
	public static void main(String[] args) {
      // Create two students
		Student stu1 = new Student("Fred", "Smith", 11783, 3.4);
		Student stu2 = new Student("Mary", "Brown", 88723, 2.8);

      // print out student 1
		System.out.println("Student: " + 
			stu1.getFirstName() + " " + stu1.getLastName() + " " +
			stu1.getStudentId() + " " + stu1.getGpa());
         
      // print out student 2
		System.out.println("Student: " + 
			stu2.getFirstName() + " " + stu2.getLastName() + " " +
			stu2.getStudentId() + " " + stu2.getGpa());
      
      // change the GPA and ID of student 1
		if(stu1.setGpa(3.6) == false)
      {
       System.out.println("Please enter a gpa between 0.0 to 4.0");
      }

      
      if(stu1.setStudentId(449234) == false)
      {
       System.out.println("Please enter a shorten id to at most 5 digits");
      }

       
      
      // print out the changed student 1
		System.out.println("After changing stu1");
		System.out.println("Student: " + 
			stu1.getFirstName() + " " + stu1.getLastName() + " " +
			stu1.getStudentId() + " " + stu1.getGpa());
	}
}
