package Experimental;
import java.io.*;
public class SumOfDigitsToOneDigit {

	public static void main(String[] args) throws Exception {

		
BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
		
System.out.println("Enter a number");
int x = Integer.parseInt(m.readLine());

int e = sumToOne(x);
System.out.printf("Sum of the digits to one digit is: %d",e);
		
	}
	public static int sumToOne(int y)
	{
		int i;
		if(y==0)
			return 0;
		i = y%9;
		if(i==0)
			return 9;
		else return i;
		
	}

}
