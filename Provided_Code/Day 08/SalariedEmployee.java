public class SalariedEmployee
{
 private String lastName;
 private String firstName;
 private double yearlySalary;
 private double perPeriodPay;
 private double YTDPay;
 public static int periodPerYear = 24;
 
 public SalariedEmployee(String inLastName, String inFirstName, double inYearlySalary)
 {
  lastName = inLastName;
  firstName = inFirstName;
  yearlySalary  = inYearlySalary;
   
 }//constructors
 
 //accesstor
 
 public String getLastName()
 {
  return lastName;
 }
 
 public String getFirstName()
 {
  return firstName;
 }
 
 public double getYearlySalary()
 {
  return yearlySalary;
 }
 
 //mutators
 
 public void setLastName(String inLastName)
 {
  lastName = inLastName;
 }
 
 public void setFirstName(String inFirstName)
 {
  firstName = inFirstName;
 }
 
 public void setYearlySalary(double inYearlySalary)
 {
  yearlySalary = inYearlySalary;
 }
 
 public double getPerPeriodPay()
 {
  return yearlySalary / periodPerYear;   
 }
 
 public double getYTDPay(int period)
 {
  return period * getPerPeriodPay();
 }
 
 public String toString()
 {
  return "toString for: " + lastName + " " + firstName + "Salary: " + yearlySalary + " " + "Pay per period: " + getPerPeriodPay();
 }
 
 public void printStub(int period)
 {
  System.out.printf("\nACME CORPORATION" + "\nPay stub for " + lastName + " " + firstName + "for period " + period + " " + "\nAmount: " + yearlySalary/period + " \nYTD Pay: " + period*getPerPeriodPay());
 } 
  
 
 
 
}//class
 