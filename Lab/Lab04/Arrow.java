import java.awt.*;
public class Arrow
{
 private Canvas canvas;
 private Triangle head;
 private Rectangle shaft;
  
 public Arrow()
 {
  canvas = new Canvas("picture", 300, 700);
  shaft = new Rectangle(130, 565, 10, 100);
  head = new Triangle(110, 520, 50, 50, Color.RED,true);
 }
 
 public void draw()
 {
  canvas.draw(shaft);
  canvas.draw(head);
 }
 
 public void erase()
 {
  canvas.erase(shaft);
  canvas.erase(head);
 }
 
 public void moveUp()
 {
  shaft.setYInt(shaft.getYInt() - 50);
  head.setYInt(head.getYInt() - 50);
 }
 
}//class