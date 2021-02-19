import java.awt.*;
public class Circles
{
 public static void main(String[] args)
 {
  Canvas canvas = new Canvas("Circles", 700, 700);
  int radiu = 20;
  int width = 320;

 /*for(int i = 1; i <= 50; i++)
  {
   
   Circle cir = new Circle(width, width, radiu);
   canvas.draw(cir);
   width = width - 5;
   radiu = radiu + 5;
  }*/
 
     for(int num = 0; num < 50; num++)
      { 
       System.out.println(num);
        Color color = null;
        switch(num % 5)
        {
         case 0:
           color = Color.BLUE;
           break;
         case 1:
           color = Color.GREEN;
           break;
         case 2:
           color = Color.RED;
           break;
         case 3:
           color = Color.BLACK;
           break;
         case 4:
           color = Color.ORANGE;
           break;
        }
      
     Circle cir = new Circle(width, width, radiu, color);
     canvas.draw(cir);
     width = width - 5;
     radiu = radiu + 5;
    }
  

 }//main method
}//class