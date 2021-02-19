public class Calculators
{
 private double accumulator;
 
 /**
   * This is a no-argument constructors that set the accumulator to 0
   * it run with new Calculator()
   */
 public Calculators()
 {
  accumulator = 0;
  
 }//constructor
 
 
/**
  * This is a accessor for accumulator
  * @param: accumulator is the inital value in the calculator is 0
  * @return: the value of accumulator
 */
 public double getAccumulator()
 {
  return accumulator;
 }
 
 /**
  * This method add the number into accumulator
  * @param value this is the value to be add to the accumulator
  */
 public void add(double num)
 {
  accumulator = num + accumulator;
 }
 
  /**
  * This method suntract the number from accumulator
  * @param value this is the value to be suntract from the accumulator
  */
 public void subtract(double num1)
 {
  accumulator = accumulator - num1;
 }
 
  /**
  * This method multiply the number with accumulator
  * @param value this is the value to be multiply with the accumulator
  */
 public void multiply(double num2)
 {
  accumulator = num2 * accumulator;
 }
 
  /**
  * This method divide the number into accumulator
  * @param value this is the value to be divide by accumulator
  * if the value is 0, then has print the error
  */
 public void divide(double num3)
 {
  if (num3 == 0)
  {
   System.out.println("ATTEMPT TO DIVIDE BY ZERO - IGNORED");
   return;
  }
  else
  {
   accumulator = accumulator / num3;
  }
 }
 
  /**
  * This method clear the number into accumulator
  * @param clear the value in accumulator and set acumulator to 0
  */
 public void clear()
 {
  accumulator = 0;
 }
 
  /**
  * This method is toString method
  * @param return the value in the accumulator
  */
 public String toString()
 {
  return "" + accumulator;
 }
 
 
}//class