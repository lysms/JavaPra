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
  
  
 
/* public int getLongestRun()
 {
  int run = 0;
  String outcome = "x";
  
  for(int i = 0; i < array.length; i++)
  {
   if(array[i] == "h")
   {
    run = run + 1;
   }
   else if(array[i] == "t")
   {
    length = run;//store the run number for head first
    run = 0;//reset the run number
    for(int j = i; j < array.length; j++)
    {
     if(array[j] == "t")
     {
      run = run + 1;
     }
     else 
     {
      if(length < run)
      {
       length = run;
      }
     }
     break;
    
      /*if(length < run)
      {
       length = run;
       outcome = "tail";
      }
      else
      {
       outcome = "head";
      }
     }
     break;
     
     
    }//second loop 
   }
  }//first loop
  name = outcome;
  return length;
 }*/
 
/* 
 public int getLongestRun()
 {
  int headRun = 0;
  int tailRun = 0;
  String outcome = "x";
  
  for(int i = 0; i < array.length; i++)
  {
   if(array[i] == "h")
   {
    headRun = headRun + 1;
   }
   else  
   {
    headRun = 0;
   }
   if(length < headRun)
   {
    length = headRun;
    outcome = "heads";
    name = outcome;
   }
  }
  
  for(int j = 0; j < array.length; j++)
  {
   if(array[j] == "t")
   {
    tailRun = tailRun + 1; 
   }
   else  
   {
    tailRun = 0;
   }
   
   if(length < tailRun)
   {
    length = tailRun;
    outcome = "tails";
    name = outcome;
   }
  }  
  
  return length;
 }//longestRun
*/ 


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
 


 
 