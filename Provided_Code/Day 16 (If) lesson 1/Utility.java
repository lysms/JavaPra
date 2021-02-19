public class Utility
{
 public static boolean oldEnoughToVote(int age)
 {
  if(age >= 18)
  {
   return true;
  }
  else
  {
   return false;
  }
 }
 
  public static boolean oldEnoughToDrink(int age)
  {
   if(age >= 21)
   {
    return true;
   }
   else
   {
    return false;
   } 
  }
  
  public static int smallest3(int a, int b, int c)
  {
   int small = Math.min(a , b);
   int smaller = Math.min(b, c);
   int smallest = Math.min(a, c);
   int number = Math.min(small, smaller);
   if(number > smallest)
   {
    return smallest;
   }
   else 
   {
    return number;
   }
  }
  
  public static boolean isLeapYear(int year)
  {
   int num = year%4;
   if(num <= 0)
   {
    return true;
   }
   else
   {
    return false;
   }
  }
}//class