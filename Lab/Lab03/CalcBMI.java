public class CalcBMI
{
 public static void main(String[] args)
 {
  Calculators weight = new Calculators();
  Calculators height = new Calculators();
  
  weight.add(145);
  weight.multiply(703);
  
  height.add(68.89);
  height.multiply(68.89);
  
  weight.divide(height.getAccumulator());
  System.out.println("Body Mass Index is " + weight);
 }
}