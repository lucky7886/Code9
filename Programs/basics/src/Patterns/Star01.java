package Patterns;
import java.util.Scanner;
public class Star01 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int c = input.nextInt();
		for(int i=0;i<=c;i++)
		{
			for(int j=0;j<=2*c;j++)
				System.out.print("* ");
		System.out.println();
		}
		
	}

}
