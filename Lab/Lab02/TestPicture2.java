import java.util.*;
public class TestPicture2
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner(System.in);
  Picture2 pic2 = new Picture2();
  pic2.draw();
  
  //pic2.setNewColors();
  
  //pic2.setOrigColors();
  
  System.out.println("Press Enter to continue:");
  in.nextLine();
  pic2.setNewColors();
  
  System.out.println("Press Enter to continue:");
  in.nextLine();
  pic2.setOrigColors();
  
 }//main method
 
}//TestPicture class