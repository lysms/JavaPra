/**
 * Class Student - data about one student
 * @author Pete Lutz
 * @version 9-22-2017
 */
public class Student {
   private String name;
   private int id;
   private double gpa;
   
   // Constructor
   public Student(String _name, int _id, double _gpa) {
      name = _name;
      id = _id;
      gpa = _gpa;
   }
   
   // Accessors
   public String getName() { return name; }
   public int getId() { return id; }
   public double getGPA() { return gpa; }
   
   // Mutators
   public void setName(String _name) { name = _name; }
   public void setId(int _id) { id = _id; }
   public void setGPA(double _gpa) { gpa = _gpa; }
   
   // toString
   public String toString() {
      return String.format("%-10.10s  %8d %7.2f", name, id, gpa);
   }
}