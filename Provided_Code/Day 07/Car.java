public class Car
{
 private String name;
 private String model;
 private int year;
 
 public Car(String carName, String carModel, int inYear)
 {
  name = carName;
  model  = carModel;
  year = inYear;
 }//constructor
 
 
 //Accessor
 public String getName()
 {
  return name;
 }
 
 public String getModel()
 {
  return model;
 }
 
 public int getYear()
 {
  return year;
 }
 
 //mutators
 
 public void setName(String carName)
 {
  name = carName;
 }
 
 public void setModel(String carModel)
 {
  model = carModel;
 }
 
 public void setYeat(int inYear)
 {
  year = inYear;
 }
 
 public String toString()
 {
  return "Your car is " + year + " " + name + " " + model;
 }
}//class