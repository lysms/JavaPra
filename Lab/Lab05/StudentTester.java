import java.util.*;

public class StudentTester
{
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  
  //first Student
  System.out.println("What is the name for the first student?"); 
  String inName = kb.nextLine();
  
  System.out.println("What is the ID numbe for the first student?"); 
  int inId = kb.nextInt();
  
  Student stu1 = new Student(inName, inId);
  
  System.out.println("What is the first grade for this student?");
  int grade1 = kb.nextInt();
  stu1.addGrade(grade1);
  
  System.out.println("What is the second grade for this student?");
  int grade2 = kb.nextInt();
  stu1.addGrade(grade2);
  
  System.out.println("What is the third grade for this student?");
  int grade3 = kb.nextInt();
  stu1.addGrade(grade3);
  
  stu1.getAverage();
  
  
  
  // Second student
  System.out.println("What is the name for the Second student?");
  kb.nextLine(); 
  String _inName = kb.nextLine();
  
  
  
  System.out.println("What is the ID numbe for the Second student?"); 
  int _inId = kb.nextInt();
  
  Student stu2 = new Student(_inName, _inId);
  
  System.out.println("What is the first grade for this student?");
  int _grade1 = kb.nextInt();
  stu2.addGrade(_grade1);
  
  System.out.println("What is the second grade for this student?");
  int _grade2 = kb.nextInt();
  stu2.addGrade(_grade2);
  
  System.out.println("What is the third grade for this student?");
  int _grade3 = kb.nextInt();
  stu2.addGrade(_grade3);
  
  stu2.getAverage();
  
  //Third student
  
  System.out.println("What is the name for the third student?"); 
  kb.nextLine();
  String thirdName = kb.nextLine();
  
  
  System.out.println("What is the ID numbe for the Second student?"); 
  int thirdId = kb.nextInt();
  
  Student stu3 = new Student(thirdName, thirdId);
  
  System.out.println("What is the first grade for this student?");
  int firstGrade = kb.nextInt();
  stu3.addGrade(firstGrade);
  
  System.out.println("What is the second grade for this student?");
  int secondGrade = kb.nextInt();
  stu3.addGrade(secondGrade);
  
  System.out.println("What is the third grade for this student?");
  int thirdGrade = kb.nextInt();
  stu3.addGrade(thirdGrade);
  
  stu3.getAverage();
  
  
  System.out.println(stu1.toString());
  System.out.println(stu2.toString());
  System.out.println(stu3.toString());
 }
}