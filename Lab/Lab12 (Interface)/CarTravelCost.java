public class CarTravelCost implements TravelCost
{ 
 private int numMiles;
 private double hotelCost;
 private String destination;
 
 public String getDestination()
 {
  return destination;
 }
 
 public CarTravelCost(int numMiles, double hotelCost, String destination)
 {
  this.numMiles = numMiles;
  this.hotelCost = hotelCost;
  this.destination = destination;
 }
 
 public double getDuration()
 {
  return (double)numMiles / 65;
 }
 
 public double getLodgingCost()
 {
  double numDays = Math.floor(getDuration() / 8.0);
  return numDays * hotelCost;
 }
 
 public double getTotalCost()
 {
  return (numMiles * 0.45) + getLodgingCost() + AGENT_FEE;
 }
 
 public String toString()
 {
  return "Car travel to " + getDestination() + " will take " + String.format("%.2f" , getDuration())
         + " hours and cost $ " + String.format("%.2f", getTotalCost());
 }
 
}//class