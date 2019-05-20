import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = 1;
      int sum = 1;
    
        while(count <= n)
        {
           sum = sum * count;
          count++;
        }
      
     System.out.println(sum);
      
	}
}