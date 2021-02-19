public class InboardOutboard extends Motor
{
 private int cylinders;
 
 public InboardOutboard(String _make, int _year, int _hp, int _cylinders)
 {
  super(_make, _year, _hp);
  cylinders = _cylinders;
 }
 
 public String toString()
 {
  return "Inboard/Outboard - " + super.toString() + " Cylinders: " + cylinders;
 }
 
 
 
}//class