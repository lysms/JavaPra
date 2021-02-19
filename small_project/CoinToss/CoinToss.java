public class CoinToss
{
 private int numOfToss;
 private int head;
 private int tail;
 private String[] array;
 private int length;
 private String name;
 
 public CoinToss(int _numOfToss)
 {
  array = new String[_numOfToss];
  head = 0;
  tail = 0;
  length = 0;
  for(int i = 0; i < array.length; i++)
  {
   double num = Math.random();
   if(num < 0.5)
   {
    array[i] = "t";
    tail = tail + 1;
   }
   else
   {
    array[i] = "h";
    head = head + 1;
   }
  }//loop
 }//Parameterized constructor
  
  public int getHead()
  {
   return head;
  }
  
  public int getTail()
  {
   return tail;
  }
  
 public int getLongestRun()
 {
  int count = 0;
  String outcome = "x";
  
  for(int i = 0; i < array.length; i++)
  {
   if(array[i] == "h")
   {
    count = count + 1;
   }
   else  
   {
    count = 0;
   }
   if(length < count)
   {
    length = count;
    outcome = "heads";
    name = outcome;
   }
  }
  count = 0;
  for(int j = 0; j < array.length; j++)
  {
   if(array[j] == "t")
   {
    count = count + 1; 
   }
   else  
   {
    count = 0;
   }
   
   if(length < count)
   {
    length = count;
    outcome = "tails";
    name = outcome;
   }
  }  
  
  return length;
 }//longestRun
 
 
 public String getOutcome()
 {
  return name;
 }
 
 
  
 public double getFractionOfHead()
 {
  double frHead = (double)getHead() / array.length;
  return frHead;
 }
 
 public double getFractionOfTail()
 {
  double frTail = (double)getTail() / array.length;
  return frTail;
 }
 
 public String getArray()
 {
  String hi = " " ;
  for(int i = 0; i < array.length; i++)
  {
   hi = hi + array[i];
  }
  return hi;
 }
  
  
}//class
 


 
 
