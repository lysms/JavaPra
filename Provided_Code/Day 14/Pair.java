public class Pair
{
 private double first;
 private double second;
 
 /**
  *  Constructs a pair
  * @param aFirst The first value
  * @param a Second The second value
  */
 public Pair(double aFirst, double  aSecond)
 {
  first = aFirst;
  second = aSecond;
  double sum = first + second;
  double difference = first - second;
  double product = first * second;
  double average = sum /2;
 }
 
  /**
  *  Computes the sum of the two values in the pair  
  * @return the sum of the first and second values 
  */
  public double getSum()
  {
   double sum = first + second;
   return sum;
  }
  
  public double getDifference()
  {
   double different = first - second;
   return different;
  }
  
  public double getProduct()
  {
   double product = first * second;
   return product;
  }
  
  public double getAverage()
  {
   double average = (first + second) / 2;
   return average;
  }
  
  public double getPositiveDistance()
  {
   double distance = Math.abs(first - second);
   return distance;
  }
  
  public double getMaximum()
  {
   double maximum = Math.max(first, second);
   return maximum;
  }
  
  public double getMinimum()
  {
   double minimum = Math.min(first, second);
   return minimum;
  }
 
 
 
 
 
}//class