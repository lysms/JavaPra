/**
 * This is a program about calculator
 * @author Yanshen Lin
 * @version 1.0
 * Lab03
 */
public class TestCalculators
{
 public static void main(String[] args)
 {
  Calculators myCalc = new Calculators();
  double myWeight = 145;
  myCalc.add(myWeight);
  myCalc.multiply(0.453952);
  
  System.out.println("My weight is " + myWeight + "lb = " + myCalc + "kg");
  System.out.println(myCalc.toString());
  myCalc.divide(0.0);
  
  myCalc.clear();
  myCalc.add(22);
  myCalc.divide(7);
  System.out.println("pi = " + myCalc);
  
  myCalc.clear();
  myCalc.add(19540000);
  myCalc.divide(54556);
  System.out.println("The number of perople per square miles in NYS is " + myCalc);
  
  
  //slope
  Calculators numerator = new Calculators();
  numerator.add(4);
  numerator.subtract(2);
  
  Calculators denominator = new Calculators();
  denominator.add(4);
  denominator.subtract(2);
  
  numerator.divide(denominator.getAccumulator());
  System.out.println("The Slope is " + numerator);
 
 }
}