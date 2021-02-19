/**
 * TestEmployee
 * Class to test the Employee class and SalariedEmployee and HourlyEmployee sub classes.
 *
 * @author Pete Lutz
 * @version 9-14-2017
 */
public class TestEmployee {
   public static void main(String[] args) {
      SalariedEmployee emp1 = new SalariedEmployee(
         "George", "Johnson", 86700.00);
      HourlyEmployee emp2 = new HourlyEmployee(
         "Martha", "Bloomington", 45.25);
      
      System.out.println("YTD pay for " + emp1.getFirstName() + " " + emp1.getLastName() +
         " period 18 : " + emp1.getYTDPay(18));
         
      System.out.println("Weekly pay for " + emp2.getFirstName() + " " + emp2.getLastName() +
         " for 40.00 hours : " + emp2.getWeeklyPay(40.00));

      System.out.println("toString for emp1: " + emp1.toString());
      System.out.println("toString for emp2: " + emp2.toString());
      
      emp1.printStub(18);
      System.out.println();
      emp2.printStub(18);
   }
}
