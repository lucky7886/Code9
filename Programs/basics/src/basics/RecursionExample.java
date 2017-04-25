package basics;
import java.io.*;
public class RecursionExample {

	public static void main(String[] args)throws Exception {
BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number: ");
int x = Integer.parseInt(m.readLine());
System.out.printf("The factorial of the number is: %d",fact(x));

	}
	public static int fact(int n)
	{
		if(n==1)
			return 1;
		else
		{
			System.out.printf("(%d-1) is passed:\n",n);
			return n*fact(n-1);
		
		}
	}

}
