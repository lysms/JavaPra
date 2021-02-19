import java.util.*;
public class TestTravelCost
{
 public static void main(String args[])
 {
  if(args.length < 10)
  {
   System.out.println("ERROR: Invalid number of command line arguments");
  }
  
  ArrayList<Double> lowest = new ArrayList<Double>();
  ArrayList<TravelCost> travel = new ArrayList<TravelCost>(); 
  ArrayList<Double> shortest = new ArrayList<Double>(); 
  
  int numMiles = Integer.parseInt(args[0]);
  double hotelCost = Double.parseDouble(args[1]);
  String destination = args[2];
  
  CarTravelCost car = new CarTravelCost(numMiles, hotelCost, destination);
  System.out.println(car.toString());
  travel.add(car);
  lowest.add(car.getTotalCost());
  shortest.add(car.getDuration());
  
  double duration = Double.parseDouble(args[3]);
  double travelFare = Double.parseDouble(args[4]);
  
  TrainTravelCost train = new TrainTravelCost(duration, travelFare, destination);
  System.out.println(train.toString()); 
  travel.add(train);
  lowest.add(train.getTotalCost()); 
  shortest.add(train.getDuration());
  
  
  String departureDate = args[6];
  String departureTime = args[7];
  String arrivalDate = args[8];
  String arrivalTime = args[9];
  double airFare = Double.parseDouble(args[5]);
  
  AirTravelCost air = new AirTravelCost(departureDate, departureTime, arrivalDate, arrivalTime, destination, airFare, hotelCost);
  System.out.println(air.toString());  
  travel.add(air);
  lowest.add(air.getTotalCost());
  shortest.add(air.getDuration());
  
  double low = 1000000;
  int index = 0;
  for(int i = 0; i < travel.size(); i++)
  {
   if(lowest.get(i) < low)
   {
    low = lowest.get(i);
    index = i;
   }
  }
  System.out.println("\nLOWEST COST: " + travel.get(index));
  
  
  
  double timeee = 1000000;
  int in= 0;
  for(int i = 0; i < travel.size(); i++)
  {
   if(shortest.get(i) < low)
   {
    low = shortest.get(i);
    in = i;
   }
  }
  System.out.println("SHORTEST DURATION: " + travel.get(in));
  
 }//main method
 
 
 
}//class