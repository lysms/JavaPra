public class TestQuizCalculator
{
 public static void main(String[] args)
 {
  QuizCalculator stu1 = new QuizCalculator("Michael Chan");
  QuizCalculator stu2 = new QuizCalculator("James Smith");
  
  stu1.addScore(90.0);
  stu1.addScore(100.0);
  stu1.addScore(85.0);
  
  System.out.println(stu1.toString());
  
  stu2.addScore(79);
  stu2.addScore(85);
  stu2.addScore(96);
  
  System.out.println(stu2.toString());
 }
}
  
  