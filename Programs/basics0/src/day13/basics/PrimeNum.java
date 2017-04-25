package day13.basics;

public class PrimeNum {

	private int num;
	public PrimeNum(int y)
	{
		num=y;
	}
	
	public void func()
	{
		
		int c=0;
		int n=2;
		while(n<=num)
		{
			if(num%n==0)
			{		
			fact(n);
				c++;
			}
			n++;
			
		}
		System.out.println();
		if(c==1)
			System.out.println("the number is prime");
		else
			System.out.println("the number is not prime");
		
		
	}
	public void fact(int g)
	{
		int c=0;
		int n=2;
		while(n<=g)
		{
			if(g%n==0)
			c++;
			
			n++;
				
			
		}
		if(c==1)
			
			print(g);
		
		
	}
	public void print(int u)
	{
		System.out.printf("%d, ",u);
		
	}
}
