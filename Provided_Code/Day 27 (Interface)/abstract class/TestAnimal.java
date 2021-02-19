public class TestAnimal
{
 public static void main(String[] args)
 {
   Animal an = new Dog("Dog", "Bark, bark");
   
   System.out.println("This is a " + an.getName() + " and makes the sound " + an.getSound());
   
 }//main method
 
 
}//class