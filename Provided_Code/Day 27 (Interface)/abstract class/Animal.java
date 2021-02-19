/**
 * Abstract Class Animal
 * Simple abstract class for any kind of animal
 * Based on version found at: 
 *    http://javapapers.com/java/java-abstract-class-and-methods/
 * @author Pete Lutz
 * @version 9-20-2017
 */
public abstract class Animal {
   private String name;
   
   public Animal(String _name) 
   { 
    name = _name; 
   }
   
   public String getName() 
   { 
    return name; 
   }
   
   public abstract String getSound();
}