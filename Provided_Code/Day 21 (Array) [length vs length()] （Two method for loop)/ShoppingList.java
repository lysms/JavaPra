public class ShoppingList
{
 private String name;
 private String[] list;
 private int count;
 
 public ShoppingList(String _name, int size)
 {
  list = new String [size];
  count = 0;
  name = _name;
  int i = 0;
 }
 
 public int getSize()
 {
  return list.length;
 }
 
 public void addItem(String item)
 {
   list[count] = item;
   count = count + 1;
   if(count == getSize())
   {
    System.out.println("The list is full");
   }
  
 }
 
 public String getArray()
 {
  return list[0];
 }
 
 public String toString()
 {
  String shop = "";
  for (int i = 0; i < list.length; i++)
  {
   shop = shop + String.format("%n%s", list[i]);
  }
  return "\n" + name + "'s shopping list is:" + shop;
 }
 
 /*public String toString()
 {
  return name + "'s shopping list is:" + list[0];
 }*/
 
 
}