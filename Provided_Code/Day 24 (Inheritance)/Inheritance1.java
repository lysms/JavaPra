// Single Inheritance

class Employee
{
  float salary  = 400000;
}


public class Inheritance1 extends Employee
{
 int bonus = 10000;
 public static void main(String[] args)
 {
  Inheritance1 inh = new Inheritance1();
  System.out.println("Salary is " + inh.salary);
  System.out.println("Bouns is " + inh. bonus);
 }
}