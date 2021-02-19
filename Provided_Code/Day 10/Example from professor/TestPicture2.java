import java.util.*;
import java.awt.*;

public class TestPicture2 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Picture2 pic = new Picture2();
      pic.draw();
      System.out.println("Press ENTER to continue:"); in.nextLine();
      pic.setColors(Color.GRAY, Color.GREEN, Color.ORANGE);
      System.out.println("Press ENTER to continue:"); in.nextLine();
      pic.setColors();      
      System.out.println("Press ENTER to continue:"); in.nextLine();
   }
}