public class TestStudent
{
 public static void main(String[] args)
 {
  Student stu1 = new Student("Fred", "Smith", 117834, 3.4);
  Student stu2 = new Student("Mary", "Brown", 887234, 2.8);
  
  System.out.println("Student: " + stu1.getFirstName() + " " +stu1.getLastName() + " " + stu1.getStudentId() + " " + stu1.getGpa());
  System.out.println("Student: " + stu2.getFirstName() + " " +stu2.getLastName() + " " + stu2.getStudentId() + " " + stu2.getGpa());
  
  stu1.setGpa(3.6);
  stu1.setStudentId(449234);
  
  System.out.println("Aftet changing stu1");
  System.out.println("Student: " + stu1.getFirstName() + " " +stu1.getLastName() + " " + stu1.getStudentId() + " " + stu1.getGpa());
  
  System.out.println(stu1.toString());
  System.out.println(stu2.toString()); 
 }//main
 
}//TestSudent class

  