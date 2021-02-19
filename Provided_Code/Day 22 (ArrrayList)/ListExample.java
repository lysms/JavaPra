import java.util.*;
public class ListExample {
   public static void main (String[] args) {
   
      ArrayList <String> list = new ArrayList<String>(); 
      ArrayList <Double> doub = new ArrayList<Double>();
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a String: ");
      String inStr = in.nextLine();
      
      do {
         list.add(inStr);
         System.out.print("Enter a String: ");
         inStr = in.nextLine();
      } while (!inStr.equals("end"));
      
      System.out.println("\nThe original list");
      for( String str : list) {
         System.out.println(str);
      }

      list.add("Added To the end");
      System.out.println("\nItem added to the end");
      for( String str : list) {
         System.out.println(str);
      }

      list.add(1, "Added at # 1");
      System.out.println("\nItem entered at position 1 (zero based)");
      for( String str : list) {
         System.out.println(str);
      }
      
      list.set(2,"Greer-Holden");
      System.out.println("\nItem replaced");
      for( String str : list) {
         System.out.println(str);
      }
      
      Double num1 = new Double(2.0);
      Double num2 = new Double("10.0");
      
      doub.add(num1);
      doub.add(num2);
      //Uses auto unboxing
      double tot = doub.get(0) + doub.get(1);
      System.out.println("\nsum of doubles = " + tot);

   }
}//class