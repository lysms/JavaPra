public class Easter
{
 private int month;
 private int day;
 private int year;
 private int a;
 private int b;
 private int c;
 private int d;
 private int e;
 private int g;
 private int h;
 private int j;
 private int k;
 private int m; 
 private int r; 
 
 public Easter(int _year)
 {
 
  year = _year;
  a = year % 19;
  b = (int)year / 100;
  c = year % 100;
  d = (int)b / 4;
  e = b % 4;
  g = (int)(8 * b + 13) / 25;
  h = (19 * a + b - d - g + 15) % 30;
  j = (int)c / 4;
  k = c % 4;
  m = (int)(a + 11 * h) / 319;
  r = (2 * e + 2 * j - k - h + m + 32) % 7;
 
  
 }//constructor

 public int getEasterSundayMonth()
 {
  month = (int)(h - m + r + 90) / 25;
  return month;
 }
 
 public int getEasterSundayDay()
 {
  day = (h - m + r + getEasterSundayMonth() + 19) % 32;
  return day;
 }
 
}//class