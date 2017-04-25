package MathFactory;

public class PiCalculated {

	public static void main(String[] args) {
double sum = 0;

		for(int i=1,j=1;i<=100000000;i+=2)
		{
			if(j%2==0)
				sum-=(double)4/i;
			else
				sum+=(double)4/i;
			j++;
		}
		System.out.printf("The value of pi is: %.20f",sum);
		
		
	}

}
