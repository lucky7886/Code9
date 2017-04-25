package Experimental;
import java.io.*;
public class Gcd {

	public static void main(String[] args)throws Exception {

BufferedReader m = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a number");
int a = Integer.parseInt(m.readLine());

System.out.println("Enter another number");
int b = Integer.parseInt(m.readLine());

int ans = gcdCalc(a,b);
System.out.printf("The GCD of %d and %d is: %d",a,b,ans);
		
	}
	public static int gcdCalc(int x, int y)
	{
		int c=0;
		while(y!=0)
		{
		c=x%y;
		x=y;
		y=c;
			
		}
		return x;
		
		
	}

}
