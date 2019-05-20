import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
      int num = 0;
      for (int rcount=1; rcount <= n; rcount++)
      {
         for (int ccount = 1; ccount <= n; ccount++)
         {
            
           System.out.print(rcount);
         }
        System.out.print("\n");
      }
	}
}