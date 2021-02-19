public class MonthlyRain2 {
	// One attribute for each month of the year
	private double [] rainFall = new double[12];
   private String [] monthName = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                    "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   
	public MonthlyRain2(double _jan, double _feb, double _mar,
		double _apr, double _may, double _jun,
		double _jul, double _aug, double _sep,
		double _oct, double _nov, double _dec) {

		rainFall[0] = _jan; rainFall[1] = _feb; rainFall[2] = _mar;
      rainFall[3] = _apr; rainFall[4] = _may; rainFall[5] = _jun;
		rainFall[6] = _jul; rainFall[7] = _aug; rainFall[8] = _sep; 
      rainFall[9] = _oct; rainFall[10] = _nov; rainFall[11] = _dec;
	}

	public double getRainFall(int monthNo) {  // monthNo is 1 - 12
		if (monthNo < 1 || monthNo > 12) {
         return 0;
      }
      else {
         return rainFall[monthNo-1];
      }
   } 
   
   public String getMonthName(int monthNo) {
      if (monthNo >= 1 && monthNo <= 12) {
         return monthName[monthNo-1];
      } else {
         return "Invalid Month";
      }
   }
   
	public void setRainFall(int monthNo, double amount) { // monthNo is 1 - 12
		if (monthNo >= 1 && monthNo <= 12) {
         rainFall[monthNo-1] = amount;
      }      
  	}
   /*
	public String toString() {
		return String.format(
			"Jan %4.1f Feb %4.1f Mar %4.1f Apr %4.1f May %4.1f Jun %4.1f\n" +
			"Jul %4.1f Aug %4.1f Sep %4.1f Oct %4.1f Nov %4.1f Dec %4.1f",
         rainFall[0],rainFall[1],rainFall[2],rainFall[3],rainFall[4],rainFall[5],
         rainFall[6],rainFall[7],rainFall[8],rainFall[9],rainFall[10],rainFall[11]);

   }
   */
   public String toString() {
         String temp = "";
         int monIndex = 0;
         for (double rain : rainFall) {
            temp += String.format("%3s %4.1f ", monthName[monIndex], rain);
            monIndex++;
         }
         return temp;
   }

}