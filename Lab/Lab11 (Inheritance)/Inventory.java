import java.util.*;
public class Inventory
{
 public static void main(String[] args)
 {
  ArrayList<Boat> inventory = new ArrayList<Boat>();
  ArrayList<Double> cost = new ArrayList<Double>();
  double total = 0;
  
  PowerBoat power1 = new PowerBoat("blue", 22, 60);
  inventory.add(power1);
  total = power1.calcPrice();
  cost.add(total);
  total = 0;
  
  SailBoat sail1 = new SailBoat("white", 18, 1);
  inventory.add(sail1);
  total = sail1.calcPrice();
  cost.add(total);
  total = 0;  
 
  SailBoat sail2 = new SailBoat("red", 42, 3);
  inventory.add(sail2);
  total = sail2.calcPrice();
  cost.add(total);
  total = 0;
  
  PowerBoat power2 = new PowerBoat("yellow", 35, 80);
  inventory.add(power2);
  total = power2.calcPrice();
  cost.add(total);
  total = 0;
  
  PowerBoat power3 = new PowerBoat("red", 50, 120);
  inventory.add(power3);
  total = power3.calcPrice();
  cost.add(total);
  total = 0;
   
  SailBoat sail3 = new SailBoat("blue", 33, 2);
  inventory.add(sail3);
  total = sail3.calcPrice();
  cost.add(total);
  total = 0;

  PowerBoat power4 = new PowerBoat("white", 14, 10);
  inventory.add(power4);
  total = power4.calcPrice();
  cost.add(total);
  
  for(int i = 0; i < inventory.size(); i++)
  {
   System.out.println(inventory.get(i));
  }


  double tot = 0;
  for(int i = 0; i < cost.size(); i++)
  {
   tot = tot + cost.get(i);
  }
  System.out.println("\nTotal price of all boats is $ " + String.format("%,.2f", tot));
  
  double largest = 0;
  int index = 0;
  for(int i = 0; i < inventory.size(); i++)
  {
   if(cost.get(i) > largest)
   {
    largest = cost.get(i);
    index = i;
   }
  }
  System.out.println("\nMost Expensive Boat: " + inventory.get(index));
 }//main method
 
 
}//class