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
  //myCalc.divide(39);
  
  myCalc.clear();
  myCalc.add(22);
  myCalc.divide(7);
  System.out.println("pi = " + myCalc);
 }
}