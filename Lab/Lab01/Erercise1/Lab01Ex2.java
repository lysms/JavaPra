class Lab01Ex2
{
 public static void main(String[] args)
 {
  Account account1 = new Account();
  Account account2 = new Account();
  Account account3 = new Account();
  
  account1.initialize("Jane");
  account1.deposit(100);
  
  //System.out.print("Account1: ");
  //account1.print();
  
  account1.withdraw(40);
  //System.out.print("Account1: ");
  //account1.print();
  
  account2.initialize("Fred");
  account2.deposit(200);
  //System.out.print("Account2: ");
  //account2.print();
  
  account2.withdraw(125);
  //System.out.print("Account2: ");
  //account2.print();
  
  account3.initialize("George");
  account3.deposit(50);
  
  account2.deposit(60);
  account1.withdraw(20);
  
  System.out.print("Account1: ");
  account1.print();//account1 final balance
  System.out.print("Account2: ");
  account2.print();//account2 final balance
  System.out.print("Account3: ");
  account3.print();//account3 final balance
 }
}
  
