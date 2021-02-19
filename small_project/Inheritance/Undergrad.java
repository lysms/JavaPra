/**
 * Undergrad
 * subclass of Student
 *
 * @author Yanshen Lin
 * @version 11/12/2019
 * Homework 11
 */
public class Undergrad extends Student
{
 private int yearLevel;
 
/**
 * parameterized constructor
 *@param name  the student name from the super class
 *@param id    the id number from the super class
 *@param numberCredits   number of credits from the super class
 *@param yearLevel  the year level for student
 *
 *call the super class and declare the parameter
 *use the mutators to set the yearLevel
 */
 public Undergrad(String name, String id, int numCredits, int yearLevel)
 {
  super(name, id, numCredits);
  setYearLevel(yearLevel);
 } 
 
//accessor
 public int getYearLevel()
 { 
  return yearLevel;
 }
 
//mutator
 public void setYearLevel(int yearLevel)
 {
  this.yearLevel = yearLevel;
 }
 
/**
 * calcTuition method
 * this method is use to calculate the tuition 
 * This is override the calcTuition method in the super class
 *@return the tuition fee
 */
 public double calcTuition()
 {
  return numCredits * 517;
 }
 
/**
 * toString method
 *@return the output with the toString method in the super class
 *@return the year level and tuition fee
 */
 
 public String toString()
 {
  return "UnderGrad Student: " + "\n" + super.toString() + "\n\t\tYear Level: " 
  + String.format("%8s", getYearLevel()) 
  + "\n\t\tTuition: " 
  + String.format("%18s" ,String.format("$%.2f", calcTuition()));
 }
 
  
 
 
 
 
}//class