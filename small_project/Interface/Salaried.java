public class Salaried implements Company
{
 private String name;
 private String ssn;
 private double annualSalary;
 
 double health = 125.50;
 
 public String getName()
 {
  return name;
 }
 
 public String getSsn()
 {
  return ssn;
 }
 
 
 public void setName(String name)
 {
  this.name = name;
 }
 
 public void setSsn(String ssn)
 {
  this.ssn = ssn;
 }
 
 public void setPay(double salary)
 {
  annualSalary = salary;
 }
 
 
 
 public double calcAnnualPay()
 {
  double pay = (double)annualSalary - (weekPaid * health);
  return pay;
 }
 
 public double calcWeeklyPay()
 {
  double weeklyPay = (annualSalary / weekPaid) - health;
  String pay = String.format("%.2f", weeklyPay);   
  return Double.parseDouble(pay);
 }
 
 public String toString()
 {
  return   "\nName:  " + getName()
         + "\nSSN:   " + getSsn() 
         + "\n\t\tAnnual salary:   $ " + String.format("%10s",annualSalary)
         + "\n\t\tAnnual Pay:      $ " + String.format("%10s",calcAnnualPay())
         + "\n\t\tWeekly Pay:      $ " + String.format("%10s",calcWeeklyPay());
 }
}//class