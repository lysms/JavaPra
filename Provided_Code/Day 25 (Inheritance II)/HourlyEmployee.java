/**
 * SalariedEmployee
 * Class to model a salaried employee with a yearly
 * salary instead of an hourly pay rate.
 *
 * @author Pete Lutz
 * @version 9-14-2017
 */
public class HourlyEmployee extends Employee {
   private double payRate;
    
   /**
    * Constructor for SalariedEmployee
    *
    * @param _lastName the employee's last name
    * @param _firstName the employee's first name
    * @param _payRate the employee's hourly pay rate
    */
   public HourlyEmployee(String _firstName, String _lastName, double _payRate)
   {
      super(_firstName, _lastName);  // Pass firstName and lastName to super class
      payRate = _payRate;
   }
       
   /* Accessors */
   /* getFirstName and getLastName inherited from Employee */
   public double getPayRate() { 
      return payRate; }
      
   /* Mutators */
   /* setFirstName and setLastName inherited from Employee */    
    //mutator for payRate 
   public void setPayRate(double _payRate) { payRate = _payRate; }
   
   /**
    * getWeeklyPay
    * Virtual Accessor to retrieve the hourly pay, given the # of hours worked.
    */
   public double getWeeklyPay(double hoursWorked) { return hoursWorked * getPayRate(); }
    
   /* toString ... return a printable string for this employee 
      This toString OVERRIDES the toString in Employee for any HourlyEmployee */
   public String toString() { 
      return super.toString() + String.format(" Hourly Rate: " + getPayRate());
   }
   
      
   /* printStub - print a pay stub for the employee 
      This method is an ADDITIONAL method for HourlyEmployee */
   public void printStub(double hoursWorked) {
      System.out.printf("ACME CORPORATION\n" +
         "Pay stub for " + getFirstName() + " " + getLastName() + "\n" +
         "Amount:  %9.2f\n     = Hourly Rate: %6.2f X Hours Worked: %6.2f\n", 
         getWeeklyPay(hoursWorked), getPayRate(), hoursWorked);
   }
}
