import java.util.Scanner;
class Main
{
  public static int square(int m)
  {
     int sqr = m * m;
    return sqr;
  }
  
	public static void main (String[] args)
    {
	   Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int x = square(n);
      System.out.println(x);
	} 
}