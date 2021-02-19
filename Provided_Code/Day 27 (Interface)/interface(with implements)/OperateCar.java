/**
 * Interface OperateCar
 *      based on example from: 
 *           https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html
 * @author Pete Lutz
 * @version 9-20-2017
 */
public interface OperateCar {

   // constant declarations for directions
   int LEFT = 1;
   int RIGHT = 2;

   // method signatures
   void setSpeed(double mph);
   int turn(int direction);
   int changeLanes(int direction);
   int turnSignalOnOff(int direction,
                  boolean signalOn);
}
