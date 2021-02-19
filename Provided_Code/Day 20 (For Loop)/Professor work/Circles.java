import java.awt.Color;

public class Circles {
   public static void main(String[] args) {
      Canvas canvas = new Canvas("Circles", 700, 700);
      
      int x = 320;
      int y = 320;
      int radius = 20;
      
      for(int i = 0; i < 50; i++) {
         Color myColor = null;
         switch(i % 5) { 
            case 0:
               myColor = Color.BLUE;
               break;
            case 1:
               myColor = Color.GREEN;
               break;
            case 2:
               myColor = Color.RED;
               break;
            case 3:
               myColor = Color.BLACK;
               break;
            case 4:
               myColor = Color.ORANGE;
               break;
         }
         
         Circle circle = new Circle(x, y, radius, myColor);
         canvas.draw(circle);
         
         x -= 5;
         y -= 5;
         radius += 5;
      }
   }
}