import java.awt.*;
public class Controller
{
 public static void main(String[] args) throws Exception{
 
  new Controller();
 }
  
 public Controller() throws Exception{
 
  Arrow arrow = new Arrow();
  arrow.draw();
  Thread.currentThread().sleep(100);
  
  for(int i = 0; i < 10; i++)
  {
   arrow.erase();
   arrow.moveUp();
   arrow.draw();
   Thread.currentThread().sleep(100);
  }
 }
}//class
  