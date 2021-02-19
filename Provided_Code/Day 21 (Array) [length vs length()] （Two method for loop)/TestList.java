import java.util.*;
public class TestList
{
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  System.out.print("Enter your name: ");
  String name = kb.nextLine();
  
  ShoppingList shop = new ShoppingList(name, 10);
  
  for(int i = 0; i < 10; i++)
  { 
   System.out.print("Enter an item for the lsit: ");
   String item = kb.nextLine();
   shop.addItem(item);
   if(item.equals(""))
   {
    break;
   }
  }
  System.out.println(shop.toString());
  
  //System.out.println(shop.toString());
 }
}
  