public class MonthlyRain {
	// One attribute for each month of the year
	private double jan, feb, mar, apr, may, jun;
	private double jul, aug, sep, oct, nov, dec;

	public MonthlyRain(double _jan, double _feb, double _mar,
		double _apr, double _may, double _jun,
		double _jul, double _aug, double _sep,
		double _oct, double _nov, double _dec) {

		jan = _jan; feb = _feb; mar = _mar; apr = _apr; may = _may; jun = _jun;
		jul = _jul; aug = _aug; sep = _sep; oct = _oct; nov = _nov; dec = _dec;
	}

	public double getRainFall(int monthNo) {
		switch(monthNo) {
         case 1: return jan; 
         case 2: return feb; 
         case 3: return mar; 
         case 4: return apr; 
         case 5: return may; 
         case 6: return jun; 
         case 7: return jul; 
         case 8: return aug; 
         case 9: return sep; 
         case 10: return oct; 
         case 11: return nov; 
         case 12: return dec;
		}
      return 0;
	} 

	public void setRainFall(int monthNo, double amount) {
		switch(monthNo) {
			case 1: jan = amount;
			case 2: feb = amount; 
			case 3: mar = amount; 
			case 4: apr = amount; 
			case 5: may = amount; 
			case 6: jun = amount; 
			case 7: jul = amount; 
			case 8: aug = amount; 
			case 9: sep = amount; 
			case 10: oct = amount; 
			case 11: nov = amount; 
			case 12: dec = amount;
		}
	}
	public String toString() {
		return String.format(
			"Jan %4.1f Feb %4.1f Mar %4.1f Apr %4.1f May %4.1f Jun %4.1f\n" +
			"Jul %4.1f Aug %4.1f Sep %4.1f Oct %4.1f Nov %4.1f Dec %4.1f",
         jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec);
	}
}