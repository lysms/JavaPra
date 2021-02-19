public class Gpa
{
 private int[] credits;
 private String[] grades;
 private int numCourses;
 private int maxCourses;
 
 public Gpa(int _maxCourses)
 {
  credits = new int[_maxCourses];
  grades = new String[_maxCourses];
  maxCourses = _maxCourses;
  numCourses = 0; 
 }
 
 
 public void addCourse(int _credits, String _grade)
 {
   credits[numCourses] = _credits;
   grades[numCourses] = _grade;
   numCourses = numCourses + 1;
 }
  
  public int getCredits()
  {
   int sum = 0;
   for(int i = 0; i < credits.length; i++)
   {
    sum = credits[i] + sum;
   }
   return sum;
  }
  
  
  public void display()
  {
   for(int i = 0; i < credits.length; i++)
   {
    System.out.println(grades[i]);
   }
  }
  
  public static double letterToNumeric(String letterGrade)
  {
   int num;
   switch(letterGrade)
   {
    case "a":
      num = 4;
      break;
    case "A":
      num = 4;      
      break;
    case "b":
      num = 3;
      break;
    case "B":
      num = 3;
      break;
    case "c":
      num = 2;
      break;
    case "C":
      num = 2;
      break;
    case "d":
      num = 1;
      break;
    case "D":
      num = 1;
      break;
    case "f":
      num = 0;
      break;
    case "F":
      num = 0;
      break;
    default:
      num = -1;
  }
  return num;
 }


  public int getPoints()
  {
   int number = 0;
   int points = 0;
   for(int i = 0; i < grades.length; i++)
   {
    switch(grades[i])
    {
      case "a":
         number = 4;
         break;
      case "A":
         number = 4;      
         break;
      case "b":
         number = 3;
         break;
      case "B":
         number = 3;
         break;
      case "c":
         number = 2;
         break;
      case "C":
         number = 2;
         break;
      case "d":
         number = 1;
         break;
      case "D":
         number = 1;
         break;
      case "f":
         number = 0;
         break;
      case "F":
         number = 0;
         break;
      default:
         number = -1;
     }//switch 
     points = credits[i] * number + points;
   }//for loop
   return points;
  }
  
  public double calcGPA()
  {
   double gpa = 0.0;
   if(getCredits() == 0)
   {
    gpa = 0;
   }
   else
   {
    gpa = (double)getPoints() / getCredits();
   }
   return gpa;
  }
  
 
 
 
 
 
 
}//class 