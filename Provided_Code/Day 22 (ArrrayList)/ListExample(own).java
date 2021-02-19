import java.util.*;
public class ListExample
{
 public static void main(String[] args)
 {
 
  ArrayList <String> list;
  list = new ArrayList <String>();
  
  ArrayList <Double> dou = new ArrayList <Double>();
  
  Scanner in = new Scanner(System.in);
  System.out.print("Enter a string: ");
  String inStr = in.nextLine();
  
  do
  {
   list.add(inStr);
   System.out.print("Enter a string: ");
   inStr = in.nextLine();
  }while(!inStr.equals("end"));
  
  for(String str : list)
  {
   System.out.println(str);
  }
  
  list.add("Added to the end");
  
  for(String str : list)
  {
   System.out.println(str);
  }
  
  list.add(1, "Added at # 1");
  
  for(String str : list)
  {
   System.out.println(str);
  }
  
    
 }//main method
 
}//class