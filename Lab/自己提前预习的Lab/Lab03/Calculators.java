public class Calculators
{
 private double accumulator;
 
 public Calculators()
 {
  accumulator = 0;
  
 }//constructor
 
 public double getAccumulator()
 {
  return accumulator;
 }
 
 public void add(double num)
 {
  accumulator = num + accumulator;
 }
 
 public void subtract(double num1)
 {
  accumulator = accumulator - num1;
 }
 
 public void multiply(double num2)
 {
  accumulator = num2 * accumulator;
 }
 
 public void divide(double num3)
 {
  if (num3 == 0)
  {
   System.out.println("ATTEMPT TO DIVIDE BY ZERO - IGNORED");
  }
  else
  {
   accumulator = accumulator / num3;
  }
 }
 
 public void clear()
 {
  accumulator = 0;
 }
 
 public String toString()
 {
  String numberAsString = String.valueOf(accumulator);
  return numberAsString;
 }
 
 
}//class
