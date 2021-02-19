public class StudentScores {
   public static void main(String[] args) {
      for(int i = 1; i <= 4; i++) {
         System.out.print("Student" + i + " ");
         int grade = 0;
         switch(i) {
            case 1:
               grade = 80;
               break;
            case 2:
               grade = 90;
               break;
            case 3:
               grade = 75;
               break;
            case 4:
               grade = 50;
               break;
            }
            
         for(int j = 1; j <= grade; j++) {
            System.out.print('*');
         }
         
         System.out.println();
      }
   }
}