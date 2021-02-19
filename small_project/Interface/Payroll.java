import java.util.*;
public class Payroll
{
 public static void main(String[] args)
 {
  int choice;
  Scanner kb = new Scanner(System.in);
  int num = 0;
  int salariedNum = 0 ;
  int hourlyNum = 0;
  ArrayList<Company> payroll = new ArrayList<Company>();
  Salaried salariedEmp = new Salaried();
  Hourly hourlyEmp = new Hourly();
  
  while(true)
  {
   System.out.println("\nWhat do you want to do?" + "\n\t\t\t1  Create a new employee"
                      + "\n\t\t\t2  Set pay" + "\n\t\t\t3  Show weekly pay"
                      + "\n\t\t\t4  Show annual pay" + "\n\t\t\t5  Show summary"
                      + "\n\t\t\t6  Quit");
   System.out.print("\n==> ");
   choice = kb.nextInt();
   kb.nextLine();
   
   if(choice < 1 || choice > 6)
   {
    System.out.println("ERROR Bad option, please try again.");
   }
   else if(choice == 1)
   {
    while(true)
    {
     System.out.print("\nWhay type of employee would you like to create (salaried or hourly)? ");
     String type = kb.nextLine();
    
     if(type.equals("salaried"))
     {
       System.out.print("\nPlease enter the name: ");
       String name = kb.nextLine();
       salariedEmp.setName(name);
   
       System.out.print("\nPlease enter the social security number: " );
       String ssn = kb.nextLine();
       salariedEmp.setSsn(ssn);
   
       System.out.print("\nPlease enter the annual pay: ");
       double annualPay = kb.nextDouble();
       kb.nextLine(); 
       salariedEmp.setPay(annualPay);

       num = num + 1;
       salariedNum = salariedNum + 1;
       System.out.println("\n==> Employee " + num +" has been created.\n");
       payroll.add(salariedEmp);
       break;
     }//salaried
     else if(type.equals("hourly"))
     {
       System.out.print("\nPlease enter the name: ");
       String name = kb.nextLine();
       hourlyEmp.setName(name);
   
       System.out.print("\nPlease enter the social security number: " );
       String ssn = kb.nextLine();
       hourlyEmp.setSsn(ssn);
      
      while(true)
      {
       System.out.print("\nPlease enter the hourly rate of pay: ");
       double hourlyRate = kb.nextDouble();
       if(hourlyRate < 1)
       {
        System.out.println("\n***Please enter a number > 0.");
       }
       else
       {
        hourlyEmp.setPay(hourlyRate);
        break;
       }
      }
       
      while(true)
      {
       System.out.print("\nPlease enter the average number of hours worked per week: ");
       double hour = kb.nextInt();
       kb.nextLine();  
       if(hour < 1)
       {
        System.out.println("\n***Please enter a number > 0.");
       } 
       else
       {
        hourlyEmp.setAvgHoursPerWeek(hour);
        break;
       }
      } 
      num = num + 1;
      hourlyNum = hourlyNum + 1;
      System.out.println("\n==> Employee " + num +" has been created.\n");
      payroll.add(hourlyEmp);
      break;     
     }//hourly
     else
     {
      System.out.println("\n***Please enter either 'salaried' or 'hourly'.");
     }
     
   }//while ask salaried or hourly
      
  }//if choice = 1
  else if(choice ==2)
  {
   if(num > 1)
   {
    while(true)
    {
     System.out.print("\nWhich employee do you wish to use? ");
     int use = kb.nextInt();
     kb.nextLine();
     if(use < 1)
     {
      System.out.println("\n***ERROR Please enter an employee number from 1 to 2 ");
     }
     else
     {
      while(true)
      {
       System.out.print("\nHow much would you like to set the annual pay to? ");
       int annualPay = kb.nextInt();
       if(annualPay < 1)
       {
        System.out.println("\n***ERROR Please enter an amount > 0.");
       }
       else
       {
       salariedEmp.setPay(annualPay);
       break;
       }
      }
      break;
     }
    }//while
   } //if num > 1
   else
   {
    while(true)
    {
     System.out.print("\nHow much would you like to set the annual pay to? ");
     int annual = kb.nextInt();
     kb.nextLine();
     if(annual < 1)
     {
      System.out.println("\n*** ERROR Please enter an amount > 0");
     }
     else
     {
      salariedEmp.setPay(annual);
      break;
     }
   }//while
  }
     
  }//if choice == 2
  else if(choice == 3)
  {
   if(num > 1)
   {
    System.out.print("\nWhich employee do you wish to use (enter 1 to 2)? ");
    int weekly = kb.nextInt();
    if(weekly == 1)
    {
     System.out.printf("\nThe weekly pay is $%.2f\n" , salariedEmp.calcWeeklyPay());
    }
    else if(weekly == 2)
    {
     System.out.printf("\nThe weekly pay is $%.2f\n" , hourlyEmp.calcWeeklyPay()); 
    }
    
   }//if num > 1
   else
   {
    if(salariedNum == 1)
    {
     System.out.printf("\nThe weekly pay is $%.2f\n" , salariedEmp.calcWeeklyPay());
    }
    else
    {
     System.out.printf("\nThe weekly pay is $%.2f\n" , hourlyEmp.calcWeeklyPay());        
    }
   }
  }//if choice == 3
  else if(choice == 4)
  {
   if(num > 1)
   {
    System.out.print("\nWhich employee do you wish to use (enter 1 to 2)? ");
    int weekly = kb.nextInt();
    if(weekly == 1)
    {
     System.out.printf("\nThe annual pay is $%,.2f\n" , salariedEmp.calcAnnualPay());
    }
    else if(weekly == 2)
    {
     System.out.printf("\nThe annual pay is $%,.2f\n" , hourlyEmp.calcAnnualPay());   
    }
    
   }//if num > 1
   else
   {
    if(salariedNum == 1)
    {
     System.out.printf("\nThe annual pay is $%,.2f\n" , salariedEmp.calcAnnualPay());
    }
    else
    {
     System.out.printf("\nThe annual pay is $%,.2f\n" , hourlyEmp.calcAnnualPay());       
    }
   }
  }//if choice == 4
  else if(choice == 5)
  {
   /*System.out.print("\nWhich employee do you wish to use (enter 1 to 2)?");
   int use = kb.nextInt();
   if(use == 1)
   {
    System.out.println(salariedEmp.toString());
   }
   else if(use == 2)
   {
    System.out.println(hourlyEmp.toString());
   }
   else
   {
    System.out.println("\nInvalid Employee - please enter employee 1 or 2");
   }   
  }//if choice == 5*/
  if(num > 1)
   {
    System.out.print("\nWhich employee do you wish to use (enter 1 to 2)?");
    int use = kb.nextInt();
    if(use == 1)
    {
     System.out.println(salariedEmp.toString());
    }
    else if(use == 2)
    {
     System.out.println(hourlyEmp.toString());
    }
    else
    {
     System.out.println("\nInvalid Employee - please enter employee 1 or 2");
    }
   }//if num > 1
   else
   {
    if(salariedNum == 1)
    {
     System.out.println(salariedEmp.toString());
    }
    else
    {
     System.out.println(hourlyEmp.toString());      
    }
   }
  }//if choice == 5
  else 
  {
   break;
  }
  
 }//large while loop
   
   
 for(int i = 0; i < payroll.size(); i++)
 {
  System.out.println(payroll.get(i));
 }  
   
  
  
  
  
  
  
  
 }//main method
 
 
 
 
 
}//class