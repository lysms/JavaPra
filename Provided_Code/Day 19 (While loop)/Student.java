public class Student
{
 private String name;
 private int id;
 private double sumGrades;
 private double numGrades;
 
 
 public Student(String _name, int _id)
 {
  name = _name;
  id = _id;
  sumGrades = 0;
  numGrades = 0;
  
 }//constructors
 
 public void addGrade(int newGrade)
 {
  sumGrades = sumGrades + newGrade;
  numGrades = numGrades + 1;
 }
 
 public double getAverage()
 {
  double average = sumGrades / numGrades;
  return average;
 }
 
 public String toString()
 {
  return " " + String.format("%10s", name) + " " + String.format("%5d",id) + " " + String.format("%7.2f",getAverage());
 }//toString method
  
 
}//class