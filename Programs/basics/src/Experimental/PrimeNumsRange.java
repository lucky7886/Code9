package Experimental;
import java.io.*;
public class PrimeNumsRange {

	public static void main(String[] args) throws Exception {

		BufferedReader m = new BufferedReader(new InputStreamReader(System.in)); 
	System.out.println("Enter a number");
	double j = Double.parseDouble(m.readLine());
	System.out.println("Enter another number");
	double x = Double.parseDouble(m.readLine());
	System.out.printf("Prime numbers between %.0f and %.0f are:\n",j,x);
	int c=0;
	while(j<=x)
	{
		c=0;
	for(int i=1;i<j;i++)
	{
		if(j%i==0)
			c++;
	if(c==2)
		break;
	}
	
	if(c==1)
		System.out.printf("%.0f, ",j);
	j++;
	}
}
}
