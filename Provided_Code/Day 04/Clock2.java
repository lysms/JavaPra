/**
 * This is a program about clocks
 * @author Yanshen Lin
 * @version 1.0
 */
 
public class Clock2
{
  private int hour;
  private int minute;
  private String amPm;
  
  public static void main(String[] args)
  {
   Clock2 myClock = new Clock2(10, 52, "AM");
   myClock.print();
   myClock.clear();
   myClock.print();
   
   Clock2 myClock2 = new Clock2(11, 7, "AM");
   myClock2.print();
   
   
   String outString = myClock.toString();
   System.out.println(outString);
   System.out.println(myClock2.toString());
   
   System.out.println("The Hour for clock1 is " + myClock.getHour());
   System.out.println("The Minute for clock1 is " + myClock.getMinute());
   System.out.println("The AMPM for clock1 is " + myClock.getAmPm());
   
   System.out.println("The Hour for clock2 is " + myClock2.getHour()); 
   System.out.println("The Minute for clock2 is " + myClock2.getMinute()); 
   System.out.println("The AMPM for clock2 is " + myClock2.getAmPm());
   
   
   myClock2.setHour(7);
   System.out.println("Hour " + myClock2.getHour());
   
   myClock2.setMinute(30);
   System.out.println("Minute " + myClock2.getMinute());
   
   myClock2.setAmPm("PM");
   System.out.println("AMPM " + myClock2.getAmPm());
  }
  
  public Clock2(int inHour, int inMinute, String inAmPm)
  {
   hour = inHour;
   minute = inMinute;
   amPm = inAmPm;
  }
  
  //Accessor
  
  public int getHour()
  {
   return hour;
  }
  
  public int getMinute()
  {
   return minute;
  }
  
  public String getAmPm()
  {
   return amPm;
  }
  
  // Mutator
  public void setHour(int inHour)
  {
   hour = inHour;
  }
  
  public void setMinute(int inMinute)
  {
   minute = inMinute;
  }
  
  public void setAmPm(String inAmPm)
  {
   amPm = inAmPm;
  }
   
  public void clear()
  {
    hour = 12;
    minute =  0;
    amPm = "AM";
  } //clear
  
  public void print()
  {
   System.out.println(hour + ":" + minute + " " +amPm); 
  }
  
  public String toString()
  {
   return "This is from toString() in Clock2 " + hour + ":" + minute + " " +amPm;
  } 

   
    
}//class