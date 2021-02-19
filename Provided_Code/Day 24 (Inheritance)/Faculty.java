import java.util.*;
public class Faculty extends Person
{
 private ArrayList<String> courses;
 
 
 public Faculty(String inName, String inAddress, String inPhone, String inCourse)
 {
  super(inName, inAddress, inPhone);
  courses = new ArrayList<String>();
  courses.add(inCourse);
 }
 
 public String toString()
 { 
  String output = super.toString();
  output = output + " " + courses.get(0);
  return output;
 }
 
}