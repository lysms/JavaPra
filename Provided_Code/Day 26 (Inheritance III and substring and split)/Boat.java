public class Boat
{ 
 private String mfg;
 private int serialNumber;
 private int month;
 private int modelYear;
 private String modelName;
 private String type;
 private Motor motor;
 private String hullid;
 private int year;

 public Boat(String _hullid, String _model, String _type, Motor _motor)
 {
  hullid = _hullid;
  modelName = _model;
  type = _type;
  motor = _motor;
  if(hullid.length() == 12)
  {
   mfg = hullid.substring(0,3);
   serialNumber = Integer.parseInt(hullid.substring(3,8));
   
   switch(hullid.substring(8, 9))
   {
    case "A":
      month = 1;
      break;
    case "B":
      month = 2;
      break;
    case "C":
      month = 3;
      break;
    case "D":
      month = 4;
      break;
    case "E":
      month = 5;
      break;
    case "F":
      month = 6;
      break;
    case "G":
      month = 7;
      break;
    case "H":
      month = 8;
      break;
    case "I":
      month = 9;
      break;
    case "J":
      month = 10;
      break;
    case "K":
      month = 11;
      break;
    case "L":
      month = 12;
      break;
   }//switch statement
   
   modelYear = Integer.parseInt(hullid.substring(10,12));
   year = Integer.parseInt(hullid.substring(9));
   
  }//if statement
  else if(hullid.length() == 16)
  {
   String[] words = hullid.split(":", 5);
   mfg = words[0];
   serialNumber = Integer.parseInt(words[1]);
   switch(words[2])
   {
    case "A":
      month = 1;
      break;
    case "B":
      month = 2;
      break;
    case "C":
      month = 3;
      break;
    case "D":
      month = 4;
      break;
    case "E":
      month = 5;
      break;
    case "F":
      month = 6;
      break;
    case "G":
      month = 7;
      break;
    case "H":
      month = 8;
      break;
    case "I":
      month = 9;
      break;
    case "J":
      month = 10;
      break;
    case "K":
      month = 11;
      break;
    case "L":
      month = 12;
      break;
   }//switch statement
   year = Integer.parseInt(words[3]);
   modelYear = Integer.parseInt(words[4]);   
   
   
  }//else if statement
  
 }//constructor
 
 public String getHullid()
 {
  return hullid;
 }
 
 public String toString()
 {
  return "mfg: " + mfg + " serial: " + serialNumber + " month: " + month + " year: 200" + modelYear
         + "\nmodel: " + modelName + " type: " + type
         + "\nHullID: " + getHullid()
         + "\nMotor: " + motor;
 }
 
}//class 
