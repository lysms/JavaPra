public class SailBoat extends Boat
{
 private int numSails;
 
 public SailBoat()
 {
  numSails = 1;
 }
 
 public SailBoat(String color, int length, int numSails)
 {
  super(color, length);
  setNumSails(numSails);
 }
 
 public boolean setNumSails(int numSails)
 {
  if(numSails <= 4)
  {
   this.numSails = numSails;
   return true;
  }
  else
  {
   return false;
  }
  
 }
 
 
 public int getNumSails()
 {
  return numSails;
 }
 
 public double calcPrice()
 {
  return length * 1000 + numSails * 2000;
 }
 
 public String toString()
 {
  return super.toString() + "Number Sails = " 
  + String.format("%-10s", getNumSails()) 
  + "Cost = $ " + String.format("%,.2f", calcPrice());
 }
 
}//class