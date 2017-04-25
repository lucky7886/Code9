package day1.basics;
import java.util.Scanner;
class BasicCalculator {
	

	public static void main(String args[]) 
	{
	int d=0;
	Scanner input = new Scanner(System.in);
	
	double answer;
	while(d!=1)
	{
	
		System.out.println("enter first number");
		double num1=input.nextDouble();
		System.out.println("enter second number");
		double num2=input.nextDouble();
		System.out.println("press 1 for addition");
		System.out.println("press 2 for multiplication");
		System.out.println("press 3 for division");
		int a=input.nextInt();
		
		
		
		if(a==1)
		{
			answer=num1+num2;
			
			System.out.println(answer);
		}
		else if(a==2)
		{
			answer=num1*num2;
			System.out.println(answer);
		}
		else if(a==3)
		{
			answer=num1/num2;
			System.out.println(answer);
		}
	
	else
		d=1;
		
		}
	input.close();
	}
}