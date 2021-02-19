/**
 * Student
 * Super class to model any type of Student
 *
 * @author Yanshen Lin
 * @version 11/12/2019
 * Homework 11
 */
public class Student
{
 private String name;
 private String id;
 int numCredits;

/**
 * Default Constructor for Student
 *
 * Declare the name, id and assign 0 to numCredits
 */
 public Student()
 {
  name = "";
  id = "";
  numCredits = 0;
 }

/**
 * parameterized constructor for Student
 * @param name the student name
 * @param id   the student id number
 * @param numCredits   the number of credits for student
 *
 * call the mutatoes to set the values.
 */ 
 public Student(String name, String id, int numCredits)
 {
  setName(name);
  setId(id);
  setNumCredits(numCredits);
 }
 
//accessors for name
 public String getName()
 {
  return name;
 }

//accessors for id
 public String getId()
 {
  return id;
 }

//accessor for number of credits 
 public int getNumCredits()
 {
  return numCredits;
 }
 
//mutator for name
 public void setName(String name)
 {
  this.name = name;
 }
 
//mutator for id number
 public void setId(String id)
 {
  this.id = id;
 }
 
//mutator for number of credits
 public void setNumCredits(int numCredits)
 {
  this.numCredits = numCredits;
 }
 
/**
 * calcTuition method
 * @return value 0.
 */
 public double calcTuition()
 {
  return 0.0;
 }
 
/**
 * toString method
 * @return the name value, id number and number of credits
 */
 public String toString()
 { 
  return "\t\tName: " + String.format("%14s" , getName()) 
  + "\n\t\tId: " + String.format("%12s", getId()) 
  + "\n\t\tCredits: " + String.format("%12s" , getNumCredits());
 }
 
}//class