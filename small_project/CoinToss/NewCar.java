/**
  Name: Yanshen Lin
  Course: ISTE-120-02-03
  HW: #6
*/

public class NewCar
{
 String year;
 String make;
 String model;
 String description;
 String abbreviation;
 double finalPrice;
 double monthPay;
 
 public NewCar(String carYear, String carMake, String carModel)
 {
  year = carYear;
  make = carMake;
  model = carModel;
  description = year + " " + make + " " + model;
  abbreviation = year.substring(2,4) + make.charAt(0) + model.charAt(0);
  //finalPrice = 0;
  monthPay = 0;
 }//constructor
 
 public void calcFinalPrice(double sticker_price, double discount, double salesTaxRate)
 {
  double tax = ((sticker_price - discount) * salesTaxRate) / 100;
  finalPrice = sticker_price - discount + tax;
 }
 
 public double getFinalPrice()
 {
   return finalPrice;
 }
 
 public double calcZeroPctMonPayt(int month, double sticker_price, double discount, double salesTaxRate)
 {
  double tax1 = ((sticker_price - discount) * salesTaxRate) / 100;
  double finalPrice1 = sticker_price - discount + tax1;
  monthPay = finalPrice1 / month;
  return monthPay;
 }
 
 public String getCarName()
 {
  return description;
 }
 
 public String getAbbrev()
 {
  return abbreviation;
 }
 
 public String toString()
 {
  return"You want to purchase a " + "\"" + description + "\""+ " Abbreviation: " + "\""+ abbreviation + "\"" + "\nFinalprice: " + getFinalPrice();
 }
 
}//class