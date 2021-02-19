public class TestStudentRecord
{
 public static void main(String[] args)
 {
  Student stu1 = new Student("Bluestone", "Barbara", 23686, 2.8);
  Address addr1 = new Address("Main St.", "Any Town", "NY", 14539);
  System.out.println(stu1.toString());
  System.out.println(addr1.toString());
  
  
  System.out.println();
  
  StudentRecord stu2 = new StudentRecord("Brodericke", "Matthew", 39872, 3.5, "34 Worsted Pl", "NoPlaceVille", "UT", 29873);
  
  System.out.println(stu2.toString());
 }
}
  