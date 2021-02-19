public class PowerBoat extends Boat
{
 private int engineSize;
 
 public PowerBoat()
 {
  super();
  engineSize = 5;
 }
 
 public PowerBoat(String color, int length, int engineSize)
 {
  super(color, length);
  setEngineSize(engineSize);
 }
 
 public boolean setEngineSize(int engineSize)
 {
  if(engineSize >= 5 && engineSize <=350)
  {
   this.engineSize = engineSize;
   return true;
  }
  else
  {
   return false;
  }
 }
 
 public int getEngineSize()
 {
  return engineSize;
 }
 
 public double calcPrice()
 {
  return 5000 + length * 300 + engineSize * 20;
 }
 
 public String toString()
 {
  return super.toString() + "Engine Size = " + String.format("%-10s", getEngineSize())
  + " Cost = $ " + String.format("%,.2f", calcPrice());
 }
}//class