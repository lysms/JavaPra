/**
 * Class to test the Student class, Undergrad and Grad sub classes.
 *
 * @author Yanshen Lin
 * @version 11/12/2019
 * Homework 11
 */
import java.util.*;
public class StudentTest
{ 
 public static void main(String[] args)
 {
  Scanner kb = new Scanner(System.in);
  ArrayList<Student>enrollment = new ArrayList<Student>();
  int count = 0;
 while(true)
 {
  System.out.println("What type of student do you wish to enter?");
  System.out.println("          1. Undergrad");
  System.out.println("          2. Graduate");
  System.out.println("          3. Done");
  System.out.print("Choice: ");
  int choice = kb.nextInt();
  
  if(choice == 1)
  {
   System.out.print("Student name: ");
   kb.nextLine();
   String name = kb.nextLine();
   
   System.out.print("Student id: ");
   String id = kb.nextLine();
   
   System.out.print("Number of credits: ");
   int credits = kb.nextInt();
   
   System.out.print("Level: ");
   int level = kb.nextInt();
   
   Undergrad student1 = new Undergrad(name, id, credits, level);
   enrollment.add(student1);
   count = count + 1;
  }//if (undergrad)
  else if(choice == 2)
  {
   System.out.print("Student name: ");
   kb.nextLine();
   String name = kb.nextLine();

   
   System.out.print("Student id: ");
   String id = kb.nextLine();
   
   System.out.print("Number of credits: ");
   int credits = kb.nextInt();
   
   System.out.print("Research Area: ");
   kb.nextLine();
   String area = kb.nextLine();

   
   Grad student2 = new Grad();
   student2.setName(name);
   student2.setId(id);
   student2.setNumCredits(credits);
   student2.setResearchArea(area);
   
   enrollment.add(student2);
   count = count + 1;
  }//else if (grad)
  else if(choice == 3)
  {
   System.out.println();
   for(int i = 0; i < count; i++)
   {
    System.out.println(enrollment.get(i)); 
   }
   break;
    
   
   
   
  }//else if
  
 }//while true statement
  
  
  
  
  
 }//main method
 
}//class