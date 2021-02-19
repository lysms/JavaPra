public class ChangeToAmount
{
 public static void main(String[] args)
 {
  int penniesPerNickel = 5;
  int penniesPerDime = 10;
  int penniesPerQuarter = 25;
  int penniesPerDollar = 100;
  
  int numberOfPennies = 3;
  int numberOfNickels = 3;
  int numberOfDimes = 5;
  int numberOfQuarters = 6;
  int numberOfDollar = 1;
  
  int pennies = numberOfPennies + numberOfNickels * penniesPerNickel + numberOfDimes * penniesPerDime + numberOfQuarters * penniesPerQuarter + numberOfDollar * penniesPerDollar;
  int dollar = pennies/100;
  int reminder = pennies%100;
  System.out.println("The total is " + pennies + " pennies whick is");
  System.out.println(dollar + " dollars and " + reminder + " cent");
 }
}