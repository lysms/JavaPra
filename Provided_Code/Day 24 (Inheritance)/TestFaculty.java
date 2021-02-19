public class TestFaculty
{ 
 public static void main(String[] args)
 {
  //  Just a regular person
  
  Person p = new Person("Ed", "123 Sesame ST", "5854755361");
  System.out.println(p.toString());
  
  System.out.println(p.getName());
  
  p.setPhone("1239999999");
  
  System.out.println(p.toString());
  
  
  System.out.println();
  
  
  //  Faculty 
  
    
  Faculty c = new Faculty("Ed", "123 Sesame ST", "5854755361", "ISTE120");
  System.out.println(c.toString());
  
  System.out.println(c.getName());
  
  c.setPhone("1239999999");
  
  System.out.println(c.toString());
  
  
  
 }//main method
 
 
 
 
 
}//class