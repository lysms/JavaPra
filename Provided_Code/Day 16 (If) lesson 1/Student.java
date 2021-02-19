/**
 * Student class ... model a single student
 * @author Pete Lutz
 * @version 1.0
 */
public class Student {
	// attributes of a Student
	private String firstName;
	private String lastName;
	private int studentId;
	private double gpa;
   
	// NOTE: the methods whose name are the same as the class
	// are called “constructors”. Their job is to initialize the attributes
	// to values passed in as parameters.
	//
	// They do NOT return a result, but have NO return TYPE, not even 'void'
	public Student(String _fName, String _lName, int _id, double _gpa) {
		firstName = _fName;
		lastName = _lName;
		//studentId = _id;
		//gpa = _gpa;
      
      if(setStudentId(_id) == false)
      {
       System.out.println("There is an error");
       System.exit(0);
      }
      else
      {
       studentId = _id;
      }
      
      if(setGpa(_gpa) == false)
      {
       System.out.println("There is an error");
       System.exit(0);
      }
      else
      {
       gpa = _gpa;
      }
           
	}
   
   // Accessor for first name
	public String getFirstName() {
		return firstName;
	}
   
   // Accessor for last name
	public String getLastName() {
		return lastName;
	}
   
   // Accessor for student id
	public int getStudentId() {
		return studentId;
	}
   
   // Accessor for gpa
	public double getGpa() {
		return gpa;
	}

   // Mutator for first name
	public void setFirstName(String _fName) {
		firstName = _fName;
	}
   
   // Mutator for last name
	public void setLastName(String _lastName) {
		lastName = _lastName;
	}
   
   // Mutator for student id
	public boolean setStudentId(int _id) {
   if(_id > 0 && _id < 100000)
   {
		studentId = _id;
      return true;
   }
   else
   {
    return false;
   }
 }

   
   // Mutator for gpa
	public boolean setGpa(double _gpa) {
   if(_gpa >= 0 && _gpa <= 4.0)
   {
		gpa = _gpa;
      return true;
   }
   else
   {
    return false;
   }
	}
}