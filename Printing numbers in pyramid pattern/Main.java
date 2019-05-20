import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	  Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = 1;
      for(int rcount = 1;rcount <= n; rcount++)
      {
         for(int space = 1; space <= (n-rcount); space++)
         {
            System.out.print(" ");
         }
        for(int ccount = 1; ccount <= rcount; ccount++)
        {
           System.out.print(num +" " );
          num = num + 1;
        }
        
        System.out.print("\n");
      }
    }    
}