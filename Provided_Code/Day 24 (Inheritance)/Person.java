public class Person
{
 private String name;
 private String address;
 private String phone;
 
 public Person(String inName, String inAddress, String inPhone)
 {
  name = inName;
  address = inAddress;
  phone = inPhone;
 }
 
 
 public String getName()
 {
  return name;
 }
 
 public void setPhone(String inPhone)
 { 
  phone = inPhone;
 }
 
 public String toString()
 {
  return name + " " + address + " " + phone;
 }

 
 
 
}