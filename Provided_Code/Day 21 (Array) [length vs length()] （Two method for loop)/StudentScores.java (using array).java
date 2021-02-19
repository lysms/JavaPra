public class StudentScores
{
 public static void main(String[] args)
 {
  int[] grade = {80, 90, 75, 50};
  for(int i = 1; i <=4; i++)
  {
   System.out.print("Student" + i + " ");
   for(int j = 1; j <= grade[i-1]; j++)
   { 
    System.out.print('*');
   }
   System.out.println();
  }
 }
}