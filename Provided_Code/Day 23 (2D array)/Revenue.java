public class Revenue
{
 public static void main(String[] args)
 {
  double total = 0.0;
  double ctotal = 0.0;
  double[] [] revenue = new double[5] [4];
  String[] row = new String[5];
  String[] column = new String[5];
  revenue[0] [0] = 2504.56; revenue[0] [1] = 2809.34; revenue[0] [2] = 3412.45; revenue[0] [3] = 3967.56;
  revenue[1] [0] = 4230.67; revenue[1] [1] = 4598.45; revenue[1] [2] = 6349.34; revenue[1] [3] = 5345.56;
  revenue[2] [0] = 3234.45; revenue[2] [1] = 3456.23; revenue[2] [2] = 4567.23; revenue[2] [3] = 4982.34;
  revenue[3] [0] = 9236.65; revenue[3] [1] = 9542.67; revenue[3] [2] = 10395.56; revenue[3] [3] = 11349.87; 
  revenue[4] [0] = 1337.67; revenue[4] [1] = 1598.34; revenue[4] [2] = 1967.33; revenue[4] [3] = 2897.45; 
  
  row[0] = "Textbooks";
  row[1] = "Mystery";
  row[2] = "Romance";
  row[3] = "Sci Fi";
  row[4] = "Self Improvement";
  
  column[0] = "1Q";
  column[1] = "2Q";
  column[2] = "3Q";
  column[3] = "4Q";
  column[4] = "Total";

  System.out.print("                ");
  for(int i = 0; i < column.length; i++)
  {
   System.out.printf("%10s" , column[i]);
  }
  System.out.println();
  
  for(int i = 0; i < revenue.length; i++)
  {
   System.out.printf("%-16s", row[i]);
   for(int j = 0; j < revenue[j].length; j++)
   {
    System.out.printf("%10.2f", revenue[i] [j]);
    ctotal = ctotal + revenue[i] [j];
   } 
   
   System.out.printf("%10.2f", ctotal);
   ctotal = 0.0;
   System.out.println();
  }
 
  System.out.println();
  
  
//Calculate the row final;
  for(int i = 0; i < row.length; i++)
  {
   total = total + revenue[i][0]; 
  }
  System.out.printf("Total:          %10.2f", total); 
  double tot = 0;
  tot = tot + total;
  total = 0.0;
  
   
  for(int i = 0; i < row.length; i++)
  {
   total = total + revenue[i][1]; 
  }
  System.out.printf("%10.2f", total);
  tot = tot + total; 
  total = 0.0;
  
  for(int i = 0; i < row.length; i++)
  {
   total = total + revenue[i][2]; 
  }
  System.out.printf("%10.2f", total); 
  tot = tot + total;
  total = 0.0;
  
  for(int i = 0; i < row.length; i++)
  {
   total = total + revenue[i][3]; 
  }
  System.out.printf("%10.2f", total); 
  tot = tot + total;
  
  System.out.printf("%10.2f", tot);
  
 }//main method
 

 
 
}//class