public class Outboard extends Motor
{
 private String type;
 
 public Outboard(String _make, int _year, int _hp, String _type)
 {
  super(_make, _year, _hp);
  type = _type;
 }
 
 public String toString()
 {
  return " Outboard - " + super.toString() + type;
 }
 
 
 
 
 
 
 
 
 
 
 
 
}//class