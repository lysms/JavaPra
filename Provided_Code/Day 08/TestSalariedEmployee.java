public class TestSalariedEmployee
{
 public static void main(String[] args)
 {
  SalariedEmployee emp1 = new SalariedEmployee("Smith", "John", 98520);
  SalariedEmployee emp2 = new SalariedEmployee("HaPPY", "Michael", 24600);
  
  System.out.println("YTD pay for " + emp1.getLastName() + " " + emp1.getFirstName() + " " + "period 18" + ": " + emp1.getYTDPay(18));
  System.out.println("YTD pay for " + emp2.getLastName() + " " + emp2.getFirstName() + " " + "period 18" + ": " + emp2.getYTDPay(18));
  
  System.out.println(emp1.toString());
  System.out.println(emp2.toString());
  
  emp1.printStub(18);
  
  emp2.printStub(18);
 }
}
  
  
  