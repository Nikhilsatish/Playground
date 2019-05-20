import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = 0;
      for(int rcount = 1;rcount <= n; rcount++)
      {
         for(int space = 1; space <= (n-rcount); space++)
         {
            System.out.print(" ");
         }
        for(int ccount = 1; ccount <= rcount+count; ccount++)
        {
           System.out.print("*");
        }
        count++;
        System.out.print("\n");
      }
      
	}
}