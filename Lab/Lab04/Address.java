public class Address
{
 private String street;
 private String city;
 private String state;
 private int zip;


 public Address(String inStreet, String inCity, String inState, int inZip)
 {
  street = inStreet;
  city = inCity;
  state = inState;
  zip = inZip;
 }
 
 public String getStreet()
 {
  return street;
 }
 
 public String getCity()
 {
  return city;
 }
 
 public String getState()
 {
  return state;
 }
 
 public int getZip()
 {
  return zip;
 }
 
 public void setStreet(String inStreet)
 {
  street = inStreet;
 }
 
 public void setCity(String inCity)
 {
  city = inCity;
 }
 
 public void setState(String inState)
 {
  state = inState;
 }
 
 public void setZip(int inZip)
 {
  zip = inZip;
 }
 
 public String toString()
 {
  return street + "\n" + city + ", " + state + " " +zip;
 }
}//class