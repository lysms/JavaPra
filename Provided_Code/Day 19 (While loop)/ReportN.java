import java.util.*;

public class ReportN {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.print("How many students? ");
      int nStu = in.nextInt(); in.nextLine();
      int count = 0;
      
      while(count != nStu) {
         System.out.println("Student" + (count+1) + " ");
         System.out.print("\tName: ");
         String name = in.nextLine();
         System.out.print("\tID: ");
         int id = in.nextInt(); in.nextLine();
         
         Student stu = new Student(name, id);
            
         int gradeCount = 0;
         while(gradeCount != 3) {
            System.out.print("\tGrade" + (gradeCount+1) + ": ");
            int grade = in.nextInt(); in.nextLine();
            stu.addGrade(grade);
            gradeCount++;
         }
         System.out.println(stu.toString());
         count++;
      }
   }
}