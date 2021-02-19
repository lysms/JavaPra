public class TimeInterval
{
 private int firstTime;
 private int secondTime;
 private int hours;
 private int minutes;
 private double decimalTime;
 
 public TimeInterval(int _firstTime, int _secondTime)
 {
  firstTime = _firstTime;
  secondTime = _secondTime;
  
  if(firstTime > 2400 || firstTime < 0000 || secondTime > 2400 || secondTime < 0000)
  {
   System.out.println("This is an error, Please enter an valid time");
   System.exit(0);
  }
  
 
 }//constructor
 
 public int getHours(int _hours)
 {
  hours = _hours;
  return hours;
 }
 
 public int getMinutes(int _minutes)
 {
  minutes = _minutes;
  return minutes;
 }
 
 public double getDecimalTime(double _decimalTime)
 {
  decimalTime = _decimalTime;
  return decimalTime;
 }
}//class