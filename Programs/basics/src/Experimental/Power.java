package Experimental;
import java.io.*;
public class Power {

	public static void main(String[] args) throws Exception{

	BufferedReader m= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the base of a number");	
	int a = Integer.parseInt(m.readLine());
	System.out.println("Enter the power of a number");	
	int b = Integer.parseInt(m.readLine());
	int ans=1;
	for(int i=1;i<=b;i++)
		ans=ans*a;
	System.out.printf("The answer is: %d",ans);
	
	}

}
