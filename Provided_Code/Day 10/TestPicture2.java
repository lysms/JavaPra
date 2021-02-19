import java.util.*;
import java.awt.*;
public class TestPicture2
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  Picture2 pic2 = new Picture2();
  pic2.draw();
  
  //pic2.setNewColors();
  

  
  System.out.println("Press Enter to continue:");
  in.nextLine();
  pic2.setColors(Color.GRAY, Color.GREEN, Color.ORANGE); // overload method
  
  //pic2.setOrigColors();
  System.out.println("Press Enter to continue:");
  in.nextLine();
  pic2.setColors();
  
 }//main method
 
}//TestPicture class