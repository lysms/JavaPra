public class BankAccount4 {
   private double balance;		// The amount of money in the account
   /**
    * Default constructor (constructor with NO parameters)
    * set the balance to 0.
    */
   public BankAccount4() {
      balance = 0.0;
   }

   /**
    * Parameterized constructor … this one with one double value.
    * Sets the balance to the value of the parameter.
    */
   public BankAccount4(double _balance) {
      balance = _balance;
   }
   // Methods
   /**
    * deposit – deposit an amount in the account.
    * @param amount the amount to deposit
    */
   public void deposit(double amount) {
      balance = balance + amount;
   }
   
   /**
    * withdraw – withdraw an amount from the account.
    * @param amount the amount to withdraw
    */
   public void withdraw(double amount) {
      balance = balance - amount;
   }
   
   /**
    * getBalance – retrieve the current balance of the account.
    * @return the current balance of the account.
    */
   public double getBalance() {
      return balance;
   }

}
