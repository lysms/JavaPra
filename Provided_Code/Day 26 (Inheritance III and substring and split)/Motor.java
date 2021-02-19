public class Motor
{
 private String make;
 private int year;
 private int hp;
 
 public Motor()
 {
  
 }
 
 public Motor(String _make, int _year, int _hp)
 {
  make = _make;
  year = _year;
  hp = _hp;
 }
 
 public String toString()
 {
  return "Make: " + make + " Year: " + year + " HP: " + hp;
 }
 
 
 
 
 
 
 
 
 
 
 
 
}//class