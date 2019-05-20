import java.util.Scanner;
class Main{
  public static int sum_of_number(int m)
  {
    int remainder =0;
    int count = 0;
    while(count <= m)
    {
      remainder = remainder + count;
      count++;
    }
    return remainder;
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int x = sum_of_number(n);
      System.out.println(x);
	}
}