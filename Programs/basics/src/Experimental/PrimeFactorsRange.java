package Experimental;
import java.io.*;
public class PrimeFactorsRange {
	public static void main(String[] args)throws Exception {
BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int num = Integer.parseInt(m.readLine());
		int c;
		int b=6;
	while(b<=num){
		System.out.printf("Prime factors of %d are: ",b);
		for(int i=1;i<=b;i++)
			if(b%i==0){
		
			primeChecker(i);
			}
		System.out.println();
	
	          b++;
	}
	}
	private static void primeChecker(int y)
	{
		int c=0;
		for(int i=1;i<=y;i++)
			if(y%i==0)
				c++;
		if(c==2){
		
		System.out.printf("%d, ",y);
	}
		}

}
