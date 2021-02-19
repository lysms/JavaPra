public interface Company
{
 String companyName = "Super Employer Inc.";
 String companyAddress = "Rochester, NY";
 int weekPaid = 52;
 
 void setPay(double pay);
 
 default public double calcAnnualPay()
 {
  return 0.0;
 }
 
 default public double calcWeeklyPay()
 {
  return 0.0;
 }
}//class