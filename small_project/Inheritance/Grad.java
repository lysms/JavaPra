/**
 * Grad
 * subclass of Student
 *
 * @author Yanshen Lin
 * @version 11/12/2019
 * Homework 11
 */
public class Grad extends Student
{ 
 private String researchArea;
 
//default constructor
 public Grad()
 {
  super();
  setResearchArea("");
 }
 
//accessor
 public String getResearchArea()
 {
  return researchArea;
 }
 
//mutator
 public void setResearchArea(String researchArea)
 {
  this.researchArea = researchArea;
 }
 
/**
 * calcTuition method
 * this method is use to calculate the tuition 
 * This is override the calcTuition method in the super class
 *@return the tuition fee
 */
 public double calcTuition()
 {
  return numCredits * 713;
 }
/**
 * toString method
 *@return the output with the toString method in the super class
 *@return the research area and tuition fee
 */
 public String toString()
 {
  return "Grad Student: " + "\n" + super.toString() + "\n\t\tResearch Area: " 
  + String.format("%8s", getResearchArea()) 
  + "\n\t\tTuition: " 
  + String.format("%18s" ,String.format("$%.2f", calcTuition()));
 }
 
 
}//class