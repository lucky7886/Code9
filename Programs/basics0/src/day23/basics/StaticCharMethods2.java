package day23.basics;
import java.util.Scanner;
public class StaticCharMethods2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter a radix");
		
		int radix = scanner.nextInt();
		
		System.out.printf("please choose one:\n1 -- %s\n2 -- %s\n","convert digit to character","convert character to digit");
		
		
		int choice = scanner.nextInt();
		
		
		switch(choice)
		{
		
		case 1:
			System.out.println("enter a digit");
		int digit = scanner.nextInt();
		System.out.printf("convert digit to character: %s\n",Character.forDigit(digit,radix));
		break;
		
		case 2:
			System.out.println("enter a character");
		char character = scanner.next().charAt(0);
		System.out.printf("convert character to digit: %s\n",Character.digit(character,radix));
		break;
		
		
		
		}
		
		
		
	}

}
