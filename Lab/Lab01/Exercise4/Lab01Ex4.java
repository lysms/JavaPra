import java.awt.*;
public class Lab01Ex4 {
   public static void main(String[] args) {
      Canvas canvas = new Canvas("Lab01Ex4 - Yanshen Lin", 500, 500);
      
      Rectangle rec1 = new Rectangle(20,100,300,100,Color.BLUE,true);
      canvas.draw(rec1);
      
      Rectangle rec2 = new Rectangle(20,200,95,10,Color.RED,true);
      canvas.draw(rec2);
      
      Rectangle rec3 = new Rectangle(210,200,260,10,Color.RED,true);
      canvas.draw(rec3);
      
      Rectangle rec4 = new Rectangle(330,110,80,100,Color.RED,true);
      canvas.draw(rec4);
      
      Rectangle rec5 = new Rectangle(410,160,60,50,Color.RED,true);
      canvas.draw(rec5);
      
      Rectangle rec6 = new Rectangle(340,120,60,30,Color.BLUE,true);
      canvas.draw(rec6);
      
      Circle cir1 = new Circle(20,210,25,Color.BLACK,true);
      canvas.draw(cir1);
      
      Circle cir2 = new Circle(70,210,25,Color.BLACK,true);
      canvas.draw(cir2);
      
      Circle cir3 = new Circle(210,210,25,Color.BLACK,true);
      canvas.draw(cir3);
      
      Circle cir4 = new Circle(265,210,25,Color.BLACK,true);
      canvas.draw(cir4);
      
      Circle cir5 = new Circle(420,210,25,Color.BLACK,true);
      canvas.draw(cir5);
      
      DrawableString name = new DrawableString("secret weapon", 120, 150, Color.WHITE);
      canvas.draw(name);


      
      
      
      
   }
}