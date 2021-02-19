public class Problem
{
 public static void main(String[] args)
 {
  String name = "Big Part";
  int weight = 1818;
  double cost = 1200987.678;
  
  System.out.printf("Item %15s weight %5d cost %7.2f\n", name, weight, cost);
  System.out.printf("Item %6s weight %5d cost %7.2f\n", name, weight, cost);
  System.out.printf("Item %6.6s weight %5d cost %7.2f\n", name, weight, cost);
  System.out.printf("Item %-15s weight %5d cost %, 12.2f\n", name, weight, cost);
 }
}