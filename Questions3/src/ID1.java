
public class ID1 {

	public static void main(String[] args) {

		int sum=0;
		int sum1=0;
		int sum2=0;
		
		for(int i=1;i<=1000;i++)
			if(i%3==0)
				sum+=i;
		
		for(int i=1;i<=1000;i++)
			if(i%5==0)
				sum1+=i;
		
		for(int i=1;i<=1000;i++)
			if(i%15==0)
				sum2+=i;
		
		System.out.println("Sum of multiples of 3 or 5 (for numbers less than 1000):- "+(sum+sum1-sum2));
		
	}

}
