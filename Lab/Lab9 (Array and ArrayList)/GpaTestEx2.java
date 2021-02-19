/*
Course: 4002-217
Author: Rayno Niemi
Lab 9 Exercise 2
Purpose: Test program for class Gpa to compute GPA of a student
	using standard points of A=4, B=3, C=2, D=1, and F=0
*/

import java.util.Scanner;

public class GpaTestEx2
{

	public static void main (String[] args)
	{
		//declarations
		Scanner in = new Scanner(System.in); //input object
		int numCourses;	//number of courses - can be changed
		int credits;		//number of credits for a course
		String grade;		//grade for course
		
		
		//read in number of courses
		System.out.print("Enter number of courses: ");
		numCourses = in.nextInt();
		
		//create Gpa object to hold specified number of courses
		Gpa myGPA = new Gpa(numCourses);
				
		//read in all courses and add course information to Gpa object
		for (int k=0; k<numCourses; k++)
		{
       while(true)
       {
			System.out.print("Enter credits for course " + (k+1) + ": ");
			credits = in.nextInt();
         if(credits < 0 || credits > 9)
         {
          System.out.println("Invalid number - number between 0 and 9, inclusively");
         }
         else
         {
          break;
         }
       }
       while(true)
       {
			System.out.print("Enter grade for course " + (k+1) + ": ");
			grade = in.next();
         if(myGPA.letterToNumeric(grade) == -1)
         {
          System.out.println("Invalid letter grade - letter grade entered by the user will be a single character with value A, B, C, D, or F (upper or lower case).");
         }
         else
         {
          break;
         }
		 }
			myGPA.addCourse(credits, grade);
		}//for loop
		
      /*System.out.println(myGPA.getCredits());
      myGPA.display();
      System.out.println(myGPA.getPoints());*/
      
      
		//print results
		System.out.println();
		System.out.printf("GPA is %4.2f%n", myGPA.calcGPA( )); 

	} //end main
}