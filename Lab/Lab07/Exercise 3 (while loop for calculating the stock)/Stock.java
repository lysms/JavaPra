/*
Course: ISTE-120
Author: Yanshen Lin
Day 21 Decisions
Topic: Lab 07 Ex 3
*/
public class Stock  {
	private String name;		//name of company
	private String symbol;	//Symbol of company on Stock Exchange
	private double price;	//price per share
	private int    shares;	//number of shares
	
	/**
		Constructor with name and symbol
	*/
	public Stock(String newName, String newSymbol)	{
		name   = newName;
		symbol = newSymbol;
		price  = 0.0;
		shares = 0;
	}
	
   public Stock()
   {
    name = null;
    symbol = null;
   }
   
   
	public String getName( )	{
		return name;
	}
	
	public String getSymbol( )	{
		return symbol;
	}
	
	public double getPrice( )	{
		return price;
	}

	public int getShares( )	{
		return shares;
	}
	
   
   
   public boolean setName(String inName)
   {
    if(inName.length() > 0)
    {
     name = inName;
     return true;
    }
    else
    {
     return false;
    }
   }
   
   
   public boolean setSymbol(String inSymbol)
   {
    if(inSymbol.length() >= 3 && inSymbol.length() <= 6)
    {
     symbol = inSymbol;
     return true;
    }
    else
    {
     return false;
    }
   }

	public boolean setPrice(double newPrice)	{
      if(newPrice > 0.0)
      {
		 price = newPrice;
       return true;
      }
      else
      {
       return false;
      }
	}
	
	public boolean setShares(int newShares)	{
      if(newShares >=10 || newShares <= 1000)
      {
		 shares = newShares;
       return true;
      }
      else
      {
       return false;
      }
	}
   
   
   public double calcValue()
   {
    double value = getPrice() * getShares();
    return value;
   }
   
   public double calcCommission()
   {
    double commission = calcValue() * 0.01;
    if(commission > 500)
    {
     commission = 500;
    }
    return commission;
   }
    
   public double buy()
   {
    double cost = calcValue() + calcCommission();
    return cost;
   }
   
   public double sell()
   {
    double sell = calcValue() - calcCommission();
    return sell;
   }
   
   
}//class