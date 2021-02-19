public class AddNumbers
{
 public static void main(String [] args)
 {
  
  int tot = 0;
  
  for (int i = 0; i < args.length; i++)
  {
   int num = Integer.parseInt(args[i]);
   System.out.printf("number %2d is %5d\n", i, num);
   tot += num;
  }
  System.out.printf("\nThis is the total: %5d\n", tot);
  
  
  for (int i = 1; i <= args.length; i++)
  {
   int num = Integer.parseInt(args[i - 1]);
   System.out.printf("number %2d is %5d\n", i, num);
   tot += num;
  }
  System.out.printf("\nThis is the total: %5d\n", tot);
 }//main method
 
 
 
}//class