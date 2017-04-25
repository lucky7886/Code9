package MathFactory;
import java.io.*;
public class PrimeFactors {
static int f=0;
	public static void main(String[] args)throws Exception {
BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int num = Integer.parseInt(m.readLine());
		int c=0;
		System.out.printf("Prime factors are: ");
		for(int i=1;i<=num;i++)
			if(num%i==0){
				c++;
			primeChecker(i);
			}
		System.out.printf("\nTotal factors: %d",c);
		System.out.printf("\nTotal Prime factors: %d",f);
	}
	private static void primeChecker(int y)
	{
		int c=0;
		for(int i=1;i<=y;i++)
			if(y%i==0)
		c++;
		if(c==2){
		f++;	
			System.out.printf("%d ",y);
	}
		}

}
