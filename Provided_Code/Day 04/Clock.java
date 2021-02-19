/**
 * This is a program about clocks
 * @author Yanshen Lin
 * @version 1.0
 */
 
public class Clock
{
  private int hour;
  private int minute;
  private String amPm;
  
  public static void main(String[] args)
  {
   Clock myClock = new Clock(10, 25, "AM");
   myClock.print();
   //myClock.clear()
   //Clock myClock2 = new Clock(12, 00, "AM");
   myClock.clear(12, 00, "AM");
  }
  
  public Clock(int _hour, int _minute, String _amPm)
  {
   hour = _hour;
   minute = _minute;
   amPm = _amPm;
  }
  
  public void print()
  {
   System.out.println(hour + ":" + minute + " " +amPm); 
  }
  
  public void clear(int inHour, int inMinute, String inAmPm)
  {
   System.out.println("The clock after clear is " + inHour + ":" + inMinute + " " + inAmPm);
  }
  
    
}//class