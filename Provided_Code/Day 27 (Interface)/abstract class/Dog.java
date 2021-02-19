public class Dog extends Animal
{
 
 private String sound;
 
 
 public Dog(String _name, String _sound)
 {
  super(_name);
  sound = _sound;
 }
 
 
 public String getSound()
 {
  return sound; 
 }
 
}//class