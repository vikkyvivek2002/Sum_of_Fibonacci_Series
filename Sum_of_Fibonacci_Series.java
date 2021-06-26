import java.util.Scanner;
public class Sum_of_Fibonacci_Series
{

	public static void main(String[] args)
	{
	    System.out.println("enter a number");
	    Scanner s = new Scanner(System.in);
	   int n = s.nextInt();
	   int a=0, b = 1; 
	   int sum =a+b, total=1;
	   
	     
	    for(int i=3;i<=n;i++)
	    {
	         sum = a +b;
	         total = sum+total;
	        a = b;
	        b = sum;
	    }
	    System.out.println("Total = " +total);
	}
	
}
