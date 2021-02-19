public class Boat
{
 private String color;
 int length;
 
 public Boat()
 {
  color = "white";
  length = 20;
 }
 
 public Boat(String color, int length)
 {
  setColor(color);
  setLength(length);
 }
 
 public boolean setColor(String color)
 {
  switch(color)
  {
   case "white":
   case "red":
   case "blue":
   case "yellow":
      this.color = color;
      return true;
   default:
      return false;
  } 
 }
 
 public String getColor()
 { 
  return color;
 }
 
 public boolean setLength(int length)
 {
  if(length <= 50 && length >= 20)
  {
   this.length = length;
   return true;
  }
  else
  {
   this.length = 20;
   return false;
  }
 }
 
 public int getLength()
 {
  return length;
 }
 
 public String toString()
 {
  return "Color = " + String.format("%-10s", getColor()) + "Length = " 
  + String.format("%-10s", getLength());
 }
 
 
 
 
 
 
 
 
}//class