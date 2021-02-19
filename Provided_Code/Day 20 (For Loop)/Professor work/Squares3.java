import java.awt.Color;

public class Squares3 {
   public static void main(String[] args) {
      Canvas canvas = new Canvas("Circles", 700, 700);
      
      int x = 105;
      int y = 320;
      int size = 20;
      
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
         
         Rectangle rec = new Rectangle(x, y, size, size, myColor);
         canvas.draw(rec);
         
         x -= 2;
         y -= 5;
         size += 10;
      }
   }
}