import java.util.*;
public class TestCoin
{
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  while(true)
  {
   System.out.print("Enter integer number ( >=2) coin tosses or 0 to Exit: ");
   int x = kb.nextInt();
  
   if(x == 0)
   {
    System.out.println();
    System.out.println("End of Program");
    System.exit(0);
   }
  
   CoinToss coin = new CoinToss(x);
   System.out.println("\nNumber of Coin Tosses = " + x);
   System.out.printf("Fraction of Heads = %.3f", coin.getFractionOfHead());
   System.out.printf("\nFraction of tail = %.3f", coin.getFractionOfTail());
   System.out.println("\nLongest run is " + coin.getLongestRun() + " " + coin.getOutcome());
   System.out.println("\n" + coin.getArray());
  }
  
 }
}