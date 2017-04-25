package MathFactory;

public class FactorialCalculator {

	public static void main(String[] args) {

		for(int counter = 0 ; counter<=19;counter++)
			System.out.printf("%d! = %d\n",counter,factorial(counter));
		
	}
	public static int factorial(int number)
	{
		if(number<=1)
			return 1;
		else
			return number*factorial(number-1);
	}

}
