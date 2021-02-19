import java.util.*;
public class NewCarList
{
 private ArrayList<NewCar> carList;
 //private String car;
 
 public NewCarList()
 {
  carList = new ArrayList<NewCar>();
 }//constructor
 
 
 public void add(NewCar car)
 {
  carList.add(car);
 }
 
 public void display()
 { 
  /*int i = 0;
  System.out.println(carList.get(i).toString());
  i = i + 1;*/
  for(int i = 0; i < carList.size(); i++)
  {
   System.out.println(carList.get(i).toString());
  }
 }
 
 
 public int getSize()
 {
  return carList.size();
 }
 
 public void select(double maxPrice)
 {
  for(int i = 0; i < carList.size(); i++)
  {
   if(carList.get(i).getFinalPrice() <= maxPrice)
   {
    System.out.println(carList.get(i).toString());
   }
  }
 }
 
 public void drop(int index)
 {
  carList.remove(index);
 }
 
 
}//class