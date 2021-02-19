/*
Course: ISTE-120
Author: Yanshen  Lin
Day 21 Decisions
Topic: Lab 07 Ex 2
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
   
	/**
		Get name of stock
		@return name of stock
	*/
	public String getName( )	{
		return name;
	}
	
	/**
		Get symbol of stock
		@return symbol of stock
	*/
	public String getSymbol( )	{
		return symbol;
	}
	
	/**
		Get price of stock
		@return price of stock
	*/
	public double getPrice( )	{
		return price;
	}
	
	/**
		Get number of shares
		@return number of shares
	*/
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
   
	/**
		Set price of shares
		@param newPrice price of shares
	*/
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
	
	/**
		Set number of shares
		@param newShares number of shares
	*/
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
}