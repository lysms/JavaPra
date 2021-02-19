/**
 * My drawing program
 * @author Yanshen Lin
 * @version 1.0
 */

import java.awt.*;
public class House
{
  public static void main(String[] args)
  {
   Canvas canvas = new Canvas("My House",400,400); //canvas
   
   Rectangle rec1 = new Rectangle(130,190,125,160,Color.RED);
   canvas.draw(rec1); //Rectangle 
   
   Rectangle door = new Rectangle(175,260,35,90,Color.BLUE);
   canvas.draw(door); //Door
   
   Line roof2 = new Line(315,240,190,140);
   canvas.draw(roof2); //roof
   
   Line roof1 = new Line(190,140,70,240);
   canvas.draw(roof1); //roof
   
   Circle sun = new Circle(300,50,25,Color.YELLOW,true);
   canvas.draw(sun);
   
  }
}
   
   