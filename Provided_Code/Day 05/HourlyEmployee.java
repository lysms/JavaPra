/**
 * This is the student class.
 * @author Yanshen Lin
 * @version 1.0
 */
public class HourlyEmployee
{
 //attributes
 private String lastName;
 private String firstName;
 private int hoursWorkedLastWeek;
 private int hoursWorkedYTD;
 private int hourlyRate;
 private int weeklyPay;
 private int YTDPay;
 
 public HourlyEmployee(String inLastName, String inFirstName, int inHoursWorkedLastWeek, int inHoursWorkedYTD, int inHourlyRate)
 {
  lastName = inLastName;
  firstName = inFirstName;
  hoursWorkedLastWeek = inHoursWorkedLastWeek;
  hoursWorkedYTD = inHoursWorkedYTD;
  hourlyRate = inHourlyRate;
  weeklyPay = hoursWorkedLastWeek * hourlyRate;
  YTDPay = hoursWorkedYTD * hourlyRate;

  
 }//constructors
 
 //accessors
 public String getLastName()
 { 
  return lastName;
 }
 
 public String getFirstName()
 {
  return firstName;
 }
 
 public int getHoursWorkedLastWeek()
 {
  return hoursWorkedLastWeek;
 }
 
 public int getHoursWorkedYTD()
 {
  return hoursWorkedYTD;
 }
 
 public int getHourlyRate()
 {
  return hourlyRate;
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
 
 public void setHoursWorkedLastWeek(int inHoursWorkedLastWeek)
 {
  hoursWorkedLastWeek = inHoursWorkedLastWeek;
 }
 
 public void setHoursWorkedYTD(int inHoursWorkedYTD)
 {
  hoursWorkedYTD = inHoursWorkedYTD;
 }
 
 public void setHourlyRate(int inHourlyRate)
 {
  hourlyRate = inHourlyRate;
 }
 
 public int getWeeklyPay()
 {
  return weeklyPay;
 }
 
 public int getYTDPay()
 {
  return YTDPay;
 }
 
 public String toString()
 {
  return "This is from toString() in employee:" + lastName + " " + firstName + "," + "his last week worked hours are " + hoursWorkedLastWeek + "," + "his YTD worked hours are " + hoursWorkedYTD + "," + "The hourly rate is " + hourlyRate + "," +  "weekly pay is " + weeklyPay + "," + "YTD pay is " + YTDPay;
 }
 
 public String printCheck()
 {
  return "This is from toString() in employee:" + lastName + " " + firstName + "," + "his last week worked hours are " + hoursWorkedLastWeek + "," + "his YTD worked hours are " + hoursWorkedYTD + "," + "The hourly rate is " + hourlyRate + "," +  "weekly pay is " + weeklyPay + "," + "YTD pay is " + YTDPay;
 }


 
 
 
 
 
 
}//class