public class QuizCalculator
{
 private String studentName;
 private int numOfQuiz;
 private double scores;
 //private double average;
 
 public QuizCalculator(String inStudentName)
 {
  studentName = inStudentName;
  numOfQuiz = 0;
  scores = 0.0;
  //average = scores / numOfQuiz;
 }//constructor
 
 public void addScore(double newScore)
 {
  scores = newScore + scores;
  numOfQuiz = numOfQuiz + 1;
 }
 
 public double getAverage()
 {
  return scores / numOfQuiz;

 }
 
 public String toString()
 {
  return String.format(studentName + " quiz average:  %6.2f", getAverage());
 }
}//class 