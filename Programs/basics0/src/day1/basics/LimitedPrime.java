package day1.basics;

public class LimitedPrime {

	public static void main(String[] args) {

		
		int i=2;
		int c=0;
		while(i<=100000)
		{
			c=0;
			
			for(int q=1;q<=i;q++)
				if(i%q==0)
					c++;
			if (c==2)
				System.out.println(i);
			
			i++;
				
			
			
			
			
			
			
		}
		
		
		
		
	}

}
