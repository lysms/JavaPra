public class TestHourlyEmployee
{
 public static void main(String[] args)
 {
   HourlyEmployee emp1 = new HourlyEmployee("Lam", "Peter", 20, 100, 15);
   HourlyEmployee emp2 = new HourlyEmployee("Smith", "Michael", 50, 170, 15);
   
   System.out.println(emp1.toString());
   System.out.println(emp2.toString());
   
   emp1.setHoursWorkedLastWeek(70);
   emp2.setHoursWorkedLastWeek(90);
   
   System.out.println("After change the weekly hour for emp1 " + emp1.printCheck());
   System.out.println("After change the weekly hour for emp2 " + emp2.printCheck());
   
 }
} 
   
   