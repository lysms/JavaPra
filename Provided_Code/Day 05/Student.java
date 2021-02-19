/**
 * This is the student class.
 * @author Yanshen Lin
 * @version 1.0
 */
public class Student
{
 // attributes of a Student
 private String firstName;
 private String lastName;
 private int studentId;
 private double gpa;
 
 //constructors
 public Student(String inFirstName, String inLastName, int inStudentId, double inGpa)
 {
  firstName = inFirstName;
  lastName = inLastName;
  studentId = inStudentId;
  gpa = inGpa;
 } //constructors
 
 // accessors
 public String getFirstName()
 {
  return firstName;
 }
 
 public String getLastName()
 {
  return lastName;
 }
 
 public int getStudentId()
 {
  return studentId;
 }
 
 public double getGpa()
 {
  return gpa;
 }
 
 // mutators
 public void setFirstName(String inFirstName)
 {
  firstName = inFirstName;
 }
 
 public void setLastName(String inLastName)
 {
  lastName = inLastName;
 }
 
 public void setStudentId(int inStudentId)
 {
  studentId = inStudentId;
 }
 
 public void setGpa(double inGpa)
 {
  gpa = inGpa;
 }
 
 public String toString()
 {
  return "This is from toString() in student " + firstName + " " + lastName + " " + studentId + " " + gpa;
 }  
 
 
 
 
}// class
  
 