public class ForEach {
   public static void main(String[] args) {
      
      String [] letters = {"A", "B", "C", "D"};
      
      for(String let : letters) {
         System.out.println(let);
      }
   
     for(int i = 0; i < letters.length; i++)
     {
      System.out.println(letters[i]);
     }
   }//main
}//class