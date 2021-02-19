/**
 * SalariedEmployee
 * Class to model a salaried employee with a yearly
 * salary instead of an hourly pay rate.
 *
 * @author Pete Lutz
 * @version 9-14-2017
 */
public class SalariedEmployee extends Employee {
   private double yearlySalary;
   public static int periodsPerYear = 24;
   
   /**
    * Constructor for SalariedEmployee
    *
    * @param _lastName the employee's last name
    * @param _firstName the employee's first name
    * @param _yearlySalary the employee's salary
    */
   public SalariedEmployee(String _firstName, String _lastName,  double _yearlySalary) {
         super(_firstName, _lastName); // pass firstName and lastName to super class
         yearlySalary = _yearlySalary;
   }
   
   /* Accessors */
   /* getFirstName and getLastName inherited from Employee */
   public double getSalary() { return yearlySalary; }
   
   /* Mutators */
   /* setFirstName and setLastName inherited from Employee */
   public void setSalary(double _yearlySalary) { yearlySalary = _yearlySalary; }
   
   /**
    * getPerPeriodPay (ADDITIONAL method)
    * virtual accessor ... returns salary / 24 presuming 24 periods per year
    */
   public double getPerPeriodPay() { return getSalary() / periodsPerYear; }
   
   /**
    * getYTDPay (ADDITIONAL method)
    * virtual accessor ... returns amount paid as of the given period
    */
   public double getYTDPay(int period) { return getPerPeriodPay() * period; }
   
   /* toString ... return a printable string for this employee 
      This toString OVERRIDES the toString in Employee for any SalariedEmployee */
   public String toString() { 
      return super.toString() + String.format(" Salary: " + yearlySalary + 
         " Pay per period: %9.2f", getPerPeriodPay());
   }
   
   /* printStub - print a pay stub for the employee 
      This method is an ADDITIONAL method for SalariedEmployees */
   public void printStub(int period) {
      System.out.printf("ACME CORPORATION\n" +
         "Pay stub for " + getFirstName() + " " + getLastName() + " for period " + period + "\n" +
         "Amount:  %9.2f\nYTD Pay: %9.2f\n", getPerPeriodPay(), getYTDPay(period));
   }
}
         