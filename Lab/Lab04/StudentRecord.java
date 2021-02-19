public class StudentRecord
{
 private Student stu;
 private Address addr;
 
 public StudentRecord(Student inStu, Address inAddr)
 {
  stu = inStu;
  addr = inAddr;
 }
 
 public StudentRecord(String inFirstName, String inLastName, int inId, double inGpa, String _street, String _city, String _state, int _zip)
 {
  stu = new Student(inFirstName, inLastName, inId, inGpa);
  addr = new Address(_street, _city, _state, _zip);
 }
 
 public String toString()
 {
  return stu.toString() + "\n" + addr.toString();
 }
 
 
}//class