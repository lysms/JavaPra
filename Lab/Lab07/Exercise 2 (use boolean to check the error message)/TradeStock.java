import java.util.Scanner;
/*
Course: ISTE-120
Author: yANSHEN lIN
Day 21 Decisions
Topic: Lab 07 Ex 2
*/
public class TradeStock  {
	public static void main(String[] args)	{
		//declarations
		Scanner in = new Scanner(System.in);
		String name;	//Name of stock
		String symbol;	//Symbol of stock
		double price;	//price per share of stock
		int    shares;	//number of shares of stock
		
		//Get name and symbol
		System.out.print("Enter name of stock: ");
		name = in.nextLine( );
      
      Stock sto = new Stock();
      
      if(!sto.setName(name))
      {
       System.out.println("Invalid name - Must have at least one character.");
       System.exit(0);
      }
      
		System.out.print("Enter symbol of stock: ");
		symbol = in.nextLine( );
      
      if(!sto.setSymbol(symbol))
      {
       System.out.println("Invalid symbol - Must be between 3 and 6 characters, inclusively.");
       System.exit(0);
      }
		
		//Instantiat Stock object with price and symbol
		//Stock myStock = new Stock(name, symbol);
		
		//prompt user for price and set it
		System.out.print("Enter price of stock: ");
		price = in.nextDouble( );
		if(!sto.setPrice(price))
      {
       System.out.println("Invalid price - Must be greater than 0.0.");
       System.exit(0);
      }
		
		//prompt user for number of shares and set it
		System.out.print("Enter number of shares: ");
		shares = in.nextInt( );
	   if(!sto.setShares(shares))
      {
       System.out.println("Invalid number of shares - Must be between 10 and 1000, inclusively and a multiple of 10.");
       System.exit(0);
      }
		
		//print  stock info using spaces with each output
		System.out.printf("%nName:   %s%n" ,sto.getName());
		System.out.printf("Symbol: %s%n"  , sto.getSymbol());
		System.out.printf("Price:  %.2f%n", sto.getPrice());
		System.out.printf("Shares: %d%n"  , sto.getShares());
	}
}