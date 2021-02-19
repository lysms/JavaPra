public class TrainTravelCost implements TravelCost
{
 private double duration;
 private double travelFare;
 private String destination;
 
 public TrainTravelCost(double duration, double travelFare, String destination)
 {
  this.duration = duration;
  this.travelFare = travelFare;
  this.destination = destination;
 }
 
 public double getDuration()
 {
  return duration;
 }
 
 public String getDestination()
 {
  return destination;
 }
 
 public double getLodgingCost()
 {
  return 0.0;
 }
 
 public double getTotalCost()
 {
  return travelFare + AGENT_FEE;
 }
 
 public String toString()
 {
  return "Train Travel to " + getDestination() + " will take " + String.format("%.2f", getDuration())
         + " hours and cost $ " + String.format("%.2f",getTotalCost());
 }
 
 
 
 
}//class