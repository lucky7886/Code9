package day23.basics;
import java.util.Scanner;
public class DivideByZeroNoExceptionHandling {

	
	public static int quotient(int numerator, int denominator)
	{
		
		
		return numerator/denominator;
		
		
	}
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter an integer numerator: ");
		
		int numerator = scanner.nextInt();
		
System.out.print("please enter an integer denominator: ");
		
		int denominator = scanner.nextInt();
		
		int result = quotient(numerator,denominator);
		System.out.printf("\nResult: %d = %d\n",numerator,denominator,result);
	}

}
