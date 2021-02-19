/**
 * This is a class for bank account
 * @author Yanshen Lin
 * @Version 1.0
 */
public class BankAccount
{
 //Attributes
 private double balance;
 private String name;
 private String accountName;
 
 /**
  * This is a no-argument constructors that sets the balance to 0
  * it run with new BankAccount()
  */ 
 public BankAccount()
 {
  balance = 0.0;
 }//Constructor
 
 
 /**
  * This is a no-argument constructors that receives an intial balance
  * it run with new BankAccount(inBalance)
  * @param inBalance this is the intial balance.
  */ 
  public BankAccount(double inBalance)
  {
   balance = inBalance;
  }//constructors
  
  
  /**
    * This is accessor for balance
    * @return the account balance
    */
 public double getBalance()
 {
  return balance;
 }//getBalance
 
 
 /**
    * This method deposits the amount in the account 
    * @param amount this is the amount to be deposited into the account
    */
 public void deposit(double amount)
 {
  balance = balance + amount;
 }


 /**
    * This method withdraw the amount in the account 
    * @param amount this is the amount to be withdrawed into the account
    */
 public void withdraw(double amount)
 {
  balance = balance - amount;
 }
  
 
}//class