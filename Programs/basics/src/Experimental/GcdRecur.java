package Experimental;
import java.io.*;
public class GcdRecur {

	public static void main(String[] args)throws Exception {

		
		BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a number");
		int a = Integer.parseInt(m.readLine());
		System.out.println("Enter another number");
		int b = Integer.parseInt(m.readLine());
		
		int ans = gcdCalc(a,b);
		System.out.printf("The GCD of %d and %d is: %d",a,b,ans);
	}

	
	public static int gcdCalc(int x,int y)
	{
		if(y==0)
			return x;
		else
			return gcdCalc(y,x%y);
		
		
		
	}
}
