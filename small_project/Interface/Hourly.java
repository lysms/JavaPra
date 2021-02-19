public class Hourly implements Company
{
 private String name;
 private String ssn;
 private double avgHoursPerWeek;
 private double hourlyRate;
 

 
 int hours = 40;
 double overtime = 1.5;
 
 public String getName()
 {
  return name;
 }
 
 public String getSsn()
 {
  return ssn;
 }
 
 public double getAvgHoursPerWeek()
 {
  return avgHoursPerWeek;
 }

 public double getHourlyRate()
 {
  return hourlyRate;
 }
 
 public void setName(String name)
 {
  this.name = name;
 }
 
 public void setSsn(String ssn)
 {
  this.ssn = ssn;
 }
 
 public void setAvgHoursPerWeek(double avgHoursPerWeek)
 {
  this.avgHoursPerWeek = avgHoursPerWeek;
 }
 
 
 
 public void setPay(double hourlyRate)
 {
  this.hourlyRate = hourlyRate;
 }
 
 
 public double calcAnnualPay()
 {
  return hourlyRate * hours * weekPaid;
 }
 
 
 
 public double calcWeeklyPay()
 {
  if(avgHoursPerWeek <= hours)
  {
   double avg = avgHoursPerWeek * hourlyRate;
   String rate = String.format("%.2f", avg);
   return Double.parseDouble(rate);
  }
  else
  {
   double weeklyPay = (hours * hourlyRate) + ((avgHoursPerWeek - hours) * hourlyRate * overtime);
   String pay = String.format("%.2f", weeklyPay);
   return Double.parseDouble(pay);
  }
 }
 
 
 public String toString()
 {
    return "\nName: " + getName()
         + "\nSSN:  " + getSsn() 
         + "\n\t\tAverage Hours worked: " + String.format("%15s", getAvgHoursPerWeek())
         + "\n\t\tHourly rate:             $ " + String.format("%10s", getHourlyRate())
         + "\n\t\tAverage Weekly Pay:      $ " + String.format("%10s", calcWeeklyPay())
         + "\n\t\tAverage Annual Pay:      $ " + String.format("%10s", calcAnnualPay());
 }
 

}//class