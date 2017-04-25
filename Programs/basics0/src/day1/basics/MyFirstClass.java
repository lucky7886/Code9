package day1.basics;
import java.util.Scanner;
public class MyFirstClass {
	
	private static final int max =20000000;
	public static void run()
	{
		
		for(int i=0;i<max;i++)
			System.out.println(i + "! = "+ factorial(i));
		
	}
	
public static double factorial(double y)
	{
		double result =1;
		for(int i=1;i<=y;i++)
			result*=i;
		return result;
		
	}

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	
run();	
		
	
	
	
	
	}

}
