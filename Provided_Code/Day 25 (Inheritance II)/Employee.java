/**
 * Employee
 * Super class to model any type of employee 
 *
 * @author Pete Lutz
 * @version 9-14-2017
 */
public class Employee {
   private String firstName;
   private String lastName;

   /**
    * Constructor for Employee
    *
    * @param _lastName the employee's last name
    * @param _firstName the employee's first name
    */  
   public Employee(String _firstName, String _lastName) {
      firstName = _firstName;
      lastName = _lastName;
   }
   
   /* Accessors */
   public String getLastName() { return lastName; }
   public String getFirstName() { return firstName; }

   /* Mutators */
   public void setLastName(String _lastName) { lastName = _lastName; }
   public void setFirstName(String _firstName) { firstName = _firstName; }
   
   /* toString ... return a printable string for this employee */
   public String toString() { 
      return firstName + " " + lastName;
   }
}