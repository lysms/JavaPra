public class NewCarListTester
{
 public static void main(String[] args)
 {
  NewCar car1 = new NewCar("2010", "Kia", "Rio");
  NewCar car2 = new NewCar("2007", "Kia", "Rio");
  NewCar car3 = new NewCar("2004", "Honda", "Civic");
  NewCar car4 = new NewCar("2002", "Honda", "Civic");
  NewCar car5 = new NewCar("2010", "Chevrolet", "Cobalt");
  
  car1.calcFinalPrice(11000, 1000, 8);
  car2.calcFinalPrice(9000, 0, 8);
  car3.calcFinalPrice(6000, 0, 8);
  car4.calcFinalPrice(6000, 0, 8);
  car5.calcFinalPrice(12000, 2000, 8);
    
  NewCarList list = new NewCarList();
  list.add(car1);
  list.add(car2);
  list.add(car3);
  list.add(car4);
  list.add(car5);
  System.out.println("*** List of cars");
  list.display();
  
  
  
  System.out.println("\n*** List of cars under $9720");
  list.select(9720);
  
  
  System.out.println("\n*** Add three more cars and list");
  NewCar car6 = new NewCar("2000", "Honda", "Accord");
  NewCar car7 = new NewCar("2009", "Subaru", "Forester");
  NewCar car8 = new NewCar("2000", "Chevrolet", "Malibu");
  
  car6.calcFinalPrice(3000, 0, 8);
  car7.calcFinalPrice(22000, 0, 8);
  car8.calcFinalPrice(22000, 2000, 8); 
  
  list.add(car6);
  list.add(car7);
  list.add(car8); 
  
  list.display();
  
  
  
  
  System.out.println("\n*** Delete third item in the list");
  list.drop(2);
  list.display();
  
  
  
  
 }//main method
 
 
 
 
 
 
}//class