public class Gpa
{
 private int sumCredits;
 private int sumWeightedPoints;
 
  
 public Gpa()
 {
  sumCredits = 0;
  sumWeightedPoints = 0;
 }
 
 public int getSumCredits()
 {
  return sumCredits;
 }
 
 public int getSumWeightedPoints()
 {
  return sumWeightedPoints;
 }
 
 public void addToTotals(String grade, int credit)
 {
  sumCredits = sumCredits + credit;
  sumWeightedPoints = getCalcPoints(grade) * credit + sumWeightedPoints;;
 }
 
 public double getCalcGpa()
 {
  double gpa = (double)getSumWeightedPoints() / getSumCredits();
  return gpa;
 }
 
 
 public int getCalcPoints(String _grade)
 {
  int number;
  switch(_grade)
  {
   case "a":
      number = 4;
      break;
   case "A":
      number = 4;      
      break;
   case "b":
      number = 3;
      break;
   case "B":
      number = 3;
      break;
   case "c":
      number = 2;
      break;
   case "C":
      number = 2;
      break;
   case "d":
      number = 1;
      break;
   case "D":
      number = 1;
      break;
   case "f":
      number = 0;
      break;
   case "F":
      number = 0;
      break;
   default:
      number = -1;
  }
  return number;
 }
 
 
 
 
}//class