package Experimental;
import java.io.*;
public class ReversingDigits {

	public static void main(String[] args) throws Exception 
	{
	
BufferedReader n = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a number");
int x = Integer.parseInt(n.readLine());


		int ans = reverse(x);
		System.out.printf("Reverse of the number is %d",ans);
	
	
	
	}
	public static int reverse(int b)
	{
		int c=0;
		while(b!=0)
		{
			c=c*10+b%10;
			b=b/10;
			
		}
		return c;
		
		
		
	}

}
