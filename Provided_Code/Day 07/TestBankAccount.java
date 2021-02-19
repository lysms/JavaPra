public class TestBankAccount
{
 public static void main(String[] args)
 {
  BankAccount acct1;
  BankAccount acct2;
 
  acct1 = new BankAccount();
  System.out.println("acct1 initial value should be 0.0 Result: " + acct1.getBalance());
  
  acct2 = new BankAccount(200.00);
  System.out.println("acct1 initial value should be 200.0 Result: " + acct2.getBalance());
  
  acct1.deposit(100.0);
  System.out.println("acct1 deposit 100.0 value should be 100.0 Result: " + acct1.getBalance());
  
  acct2.deposit(50.0);
  System.out.println("acct2 deposit 50.0 value should be 250.0 Result: " + acct2.getBalance());
  
  acct2.withdraw(25.0);
  System.out.println("acct2 withdraw 25.0 value should be 225.0 Result: " + acct2.getBalance());
  
 }//main method

}//class