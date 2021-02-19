import java.util.*;
public class AirTravelCost implements TravelCost
{
 private String departureDate;
 private String departureTime;
 private String arrivalDate;
 private String arrivalTime;
 private String destination;
 private double airFare;
 private double hotelCost;
 
 private int year;
 private int month;
 private int dayOfMonth;
 private int hourOfDay;
 private int minute;
 
 
 private int year1;
 private int month1;
 private int dayOfMonth1;
 private int hourOfDay1;
 private int minute1;
 
 private GregorianCalendar departure;
 private GregorianCalendar arrive;
 
 public AirTravelCost(String departureDate, String departureTime, String arrivalDate, String arrivalTime, String destination, double airFare, double hotelCost)
 {
  this.departureDate = departureDate;
  this.departureTime = departureTime;
  this.arrivalDate = arrivalDate;
  this.arrivalTime = arrivalTime;
  this.destination = destination;
  this.airFare = airFare;
  this.hotelCost = hotelCost;

//departure
  year = Integer.parseInt(departureDate.substring(0,4));
  month = Integer.parseInt(departureDate.substring(4,6));
  dayOfMonth = Integer.parseInt(departureDate.substring(6,8));
  hourOfDay = Integer.parseInt(departureTime.substring(0,2));
  minute = Integer.parseInt(departureTime.substring(2,4));
 
//arrival 
  year1 = Integer.parseInt(arrivalDate.substring(0,4));
  month1 = Integer.parseInt(arrivalDate.substring(4,6));
  dayOfMonth1 = Integer.parseInt(arrivalDate.substring(6,8));
  hourOfDay1 = Integer.parseInt(arrivalTime.substring(0,2));
  minute1 = Integer.parseInt(arrivalTime.substring(2,4));
  
  
  departure = new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute);
  arrive = new GregorianCalendar(year1, month1, dayOfMonth1, hourOfDay1, minute1);
 }
 
 public String getDestination()
 {
  return destination;
 }

/*
 GregorianCalendar departure = new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute); 
 GregorianCalendar arrive = new GregorianCalendar(year1, month1, dayOfMonth1, hourOfDay1, minute1);
*/ 
 
 
 public double getDuration()
 {
  return (double)(arrive.getTimeInMillis() - departure.getTimeInMillis())/60000/60;
 }
 
 public double getLodgingCost()
 {
  return Math.floor(getDuration() / 24) * hotelCost;
 }
 
 public double getTotalCost()
 {
  return airFare + getLodgingCost() + AGENT_FEE; 
 }
 
 public String toString()
 {
  return "Air Travel to " + getDestination() + " will take " + String.format("%.2f", getDuration())
         + " hours and cost $ " + String.format("%.2f",getTotalCost());
 }

}//class