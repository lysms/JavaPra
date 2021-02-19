import java.util.*;

public class ReportN
{
 public static void main(String[] args)
 {
  Scanner kb =  new Scanner(System.in);
  int count = 0;
  while(count != 3)
  {
   System.out.print("Enter student's name: ");
   String name = kb.nextLine();
   System.out.print("Enter student's id: ");
   int id = kb.nextInt(); kb.nextLine();
   System.out.print("How many grade you need to enter: ");
   int num = kb.nextInt();
   Student stu = new Student(name, id);
     
   int grade = 0;
   while(grade != 3)
   {
    System.out.print("grade: ");
    int grade1 = kb.nextInt(); kb.nextLine();
    stu.addGrade(grade1);
    grade++;
   }
   System.out.println(stu.toString());
   count++;
  }
 }//main method
}//class